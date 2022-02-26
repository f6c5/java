import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class craps extends JApplet implements ActionListener {

    
    final int WON = 0, LOST = 1, CONTINUE = 2;

    
    boolean firstRoll = true;  
    int sumOfDice = 0;         
    int myPoint = 0;   
    int gameStatus = CONTINUE; 

    
    JLabel die1Label, die2Label, sumLabel, pointLabel;
    JTextField die1Field, die2Field, sumField, pointField;
    JButton rollButton;

    
    public void init() {
        
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        
        die1Label = new JLabel("Die 1");
        container.add(die1Label);
        die1Field = new JTextField(10);
        die1Field.setEditable(false);
        container.add(die1Field);

        
        die2Label = new JLabel("Die 2");
        container.add(die2Label);
        die2Field = new JTextField(10);
        die2Field.setEditable(false);
        container.add(die2Field);

        
        sumLabel = new JLabel("Sum is");
        container.add(sumLabel);
        sumField = new JTextField(10);
        sumField.setEditable(false);
        container.add(sumField);

        
        pointLabel = new JLabel("Point is");
        container.add(pointLabel);
        pointField = new JTextField(10);
        pointField.setEditable(false);
        container.add(pointField);

        
        rollButton = new JButton("Roll Dice");
        rollButton.addActionListener(this); 
        container.add(rollButton);
    }


    public void actionPerformed(ActionEvent actionEvent) {
        
        if (firstRoll == true) {
            sumOfDice = rollDice(); 

            switch (sumOfDice) {

                
                case 7:
                case 11:
                    gameStatus = WON;
                    pointField.setText("");  
                    break;

                
                case 2:
                case 3:
                case 12:
                    gameStatus = LOST;
                    pointField.setText("");
                    break;

                
                default:
                    gameStatus = CONTINUE;
                    myPoint = sumOfDice;
                    pointField.setText(Integer.toString(myPoint));
                    firstRoll = false;
                    break;

            }

        }


        
        else {
            sumOfDice = rollDice();      

            
            if (sumOfDice == myPoint) 
                gameStatus = WON;
            else if (sumOfDice == 7)   
                gameStatus = LOST;
        }

        
        displayMessage();

    }  

    
    public int rollDice() {
        int die1, die2, sum;

        
        die1 = 1 + (int) (Math.random() * 6);
        die2 = 1 + (int) (Math.random() * 6);

        sum = die1 + die2;   

        
        die1Field.setText(Integer.toString(die1));
        die2Field.setText(Integer.toString(die2));
        sumField.setText(Integer.toString(sum));

        return sum;  


    }  

    
    
    public void displayMessage() {
        
        if (gameStatus == CONTINUE)
            showStatus("Roll again.");

           
        else {

            if (gameStatus == WON)
                showStatus("Player wins. " +
                        "Click Roll Dice to play again.");
            else
                showStatus("Player loses. " +
                        "Click Roll Dice to play again.");

            
            firstRoll = true;
        }
    } 

} 

import java.util.*;
public class main {
    public static void main(String[] args) {
        int i,k;
        int yildiz=1;
        
        for(k=0; k<6; k++) 
        {
            for (i=0; i <yildiz; i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
            
            yildiz = (i < 4) ? yildiz *2 : yildiz +2;
        }
  }
}


    
import java.util.Scanner;
public class rastgele_kisi {


    public static void main(String[] args) {

        

        
        int a=123;
        String[] ad = new String[a];
        String g="tamam";
        Scanner scan=new Scanner(System.in);

        System.out.println("isimleri gir: ");
        for(a=0;a<=123;a++){
            
            
            ad[a]=scan.nextLine();
            if(ad[a].equals(g)){
                break;
            }
            
        }
        
        int r=(int)(Math.random() * a);
        System.out.println("\nseçilen isim: "+ad[r]+"\n");

    }
    
}
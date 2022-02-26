import java.util.Scanner;
public class alfabetik_sira{
    public static void main(String[] args) {

        String temp;
        Scanner scan = new Scanner(System.in);
        int e=123;
        String str[] = new String[e];
        String g="tamam";
        int z=0;
        System.out.println("\nisimleri gir: \n");
        for(int i = 0; i < e; i++)
        {
            str[i] = scan.nextLine();
            if(str[i].equals(g)){
                break;
            }
            z=z+1;
            if(z>=e){
                break;
            }
        }
        scan.close();
        
        for (int i = 0; i < z; i++) 
        {
            for (int j = i + 1; j < z; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        
        System.out.print("\nisimlerin alfabetik sırası: \n\n");
        for (int i = 0; i <= z - 1; i++) 
        {
            System.out.print(str[i] + "\n");
        }
    }
}
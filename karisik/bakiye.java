import java.util.Date;
import java.util.Scanner;

public class bakiye {
        static int a=123;
        static int b=123;
        static int z=0;
        static String[] ad = new String[a];
        static String[][] mal = new String[a][b];
        static int[][] adet=new int[a][b];
        static int[][] fiyat=new int[a][b];
        static int[][] tutar=new int[a][b];
        static int[][] p_no=new int[a][b];
        static int[] top=new int[a];
        static int[] el=new int[a];
        static Object[][] zaman= new Object[a][b];

    public static void main(String[] args) {
        ana();
    }
    static void ana(){


        Scanner scan = new Scanner(System.in);
        int secim;
        System.out.println("müşteri eklemek için: 1\nsilmek için: 2\nhesabı görmek için: 3\nhesaba yazmak için: 4'e bas:\n");
        secim=scan.nextInt();
        
        switch (secim) {
            case 1:
                ekle();
                break;
            case 2:
                sil();
                break;
            case 3:
                hesap();
                break;
            case 4:
                hesaba_yaz();
                break;
            default:
                System.out.println("geçeresiz tuşa bastın !!!... \n");
                ana();
                break;
        }
    }
    static void ekle(){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("müşterinin adını gir\n");
        ad[z]=scan.next();  
        z=z+1;

        hesaba_yaz();
        
    }


    static void sil(){
        
        ana();
    }


    static void hesap(){
        Scanner scan = new Scanner(System.in);
        System.out.println("müşteriler: \n");
        
        for(int k=0;k<=z-1;k++){
            System.out.println(k+".__"+ad[k]+"\n");
        }

        System.out.println("seçilen müşterinin numarası: \n");
        int g=scan.nextInt();
        
        System.out.println("\n------------------------------------------------------******"+ad[g]+"******----------------------------------------------------------------------------------\n");
        System.out.println("                tarih                   |        p.no        |      cinsi       |       adedi       |       fiyat         |     tutar       \n");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for(int i=0;i<=el[g]-1;i++){
            
            System.out.println(zaman[g][i]+"---------------------"+p_no[g][i]+"-----------------"+mal[g][i]+"-----------------"+adet[g][i]+"-----------------"+fiyat[g][i]+"-----------------"+tutar[g][i]+"\n");

        }
        System.out.println("toplam tutar: "+top[g]+"\n");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        ana();
    }

    
    static void hesaba_yaz(){
        Scanner scan = new Scanner(System.in);

        System.out.println("müşteriler: \n");
        for(int k=0;k<=z-1;k++){
            System.out.println(k+".__"+ad[k]+"\n");
        }

        System.out.println("hesabına yazılacak müşterinin numarasını yaz: \n");
        int g=scan.nextInt();
        
        int y=el[g];
        System.out.println("ürünün adını gir\n");
        mal[g][y]=scan.next();
        System.out.println("parti no gir\n");
        p_no[g][y]=scan.nextInt();
        System.out.println("ürünün adedini gir\n");
        adet[g][y]=scan.nextInt();
        System.out.println("ürünü fiyatını gir\n");
        fiyat[g][y]=scan.nextInt();
        zaman[g][y]=new Date();
        tutar[g][y]=adet[g][y]*fiyat[g][y];
        top[g]=top[g]+tutar[g][y];
        el[g]=el[g]+1;
        ana();
    }


}

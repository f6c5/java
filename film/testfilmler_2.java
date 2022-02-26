import java.util.Scanner;

public class testfilmler_2 {
    static filmler_2 f[]=new filmler_2[3];
    static int e=f.length;
    static double x[]=new double[3];
    public static void main(String[] args) {
        
        ana();

    }


    static void ana(){
        Scanner oku=new Scanner(System.in);


        System.out.println("------------");
        System.out.println("filmleri gormek icin: 1 \nfilmlere puan vermek icin: 2\ncikis icin: 3 e \nbasiniz...");
        int s=oku.nextInt();

        switch (s) {
            case 1:
                film();
            break;
            case 2:
                kulpuan();
            break;
            case 3:
                System.out.println("\n**************************\n******  hoscakalın  ******\n**************************");
            break;
            default:
                System.out.println("gecersiz tusa bastiniz...");
                ana();
                break;
        }
    }


    static void kulpuan(){
        Scanner oku=new Scanner(System.in);
        filmler_2 f1 = new film1_2(x[0]);  
        filmler_2 f2 = new film2_2(x[1]);
        filmler_2 f3 = new film3_2(x[2]);

        f[0]=f1;
        f[1]=f2;
        f[2]=f3;
        System.out.println("\n------filimler------\n");
        for(int i=0; i<e;i++){
            int a=i+1;
            System.out.println("-------"+a+"-------");
            f[i].ad();
            f[i].kpuan();
            System.out.println("---------------\n");
        }

        System.out.println("puan vericeginiz filmin numarasini girin: ");
        int s=oku.nextInt();

            f[s-1].ad();
            System.out.println("vericeginiz puani girin: ");
            x[s-1]=oku.nextInt();
            
            System.out.println("tekrar puan vermek icin: 1 \nana menuye donmek icin: 2 \ncikmak icin 3 e \nbasin... ");
            int s2=oku.nextInt();
            switch (s2) {
                case 1:
                    kulpuan();
                break;
                case 2:
                    ana();
                break;
                case 3:
                    System.out.println("\n**************************\n******  hoscakalın  ******\n**************************");
                break;
                default:
                    System.out.println("gecersiz tusa bastiniz...");
                    ana();
                    break;
            }
            
                
    }


    static void film(){
        Scanner oku=new Scanner(System.in);
        filmler_2 f1 = new film1_2(x[0]);  
        filmler_2 f2 = new film2_2(x[1]);
        filmler_2 f3 = new film3_2(x[2]);

        f[0]=f1;
        f[1]=f2;
        f[2]=f3;
        System.out.println("\n------filimler------\n");
        for(int i=0; i<e;i++){
            int a=i+1;
            System.out.println("-------"+a+"-------");
            f[i].ad();
            System.out.println("---------------\n");
        }

        System.out.println("--------------------------------------------------------\n");
        System.out.println("hakkinda bilgi almak istediginiz filmin numarasini girin: ");
        int s=oku.nextInt();
        s=s-1;
        System.out.println("\n#################################################################################\n");
        f[s].ad();
        System.out.println("\n-------------------------------filmin konusu-----------------------------------\n");
        f[s].konu();
        System.out.println("\n-----------------------------filmin imdb puani---------------------------------\n");
        f[s].puan();
        System.out.println("\n----------------------------filmin cikis tarihi--------------------------------\n");
        f[s].yil();
        System.out.println("\n---------------------------filmin kullanici puani------------------------------\n");
        f[s].kpuan();
        System.out.println("\n#################################################################################\n\n");

        System.out.println("baska filmler hakkinda bilgi icin: 1 \nana menuye donmek icin: 2 \ncikmak icin: 3 e\nbasiniz...");
        int s2=oku.nextInt();
        switch (s2) {
            case 1:
                film();
            break;
            case 2:
                ana();
            break;
            case 3:
                System.out.println("\n**************************\n******  hoscakalın  ******\n**************************");
            break;
            default:
                System.out.println("yanlis tusa bastiniz!!! \nana menuye gonderiliyorsunuz...");
                ana();
                break;
        }

    }
}
package poly1;

import java.util.Scanner;
public class TestPolymorphism {
	public static void main(String args[]){
		Shape s[]=new Shape[3];

		Nokta n1=new Nokta(525,175);
		Daire d1=new Daire(250,400,5);
		Silindir s1=new Silindir(750,500,10,5);
	
		s[0]=n1;
		s[1]=d1;
		s[2]=s1;
	
            for (Shape item : s) {
                item.print();
                System.out.println("Alan:" + item.area());
            }
	
		Scanner scan=new Scanner(System.in);
		System.out.print("Nokta 0, Daire 1, ve Silindir icin 2 degerini giriniz:");
		int j=scan.nextInt();
		System.out.println("Sectiginiz Alan:"+s[j].area());
		scan.close();
	}

}

import java.util.Scanner;
public class TestBook {
	public static void main(String args[]){
		System.out.println("KitapSayisi:"+Book.getBookNumber());
		Book b1=new Book();
		b1.print();
		System.out.println("--------------------------------------------------\n");
		Book b2=new Book(157,"Madonna","Sabahattin Ali",30);
		b2.print();
		System.out.println("KitapSayisi:"+Book.getBookNumber());
		System.out.println("--------------------------------------------------\n");
		b1.setBook(199, "Hatiralar", "Orhan Veli", 25);
		b1.print();
		System.out.println("KitapSayisi:"+Book.getBookNumber());
		System.out.println("--------------------------------------------------\n");
		Book b3=new Book(227,"Cukurova","Orhan Kemal",35);
		b3.print();
		System.out.println("KitapSayisi:"+Book.getBookNumber());
		System.out.println("--------------------------------------------------\n");
		if(FiyatCompare(b2,b3)){
			System.out.println("ilk kitap daha pahali");
			System.out.println("--------------------------------------------------\n");
		}
		else{
			System.out.println("ilk kitap daha ucuz");
			System.out.println("--------------------------------------------------\n");
			System.out.println("KitapSayisi:"+Book.getBookNumber());
		}
		System.out.println("--------------------------------------------------\n");
		Roman r1=new Roman(123,"Yilanlarin Ocu","Fakir Baykurt",35,1);
		r1.print();
		System.out.println("--------------------------------------------------\n");
		BilimselKitap bk1=new BilimselKitap(525,"How to Program Java","Deitel",60,5);
		bk1.print();
		System.out.println("--------------------------------------------------\n");

		BookStore book[]=new BookStore[3];
		
		
		
		book[0]=b2;
		book[1]=r1;
		book[2]=bk1;
		
		createBook();

		for(int i=0; i<book.length; i++){
			book[i].print(); 
			System.out.println("-------------------\n");
	}
}
	public static Book createBook(){
		int id1;
		String y,i;
		double f;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Kitap id Gir:");
		id1=scanner.nextInt();
		System.out.print("Kitap ismi Gir:");
		i=scanner.next();
		System.out.print("Yaar ismi Gir:");
		y=scanner.next();
		System.out.print("Kitap fiyat Gir:");
		f=scanner.nextDouble();
		return new Book(id1,i,y,f);
	}
	public static boolean FiyatCompare(Book bx,Book by){
		if(bx.getFiyat()>by.getFiyat())
			return true;
		else
			return false;
	}
}
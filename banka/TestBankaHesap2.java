
public class TestBankaHesap2 {
	public static void main(String args[]){
		BankaHesap b1=new BankaHesap();  //Ge�erli nesne
		b1.print();
		BankaHesap b2;
		b2=new BankaHesap(389,"Ali Gun",2000);
		b2.print();
		
		BankaHesap b3=new BankaHesap(117,13000);
		b3.setIsim("Fatma Ant");
		b3.print();
		
		System.out.println("**********************");
		b2.paraEkle(4000);
		b2.print();
		b2.paraCek(3000);
		b2.print();
		
		b2.paraCek(5000);
		b2.print();
	}

}

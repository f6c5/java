
public class TestBankaHesap {
	public static void main(String []args){
		//Bu s�n�f bir s�n�flar�n nesnelerini ve metodlar�n� test  ama�l� kullanmak i�in yaz�ld�
	    //ilkin bir nesne yaratalim
		BankaHesap b1=new BankaHesap();
		b1.hesapAc(129, "Mehmet Demir", 5000.);
		b1.print();

		BankaHesap b2;
		b2=new BankaHesap();
		b2.hesapAc(177, "Ayse Guner", 8000);
		b2.print();
		b2.setBakiye(20000);
		b2.print();
		System.out.println("Mehmet Demir Bakiyesi:"+b1.getBakiye());
		System.out.println("********************************");
		b2.paraCek(5000);
		b2.print();
		b2.paraEkle(2000);
		b2.print();
		b2.paraCek(20000);
		b2.print();
	}

}

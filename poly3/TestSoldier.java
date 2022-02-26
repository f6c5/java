
public class TestSoldier {
	public static void main(String args[]){
		Soldier s1=new Soldier();
		Soldier s2=new Soldier(123,"Ali Kýrkgoz","Manisa");
		s1.print();
		s2.print();
		s1.setSoldier(555, "Ahmet Karaman", "Bursa");
		System.out.println("************");
		s1.print();
	//Miras Test
		System.out.println("****Miras Executing***");
		Officier o1=new Officier(877,"Mehmet Sari","Antalya","Albay");
		o1.print();
		OrdinarySoldier os1=new OrdinarySoldier(225,"Ahmet Altun","Istanbul");
		os1.print();
		System.out.println("****Polymorphism Executing****");
		//Adým 1:  Abstract sýnýfýn dizi elemanlarýný oluþturalým
		MySoldier ms[]=new MySoldier[3];  //3 elemanlý soyut sýnýf dizi elemanlarý
		//Adým 2: Alt sýnýf nesneleri oluþturulacak
		Soldier s5=new Soldier(333,"Fýrat Kalkan","Mardin");
		Officier o5=new Officier(999,"Kemal Murat","Ankara","General");
		OrdinarySoldier os5=new OrdinarySoldier(195,"Kaan Kara","Samsun");
		//Adým 3: alt sýnýf nesneleri soyut sýnýf dizi nesnelerine atanacak
		ms[0]=s5;
		ms[1]=o5;
		ms[2]=os5;
		//Adým 4: implementing polymorphism
		for(int i=0; i<ms.length; i++){
			ms[i].print();
			System.out.println("Rank:"+ms[i].getRank());
	}
  }
}

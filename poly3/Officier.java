
public class Officier extends Soldier {
	private String rank;  //rank rütbe anlamýnda ve ekstra eleman olarak eklendi
	
	public Officier(int id2, String n2,String c2,String r2){
		super(id2,n2,c2);  //Soldier sýnýf nesnesi yaratýlacak
		rank=r2;   //Officier nesne yaratýlacak
	}
	public void print(){
		System.out.println("Id:"+id+" Name:"+name+" City:"+city+" Rank:"+rank);
	}
	public String getRank(){
		return rank;
	}

}

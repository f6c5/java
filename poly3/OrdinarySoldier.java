
public class OrdinarySoldier extends Soldier{
	private static String rank="Erbas";
	
	public OrdinarySoldier(int id1,String n1,String c1){
		super(id1,n1,c1);
	}
	public void print(){
		System.out.println("Id:"+id+" Name:"+name+" City:"+city+" Rank:"+rank);
	}
	public String getRank(){
		return rank;
	}

}

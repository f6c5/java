
public class Soldier extends MySoldier{
	protected int id;
	protected String name,city;
	
	public Soldier(){
		id=0; name="nnnnn"; city="cccc";  //Fabrika ayarlarý
	}
	public Soldier(int id1,String n1, String city){
		id=id1;
		name=n1;
		this.city=city;
	}
	public void setSoldier(int id1,String n1, String city){
		id=id1;
		name=n1;
		this.city=city;
	}
	public String getName(){
		return name;
	}
	public void print(){
		System.out.println("Id:"+id+" Name:"+name+" City:"+city);
	}
	public String getRank(){
		return "BizimAsker";
	}
}


public class Daily extends Worker{
	protected int saat;
	protected double birimSaat;  //Birim saat ücret
	
	public Daily(String i, String d,int s, double b){
		super(i,d);
		saat=s;
		birimSaat=b;
	}
	public double getMaas(){
		return 30*saat*birimSaat;
	}
	public void print(){
		System.out.println("Ýsim:"+isim+" Department:"+department+" Maas:"+this.getMaas());
	}

}

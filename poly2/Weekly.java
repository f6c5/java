
public class Weekly extends Worker {
	protected int saat;
	protected double birimUcret;
	
	public Weekly(String i, String d,int s, double b){
		super(i,d);
		saat=s;
		birimUcret=b;
	}
	public double getMaas(){
		return 4*saat*birimUcret;
	}
	public void print(){
		System.out.println("Ýsim:"+isim+" Department:"+department+" Maas:"+getMaas());
	}

}

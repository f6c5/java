
public class Montly extends Worker {
	protected double maas;
	
	public Montly(String isim1, String d,double m){
		super(isim1,d);
		maas=m;
	}
	public double getMaas(){
		return maas;
	}
	public void print(){
		System.out.println("Ýsim:"+isim+" Department:"+department+" Maas:"+getMaas());
	}

}

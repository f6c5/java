
public abstract class Worker {
	public abstract double getMaas();
	public abstract void print();
	
	protected String isim, department;
	public Worker(String i, String d){
		isim=i;
		department=d;
	}

}

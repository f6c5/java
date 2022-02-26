package poly1;


public class Daire extends Nokta {
	protected int r;
	
	public Daire(int x2, int y2, int r2){
		super(x2,y2);
		r=r2;
	}
	public double area(){
		return pi*r*r;
	}
	public void print(){
		System.out.println("("+x+","+y+"),"+r);
	}
	public double cevre(){
		return 2*pi*r;
	}

}

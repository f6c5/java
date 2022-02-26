package poly1;


public class Silindir extends Daire {
	protected int h;
	
	public Silindir(int x3, int y3, int r3, int h3){
		super(x3,y3,r3);
		h=h3;
	}
	public double area(){
		return ((2*pi*r*r)+(2*pi*r*h));
	}
	public void print(){
		System.out.println("("+x+","+y+"),"+r+","+h);
	}
	public double volume(){
		return pi*r*r*h;
	}

}

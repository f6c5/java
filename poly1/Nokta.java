package poly1;


public class Nokta implements Shape {
	protected int x,y;
	
	public Nokta(int x1,int y1){
		x=x1; y=y1;
	}
	public double area(){
		return 0;
	}
	public void print(){
		System.out.println("("+x+","+y+")");
	}

}

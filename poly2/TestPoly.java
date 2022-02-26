
public class TestPoly {
	public static void main(String []args){
		Worker w[]=new Worker[3];
		
		Montly m1=new Montly("Ali Ay","IT",9000);
		Daily d1=new Daily("Fatma Gunes","Cay Hane",10,8);
		Weekly w1=new Weekly("Ayla Kum","Marketing",40,50);
		
		w[0]=m1;
		w[1]=d1;
		w[2]=w1;
		
		for(int i=0; i<w.length;i++){
			w[i].print();
			System.out.println("Maas:"+w[i].getMaas());
		}
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("***************");
		System.out.print("Montly 0, Daily 1, Weekly icin 2 giriniz: ");
		int j=scanner.nextInt();
		System.out.println("Maas:"+w[j].getMaas());
		
	}

}

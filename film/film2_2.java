public class film2_2 extends filmler_2 {

	public void ad() {
		System.out.println("oluler ordusu");
	}
	public void konu() {
		System.out.println("\nArmy of the Dead, Las Vegas’taki bir zombi salgını sırasında \nyaşananları konu ediyor. Bir adam salgın sırasında bir grup paralı \naskeri bir araya getirir ve büyük oynamaya karar verir.\nEkip, karantina bölgesine girmeye cesaret ederek gelmiş geçmiş \nen büyük soygunu gerçekleştirmeye çalışır.");
	}
	public double puan() {
		double p=6.0;
		System.out.println("\nfilmin imdb puani: "+p);
        return p;
	}
	public int yil() {
		int y=2021;
        System.out.println("\nfilmin cikis yili: "+y);
		return y;
	}
	public film2_2(double kp1) {
		super(kp1);
		kp=kp1;
	}
	public double kpuan(){
		
        System.out.println("\nfilmin kullanici puani: "+kp);
		return kp;
	}
}
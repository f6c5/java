public class film1_2 extends filmler_2 {

	public void ad() {
		System.out.println("the godfather");
	}
	public void konu() {
		System.out.println("\nBaba, 40’lar ve 50’lerin Amerika’sında, bir \nİtalyan mafya ailesinin destansı öyküsünü konu alıyor. \nDon Corleone’nin kızı Connie’nin düğününde, ailenin en küçük \noğlu ve bir savaş gazisi olan Michael babasıyla barışır. \nBir suikast girişimi, Don’u artık işleri yönetemeyecek duruma düşürünce, \nailenin başına Michael ve ağabeyi Sonny geçer. Danışmanları Tom Hagen’in de \nyardımlarıyla diğer ailelere savaş açan Corleone ailesi, eski \nmoda yöntemleri de değiştirmeye başlar.");
	}
	public double puan() {
		double p=9.1;
		System.out.println("\nfilmin imdb puani: "+p);
        return p;
	}
	public int yil() {
		int y=1972;
        System.out.println("\nfilmin cikis yili: "+y);
		return y;
	}
	public film1_2(double kp1) {
		super(kp1);
		kp=kp1;
	}
	public double kpuan(){
		
        System.out.println("\nfilmin kullanici puani: "+kp);
		return kp;
	}
}
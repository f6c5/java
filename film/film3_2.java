public class film3_2 extends filmler_2 {
	
	
	public void ad() {
		System.out.println("esaretin bedeli");
	}
	public void konu() {
		System.out.println("\nEsaretin Bedeli, Andy ve Red isimli iki mahkumun parmaklıklar \nardında kurdukları dünyanın hikayesini anlatıyor. \nAndy Dufresne, genç ve başarılı bir bankerdir. Karısını ve \nkarısının sevgilisini öldürmek suçundan yargılanır ve \nömür boyu hapis cezası alır. Shawsank Hapishanesi'nde \ndayak, işkence, tecavüz, her türlü durum yaşanmaktadır \nfakat Andy gene de hayata bağlı ve iyimserdir. Bu tutumu etrafındakileri \nde etkiler. Andy umutlu bakış açısıyla çevresindeki tüm mahkumları, \nparmaklıklar arkasında bile özgür bir yaşam olabileceğine inandırır. \nAndy'nin bu çabalarına ortak olacak bir arkadaşı da olacaktır");
	}
	public double puan() {
		double p=9.2;
		System.out.println("\nfilmin imdb puani: "+p);
        return p;
	}
	public int yil() {
		int y=1994;
        System.out.println("\nfilmin cikis yili: "+y);
		return y;
	}
	public film3_2(double kp1) {
		super(kp1);
		kp=kp1;
	}
	public double kpuan(){
		
        System.out.println("\nfilmin kullanici puani: "+kp);
		return kp;
	}
}
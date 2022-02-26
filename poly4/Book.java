public class Book extends BookStore {
	protected int id;
	protected String isim, yazar;
	protected double fiyat;
	private static int Book_Number=0;
	
	public Book(){
		id=0; isim="iiiiii"; yazar="yyyyy"; fiyat=0; Book_Number++;
	}
	public Book(int id1, String i, String y,double f){
		id=id1; isim=i; yazar=y; fiyat=f; Book_Number++;
	}
	public void setBook(int id1, String i, String y,double f){
		id=id1; isim=i; yazar=y; fiyat=f;
	}
	public void setFiyat(int fiyat){
		this.fiyat=fiyat;
	}
	public double getFiyat(){
		return fiyat;
	}
	public void print(){
		System.out.println("Id:"+id+" isim:"+isim+" Yazar:"+yazar+" Fiyat:"+fiyat);
	}
	public static int getBookNumber(){
		return Book_Number;
	}

}



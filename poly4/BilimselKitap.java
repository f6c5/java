
public class BilimselKitap extends Book{
	private int kitap_tipi;
	
	public BilimselKitap(int id1,String i,String y, double f, int t){
		super(id1,i,y,f);
		kitap_tipi=t;
	}
	public void print(){
		System.out.println("Id:"+id+" isim:"+isim+" Yazar:"+yazar+" Fiyat:"+fiyat+" Tip:"+kitap_tipi);
	}
	public double getFiyat(){
		return fiyat;
	}

}

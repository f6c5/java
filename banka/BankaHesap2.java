
public class BankaHesap {
    private int id;
    private String isim;
    private double bakiye;

    public BankaHesap() {
        id = 99999;
        isim = "xxxxx";
        bakiye = 0;
    }

    public BankaHesap(int id1, String isim1, double bakiye1) {
        id = id1;
        isim = isim1;
        bakiye = bakiye1;
    }

    public BankaHesap(int id1, double b1) {
        id = id1;
        bakiye = b1;
        isim = "zzzzzz";
    }

    public void setHesap(int id1, String isim1, double bakiye1) {
        id = id1;
        isim = isim1;
        bakiye = bakiye1;
    }

    public void print() {
        System.out.println("Id:" + id + " isim:" + isim + " Bakiye:" + bakiye);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setBakiye(double b) {
        bakiye = b;
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void paraEkle(double miktar) {
        bakiye = bakiye + miktar;
    }

    public void paraCek(double miktar) {
        if (bakiye >= miktar)
            bakiye = bakiye - miktar;
        else
            System.out.println("asnfdsfsdk");
    }

}

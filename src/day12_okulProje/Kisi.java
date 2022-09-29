package day12_okulProje;

public class Kisi { //bu class'ta ortak instance variable olucak

   private String adSoyad; //encapsule yaptik heryerden ulasilmasin
    private String kimlikNo;
    private int yas; //herkesin ortak ozelliklerini bu class'a toplariz.

    public Kisi(String adSoyad, String kimlikNo, int yas) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    } //kullansakta kullanmasakta cons olusturun

    public Kisi(){

    }
    //private oldugu icin intance variable'lar bu yuzden get ve set yaptik public gibi olsun diye

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}

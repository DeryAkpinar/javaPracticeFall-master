package day12_okulProje;

public class Ogretmen extends Kisi { //ogretmenin parenti kisi old icin extends yaptik
  //kisiden gelecek variable'lar var ogretmenden gelenler var ordan obje uretecegimiz icinde parent olarak ekleriz
    private String bolum;
    private String sicilNo;

    public Ogretmen(){ //parametrelideki default ezdigi icin sorun cikmamasi adina bos parametresiz olustururuz.


    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                '}' +super.toString(); // diger class'daki field'lari da getirmesini istiyoruz parenttakileri
        //super ile parenttekileri de toString ile getiriyoruz.
    }

}

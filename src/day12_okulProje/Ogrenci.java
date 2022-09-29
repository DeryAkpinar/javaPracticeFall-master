package day12_okulProje;

public class Ogrenci extends Kisi{ //kisiyi parent yaptik
  //const control edilecek daha sonra
    private String ogrenciNo; //kapsulledik erisimi sinirlandirmak icin
    private String sinif;

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrenciNo, String sinif) {//otomatik genereta ile constructor olusturduk
        super(adSoyad, kimlikNo, yas);//superin ustune ctrl ile tiklarsak geldigimiz yere geri goturur
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
    }

    public Ogrenci(){ //bos const olusturduk ariza cikarmasin diye :D

    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;}

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public String getOgrenciNo() {

        return ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }




    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrenciNo='" + ogrenciNo + '\'' +
                ", sinif='" + sinif + '\'' +
                '}' +super.toString();
        //(kisiyi parent yaptigimiz icin
        //ondaki ozellikleri de yazdirmasi icin super.toString ile getiririz. )
    }
}

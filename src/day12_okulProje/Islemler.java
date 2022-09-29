package day12_okulProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrtmnList = new ArrayList<>();
    //genel bilgilerimiz kisi class'inda oldugu icin hepsinin parenti oldugu icin. En genelde olanlari liste alip ekledik
    static List<Kisi> ogrnciList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    //static yazmamizin sebebi tum methodlardan ulasmak icin gokteki ay misali
    //gokteki ay gibi heryerden ulasabilelim
    static String kisiTuru;


    public static void girisPaneli() {
        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ"); //1'e basarsa
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");//2'ye basarsa
        System.out.println("Q- ÇIKIŞ");//Q'ya basarsa cikis gelicek

        String secim = scan.next().toUpperCase();
        //kullanici kucuk harf girse bile buyuk harfe cevirdik cunku kontrol buyuk harfle olucak

        switch (secim) { //yukaridan gelicek olan secim uzerinden case'ler yazilicak
            case "1":
                kisiTuru = "OGRENCI";//kullanici 1 girdiyse ekraninda herseyi ogrenci yazicak
                islemlerMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";//2'yi sectiginde burda islemler yapilica ve bunlari bir methodda
                // yapicaz islemlerMenusu methodunu olusturduk bunun icin
                islemlerMenusu();
                break;
            case "Q":
                break;

            default:
                System.out.println("Hatali giris yaptiniz.Tekrar deneyin.");
                girisPaneli();//giris paneli methodunu call yaptik.hatali giris yaptiginda giris paneline donus yapmasi icin
                //call olusturduk.Ve donguden cikmasi icin break attik.
                break;
        }

    }

    private static void islemlerMenusu() {
        System.out.println("sectigin kisi turu " + kisiTuru + "Lutfen asagidaki islemleri seciniz");


        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ"); //cikisi 0 aldik int data turu ile yapmak icin

        System.out.println("Islem tercihinizi giriniz :");
        int secilenIslem = scan.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle(); //ekle methodu cagirsin
                islemlerMenusu(); //method call ile islem menusune tekrar gider
                break;

            case 2:
                arama();
                islemlerMenusu();
                break;


            case 3:
                 listeleme();
                islemlerMenusu();
                break;


            case 4:
                silme(); //kaydini silen ogrenci ve ogretmenleri listeden silicez.
                islemlerMenusu();
                break;

            case 5:
                girisPaneli(); //anamenuye gonderdik
                break;

            case 0:
                 cikis();
                break;

            default:
                System.out.println("Duzgun giris yapiniz :)");
                islemlerMenusu();
                break;

        }
    }

    private static void cikis() {
        System.out.println(" Yine bekleriz okulumuza hoscakalin");

    }

    private static void silme() { //silme islemi de tc ile yapilacak
        System.out.println("****  " + kisiTuru + "  ekleme sayfasina hosgeldin");
        boolean flag=true;

        if (kisiTuru.equalsIgnoreCase("OGRENCI")){
            System.out.println("silmek istedigin kimlik no gir");

            String silinecekKimlikNo=scan.next().replaceAll(" ", "");

            for (Kisi each:ogrnciList) { //her birine git baktigim kimlik ogrenci listesinde var mi?
                if (each.getKimlikNo().equals(silinecekKimlikNo)){
                    System.out.println("silinen ogrenci = " +each.getAdSoyad());
                    ogrnciList.remove(each);//o ogrenciyi siler

                    flag=false; //ogrenciyi siler ve silmedim der bu yuzden false atariz.
                    break; //flag=false; kisminda hata verdigi icin break attik.

                }

                }if (flag){ // eger girilen tc list'te yok ise bu if calisir
                System.out.println("bu tc ile ogrenci yok silinemedi");

            }

            }else {//ogretmen islemleri icin kotnrol
            System.out.println("silinecek ogretmenin kimlik no'sunu girin");

            String silinecekKimlikNo = scan.next().replaceAll(" ", "");

            for (Kisi each : ogrtmnList) {
                if (each.getKimlikNo().equals(silinecekKimlikNo)) {
                    System.out.println("silinen ogretmen =" + each.getAdSoyad());
                    ogrtmnList.remove(each); //ogretmeni sildik remove sayesinde
                    flag = false;
                    break;

                }
            }
            if (flag) { //kullanicinin girdigi tc nu hicbir ogretmenle eslemedi
                System.out.println("bu tc ile ogretmen bulunamadi ve silinemedi");

            }
        }
    }

    private static void listeleme() {
        System.out.println("****  " + kisiTuru + "  ekleme sayfasina hosgeldin");
       if (kisiTuru.equalsIgnoreCase("OGRENCI")){
           System.out.println("ogrnciList =" +ogrnciList);

       }else {
           for (Kisi each:ogrtmnList) {
               System.out.println("each.toStrign() = " +each.toString());

           }
       }
    }

    private static void ekle() { //bu method hem ogrenci hem de ogretmen eklemek icin tasarlandi.

        System.out.println("****  " + kisiTuru + "  ekleme sayfasina hosgeldin");
        System.out.println(" isim soyisim gir"); //scanner en ustte static olarak ayarladigimiz icin tekrar yazmaya gerek yk
        scan.nextLine();
        String adSoyad = scan.nextLine();


        System.out.println(" kimlik gir");
        String kimlikNo = scan.nextLine();

        System.out.println(" yas gir");
        int yas = scan.nextInt();

        if (kisiTuru.equals("OGRENCI")) {
            System.out.println("Ogrenci no'sunu giriniz");
            String ogrenciNo=scan.next().replaceAll(" ","" );

            System.out.println("sinif gir");
            String sinif=scan.next().replaceAll(" ","");

            Ogrenci ogrenci=new Ogrenci(adSoyad,kimlikNo,yas,ogrenciNo,sinif); //parameter siralama onemli
            ogrnciList.add(ogrenci);

        } else {
            scan.nextLine(); //dummy hata almamak icin
            System.out.println("bolum gir(yani brans)");
            String bolum = scan.nextLine();

            System.out.println("sicil no gir");
            String sicilNo = scan.nextLine();

            //ogretmen class'indan obje alicaz. alacagimiz obje alt katmandan almaliyiz yukariya da gidebildigi icin

            Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);
            //parametreker const ile ayni sirada olmali cok onemliii
            ogrtmnList.add(ogretmen);
            System.out.println(ogrtmnList);


        }
    }

    private static void arama() {
        System.out.println("****  " + kisiTuru + "  ekleme sayfasina hosgeldin");
        boolean flag = true; //bayrak yukarda true olan her sart devam eder

        if (kisiTuru.equals("Ogrenci")) { //bu satirda ogrenci ariyorsa calisir

            System.out.println("kimlik no giriniz");

            String aranaKimlikNo = scan.next().replaceAll(" ", ""); //kullanici bosluk girerse diye boslugu hiclige cevirdik

            for (Kisi w : ogrnciList) {
                if (w.getKimlikNo().equals(aranaKimlikNo)) { //kullanicinin girdigi tc ile ogrenci listinde ki tc'lerden eslesen var mi?
                    System.out.println("Aradiginiz ogrenci " + w.getAdSoyad());
                    flag = false; //esitse islemi bitirmek icin false atadik
                }
            }

            if (flag) {//flag true ise hala b if body'si calisir. yani aranan tc ile ogrenci yok demektir.
                System.out.println("aranan tc no ile ogrenci yok");
            }//buraya kadar ogrenci icin

        } else { //ogretmen icin calisicak

            System.out.println("kimlik no giriniz");
            String aranaKimlikNo = scan.next().replaceAll(" ", "");

            for (Kisi w : ogrtmnList) {
                if (w.getKimlikNo().equals(aranaKimlikNo)) { //kullanicinin girdigi tc ile ogrenci listinde ki tc'lerden eslesen var mi?
                    System.out.println("Aradiginiz ogretmen " + w.getAdSoyad());
                    flag = false; //esitse islemi bitirmek icin false atadik
                   break;
                }
            }
            if (flag) {//flag true ise hala b if body'si calisir. yani aranan tc ile ogrenci yok demektir.
                System.out.println("aranan tc no ile ogretmen yok");
            }
          }
        }
    }


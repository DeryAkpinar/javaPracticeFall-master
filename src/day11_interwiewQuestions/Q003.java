package day11_interwiewQuestions;

import java.util.Scanner;

public class Q003 {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
   //bunu kart sifre kontrol de de kullabilirinisz

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sifre="erdal.bey123";
        int girisSayisi=3; //3 kere yanlis girerse kart bloke


        while(true){
            System.out.println("sifre gir");
            String girilenSifre= scan.nextLine();//kullanicidan aldik girilen sifreyi

            if (sifre.equals(girilenSifre)){
                System.out.println("sifren basarili dogru");
                break;
            }else {
                System.out.println("sifren yanlis");
                girisSayisi--; //yanlis girdiginde kalan giris hakki azalicak
                System.out.println("kalan giris hakkin = "+ girisSayisi);
            }
            if (girisSayisi==0){
                System.out.println("giris hakkin kalmadi kart bloke " +girisSayisi);
              break;
            }

        }
    }
}

package Oop_polomorphism;

public class Runner {
    public static void main(String[] args) {


        Civciv civciv1= new Civciv();

        Animal animal =new Civciv(); //parenttan child'e inmek icin data turunu Animal seceriz
        //farkli data turlerini alabilmek icin.

        Ordek ordek1= new Ordek();


        hayvanSesiCikar(civciv1); //cik cik diye ses cikardi
        //civciv class'inda sout yazildigi icin calisir tekrar sout yazmaya gerek yok.
         hayvanSesiCikar(ordek1);
    }

    public static void hayvanSesiCikar(Animal animal){
        animal.sesiCikar();

    }











}

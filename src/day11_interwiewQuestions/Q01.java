package day11_interwiewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    /*
    Kullanicidan bir String aliniz
    String'de var olan character'in sayisini ekrana yazdiriniz
    Ornek: yapacan==> a=3, y=1, p=1,n=1,c=1
    hallolur yaaa ==>
     */

    /*
    daha oncelikler Scanner obj olusturucaz
    oncelikler split methodu kullanicaz
    sonra sort yapcaz
    for loop a alcaz
    if ile control yapicaz ve sout ile yazdiricaz
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("bir string ifade giriniz ");
        String str = scan.nextLine();

        String arr[] = str.split(""); //Array sonuc verir split ve bosluklardan yani hiclikten  boler

        System.out.println("arr =" + Arrays.toString(arr));

        //sort() methodu kullaniyoruz

        Arrays.sort(arr); //siraladik
        System.out.println("arr nin sort kullanilmis hali =" + Arrays.toString(arr));

        int counter = 0;
        for (int i = 1; i < args.length; i++) {
            if (arr[i - 1].equals(arr[i])) {  //i=1 iken if icerisi-->0.index 1.index'e esit mi diye kontrol eder
                counter++;

            } else {
                System.out.println(arr[i - 1] + " karakteri " + (counter + 1));
                counter = 0;

            }
            if (i == arr.length - 1) {//yani for loop'ta en sona geldiginde son harfi kontrol ediyor.
                System.out.println(arr[i] + "karakteri " + (counter + 1));

            }
        }
    }
}
        /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
            hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
    */

    /*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string ifade giriniz ede");
        String str=scan.nextLine();
        String arr[]=str.split("");
        System.out.println("arr = " + Arrays.toString(arr));
        //sort() la
        Arrays.sort(arr);
        System.out.println("arr nin sortr lanmis hali = " + Arrays.toString(arr));
        int counter=0;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i-1].equals(arr[i])){
                counter++;
            }else{
                System.out.println(arr[i-1]+" karakteri "+(counter+1));
                counter=0;
            }if (i==arr.length-1){//yani for loop da en sona geldiginde
                System.out.println(arr[i]+" karakteri "+(counter+1));
            }

     */



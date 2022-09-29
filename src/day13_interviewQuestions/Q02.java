package day13_interviewQuestions;

public class Q02 {
 /*
    // Stringi ters cevirmek icin bir Java Programi yazin
   //1.Yol: StringBuilder () kullanarak
   //2.Yol: String Classini kullanarak
   //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
  ardindan methodu main methoddan cagirin odev olsun Q01 deki gibi recursive method ile yapicaz
  */

 public static void main(String[] args) {
     //1.Yol: StringBuilder () kullanarak
     String input="All is well";

     StringBuilder str=new StringBuilder();

     str.append(input);//string ifadeyi string builder'e cevirdik
     System.out.println(str);

     String tersInput=str.reverse().toString();//ters yazdirmak icin String Builder'in reverse methodu ile yapariz .
     // toString() ile stringe ceviririz.
     System.out.println("tersInput = " + tersInput);

     System.out.println("2.yol");
     int sonHarf=input.length()-1; //son harfi aldik

     for (int i =input.length()-1; i>=0 ; i--) {// son harfinden baslayip 0'a kadar gelicek
         System.out.print(input.charAt(i)); //her seferinde char ile her bir i.ci elementini al ve yazdir.




     }
     //3.yolu odev olarak yapiacazz



 }
}

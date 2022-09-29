package day13_interviewQuestions;

import static day8_practice.Q05_MDArray.elemanSayisi;

public class Q07 {
     /*
int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
verilen Array icinde
--> kac tane eleman oldugunu return eden methodu yazdiriniz
//cevap : 13 donsun
*/
     public static void main(String[] args) { //ilk basta multi dimensional array'lar oldugu icin ic ice for loop aklimiza gelmeli
          int arr[][] = {{7, 12, 97, 23}, {543, 23, 675}, {2}, {2, 33, 6, 3, 7}};

          System.out.println("elemanSayisi1(arr) = " + elemanSayisi1(arr));


     }

     private static int elemanSayisi1(int[][] arr) {
          int sayac = 0;
          for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr[i].length; j++) {
                    sayac++;//butun elementlerin arasinda gezicek ve her gezdiginde sayaci bir artiricak


               }


          }
          return sayac;

     }
}


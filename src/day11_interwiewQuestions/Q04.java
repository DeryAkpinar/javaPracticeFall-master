package day11_interwiewQuestions;

public class Q04 {
    public static void main(String[] args) {
        //normal toplama method'u ile varargs ile toplama methodu yaziniz


        int[] arr = {17, 23, 33, 9, 20};
        arrTopla(arr); //foreach ile toplayip gondericek
        System.out.println("arrTopla(arr) =" +arrTopla(arr));
        varargsToplaList(25,55,63,21,20);//fori ile toplasin
        varargsToplaArr(arr); //method'lari olusturduk
        System.out.println(varargsToplaArr(arr));
    //varargs array gibi davrandigi icin herhangi bir array'i parametre olarak verebiliriz


    }

    public static int varargsToplaArr(int... i) {
        int toplam = 0;
        for (int w : i) {
            toplam += w;

        }
        return toplam;
    }

    private static void varargsToplaList(int i, int i1, int i2, int i3, int i4) {
    }

    private static int arrTopla(int[] arr) {
        int toplam=0;
        for (int w:arr) {
            toplam+=w;//toplama ekle

        }
        return toplam;

    }
}

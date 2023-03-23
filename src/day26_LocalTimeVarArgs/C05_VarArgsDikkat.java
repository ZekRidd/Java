package day26_LocalTimeVarArgs;

import java.util.Arrays;

public class C05_VarArgsDikkat {
    public static void main(String[] args) {

        // Verilen sayılardan ilki haric diğerlerini toplasın
        // Sonra toplam ile ilk sayıyı çarpıp yazdırsın

        topla(2,3,4,5,6,7);

        /*
        Varargs kendinden sonra eklenen tüm elementleri parametre olarak alır
        Bu nedenle bir metotta parametre olarak varargs kullanılacaksa en son parametre olarak yazılmalıdır

        Bir metotta birden fazla varargs kullanılamaz.
         */


    }


   /*

        public static void topla(int... a) {
        System.out.println(Arrays.toString(a));

        int toplam = 0;

        for (int each: a
        ) {
            toplam += each;
        }
        System.out.println("Toplam : " + toplam);
    }
            İki metot için her ne kadar parametre sayısı farklı olsa da
            Varargs'ın yapısından dolayı int a, int... b ile
            int...b, int a arasında argüment kabulu anlamında fark yoktur.

    */

    public static void topla(int c, int... a) {
        System.out.println(Arrays.toString(a));

        int toplam = 0;

        for (int each: a
        ) {
            toplam += each;
        }
        System.out.println("Istenen Islem Sonucu : " + toplam*c);
    }
}

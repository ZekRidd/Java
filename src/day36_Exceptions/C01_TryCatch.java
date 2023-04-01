package day36_Exceptions;

public class C01_TryCatch {

    /*

        Kodlarımızı yazarken sorun oluşma ihtimalini gördüğümüzde kodları
        try-catch ve finally blokları ile çevreleriz.
     */

    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 0;

        try {
            System.out.println(sayi1/sayi2);
        } catch (ArithmeticException e) {
            // e.printStackTrace(); //exception da gördüğümüz tüm hata açıklamalarını yazdır
            System.out.println("Bölen sayı sıfır olamaz");
            // System.out.println(e.getMessage()); // hatanın kaynağını gösterir

            // System.out.println(e.getCause()); // null yazdırır
        }
    }
}

/*

        bir try catch 3 bölümden oluşur
        1- try blogu
        exception oluşturma potansiyeli olan kodları yazarız

        2- catch statement;
        ArithmeticException; karşılaşmasını ya da oluşmasını beklediğimiz exception
        e ; karşılaştığımız sorunu kaydedeceğimiz obje

        3- Catch blogu; öngörülen exception gerçekleştiğinde çalışmasını istediğimiz kodları içerir
 */
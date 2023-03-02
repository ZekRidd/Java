package day14_MethodOlusturmaWhileLoop;

public class C04_MetotOverloading {
    public static void main(String[] args) {

        /*
        Java overloading kuralları
        1-isim ve parametreleri aynı olan birden fazla metot oluşturulamaz
        2- data türleri farklı olan parametrelerin yerlerini değiştirirsek java yeni bir metot olarak kabul eder
        (int double yerine double int'e izin verir)

        Overloading olan class'larda
        Java hangi metotu çalıştıracağına şu şekilde bakar
        1-cagrılan isimde metot var mı ?
        2- metot call'da kullanılan parametre ile metotlardaki parametlerin %100 uyumlu olduğu metot var mı ?
        3- argüment ile parametre aynı olmasa bile verilen argümanları kabul edecek parametre var mı ?
        4- Casting ile birden fazla metotu kullanabiliyorsa daha az casting ile çalışan metotu uygular

         */


        topla(3,5);
        topla(3.2 ,4.1);

       //  topla("ali", "veli") CTE hatası verir, bu argümanları kabul edecek metot yok

        topla('a','b'); // iki int 195

        topla(3f , 4f); // iki double 7.0

        topla(3f , 4); // double ve int 7.0

    }

    public static void topla (int a , int b) {
        System.out.println("iki tamsayının toplamı: " + (a+b));
    }

    public static void topla (double a, double b) {
        System.out.println("İki double sayının toplamı : " + (a+b));
    }

    public static void topla (int sayi1, double sayi2) {
        System.out.println("int ve double sayıların toplamı : " + (sayi1+sayi2));

    }

    public static void topla (double sayi1, int sayi2) {
        System.out.println("double ve int sayıların toplamı : " + (sayi1+sayi2));

    }

}

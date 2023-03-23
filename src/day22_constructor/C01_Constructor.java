package day22_constructor;

public class C01_Constructor {
    public static void main(String[] args) {
        /*
        Bir obje ancak bir class'tan oluşturulabilir
        Objeyi oluşturduğumuz class, aynı zamanda o objenin data türüdür

        Her obje oluşturulduğu class'ın özellikelrini taşır

        Eğer bir programda ortak özelliklere sahip
        Objeler üretmek üzere tasarladığınız bir class varsa main metot ŞART değildir.
        Bu class'lar kalıphane gibi çalışır.
        Yani o class'dan aynı özelliklere sahip objeler üretmemizi sağlar

        Eğer biz istediğimiz parametrelere sahip bir contructor oluşturmazsak
        Java default değerlere sahip bir constructor kendiliğinden oluşturur

        Default constructor görünmez, parametresi yoktur. Constructor body'si boştur.

         */

        C02_Hemsire hemsire1 = new C02_Hemsire();
        System.out.println(hemsire1.mesaiUcretiHesapla(5));
    }
}

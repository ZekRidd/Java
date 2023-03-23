package day24_staticKeyword;

public class C01_staticBlocks {
    public static void main(String[] args) {


        System.out.println("Main metot çalıştı");

        System.out.println("=========");
        C01_staticBlocks obj = new C01_staticBlocks();
    }

    static {
        /*
        Statik bloklar class ilk çalışmaya başladığında çalışır
        Genel olarak class için gerekli ön ayarlamaları yapmak için kullanılır
         */
        System.out.println("Statik block çalıştı");
    }

    static {
        /*
        Birden fazla statik blok varsa yukarıdan aşağı doğru sıralı olarak çalışır.
         */
        System.out.println("Alttaki statik blok çalıştı");
    }

    {

        /*
        Statik olmayan bloklar ise obje oluşturulurken constructor'dan önce çalışır
        obje için yapılması gereken ön ayarları yapmak için kullanılır
         */
        System.out.println("Statik olmayan block çalıştı");
    }
}

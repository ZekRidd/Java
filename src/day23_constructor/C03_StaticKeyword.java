package day23_constructor;

public class C03_StaticKeyword {

    static String hastaneismi = "Yıldız Hastanesi";
    static String hastaneTelefonu = "23425343";
    static String bashekimismi = "Kemal Aydin";

    String perIsmi;
    String perAdresi;
    String perTelefonu;

    public static void main(String[] args) {

        C03_StaticKeyword per1 = new C03_StaticKeyword();
        System.out.println(per1.perIsmi); // null
        System.out.println(hastaneismi); // "Yıldız Hastanesi"




        C03_StaticKeyword per2 = new C03_StaticKeyword();
        per2.perIsmi="Doğan";
        System.out.println(per2.perIsmi); // Doğan
        System.out.println(per1.perIsmi); // null

        per2.bashekimismi="Sumeyra Gunel"; // Static variable'da yapılan değişiklik diğerlerini de kapsar
        System.out.println(per1.bashekimismi); // Sumerya Gunel yazdırır




        /*
        1- Static variable'lar  tüm class'lar için geçerlidir(class variable'da denir)
        2- Static variable'lar tüm objeler için aynı değeri taşıdıkları için
            her obje için ayrı oluşturulmaz. sadece 1 variable olur
        3- Static variable'lara ulaşmak veya update etmek için obje ismi kullanmaya
            gerek yoktur. Direkt ulaşılabilir.
            Başka class'tan static variable'a ulaşmak için classismi.staticvariableIsmi yazılır.
         */
    }
}

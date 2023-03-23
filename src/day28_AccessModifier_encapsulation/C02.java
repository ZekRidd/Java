package day28_AccessModifier_encapsulation;

public class C02 {
    public static void main(String[] args) {

        C01 obj = new C01();
        /*
        C01 obj = new C01();
        System.out.println(obj.a);
        System.out.println(C01.b);
        AccessModifier'dan dolayı a ve b'ye ulaşamayız. Çünkü PRIVATE olarak tanımlanmışlar.
        Sadece kendi class'ında kullanılabilirler.
        Obje kullanarak da ulaşamayız.
         */

        obj.str = "tava";
        // Obje üzerinden default olan değişkene ulaşabiliyoruz
        C01.s="TAVA"; //Static olduğu için sorun yok, sınıf üzerinden çağırabilirim
                    // Obje oluşturmama gerek yok

        C01.a=50;
        obj.d=40; //static olmadığı için obje üzerinden ulaştık
    }
}

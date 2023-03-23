package day28_AccessModifier_encapsulation;

public class C01 {

    String str; // Class level'daki her class üyesinin access modifier'ı olur
    // eğer görünmüyorsa Java default olarak tanımlar.
    static String s;
    private int b;
    private static int c;
    public static int a;

    public  int d;



    public static void main(String[] args) {

        int sayi = 10;
        // static int sayi1 = 10; yazılmaz

        /*
        Bir method içerisinde public, protected, private gibi accessmodifier'lar
        veya static keyword kullanılamaz.
         */

        // System.out.println(b); yukarıda static olarak tanımlanmadığı için main method içerisinden ulaşamayız
        System.out.println(c);

        // str = "Java"; Buna ulaşamayız çünkü static değil
        s = "Hava";

    }

    void method1(){
        System.out.println(b);
        System.out.println(c);
        // Her ikisini de ulaşabiliriz. Methodumuz static değil ve değerler private olarak tanımlandığı için
        // class içerisinde kullanabilirim

        str = "Java";
        s = "Hava"; // ikisine de ulaşabilirim çünkü method1 static değil
        // içerisinde static olmayan değişkenleri alabilir

        a=10;
        d=20; // method1 static olmadığı için her ikisini de kullanabilirim
    }
}

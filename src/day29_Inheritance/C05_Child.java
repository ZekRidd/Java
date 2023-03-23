package day29_Inheritance;

public class C05_Child extends C03_ParentClass {

    int c = 20;
    int a;

    String s = "Child Class";
    String m;

    public void method1(){
        System.out.println("Child Class Method çalıştı");
    }

    public static void main(String[] args) {

        // Child class'dan bir obje oluşturalım
        // ve özelliklerini yazdıralım

        C05_Child obj5 = new C05_Child();
        System.out.println(obj5.a); // 0 yazdırır

        System.out.println(obj5.c); // 20

        System.out.println(obj5.b); // Parent class'dan alır ve 0 yazdırır

        obj5.method1(); // daha özel olan Child class'daki method1 çalışır
    }
}

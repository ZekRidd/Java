package day14_MethodOlusturmaWhileLoop;

public class C03_MethodOverloading {
    public static void main(String[] args) {

        /* Bir class da aynı isme sahip farklı işlem yapan metotlar olabilir
        Java bu metotlardan hangisinin çalışacağına parametrelerine göre karar verir

        Bir class'da ismi aynı, parametreleri farklı metotlar olmasına
        metot overloading denir.


                */

        String str = "Bu is olacak";

        System.out.println(str.replace("Bu is", "Java Guzel")); // Java Guzel olacak

        System.out.println(str.replace("u","e")); // Be is olacak
    }
}

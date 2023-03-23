package day27_StringBuilder;

public class C03_equalsCompare {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        //  System.out.println(sb1==str);
        // Java da farklı data türüne sahip non-primitive objeler == ile KARŞILAŞTIRILAMAZ

        System.out.println(sb1==sb2); //false
        System.out.println(sb1==sb1); //true

        System.out.println(sb1.equals(sb2)); //false

        /*StringBuilder' da içerik aynı olsa bile equals metotu false döner
        Çünkü StringBuilder class'ın equals metotu yoktur
         equals metotunu parent class'ı olan Object Class'ından kullanır
         ve bundan dolayı içeriğe bakmadan false verir */
        System.out.println(sb1.equals(str)); // false

        // Bu durumda iki StringBuilder'in içeriklerinin aynı olduğunu kontrol etmek için
        // compareTo() metotu kullanılır

        System.out.println(sb1.compareTo(sb2)); // 0

        StringBuilder sb3 = new StringBuilder("Hava");
        StringBuilder sb4 = new StringBuilder("Hara");

        System.out.println(sb1.compareTo(sb3)); // 2
        System.out.println(sb1.compareTo(sb4)); // 2
        System.out.println(sb3.compareTo(sb4)); // 4
        System.out.println(sb4.compareTo(sb3)); // -4

        /*
        CompareTo() ile karşılaştırılan metinler aynı ise 0 döner
        Aynı değilse ilk harften başlayarak aralarında kaç tane harf olduğunu Alfabetik olarak sayar
        ve aradaki farkı döndürür
         */


    }
}

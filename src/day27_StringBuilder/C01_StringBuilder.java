package day27_StringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {

      StringBuilder sb1 = new StringBuilder();

        System.out.println(sb1.capacity()); // 16
        System.out.println(sb1.length()); // 0

        sb1.append("Mustafa");

        System.out.println(sb1.capacity()); // 16
        System.out.println(sb1.length()); // 7

        sb1.append(" Yilmazturk");


        System.out.println(sb1.capacity()); // 34 = 2 * eski capacity + 2
        System.out.println(sb1.length()); // 18 Karakter

        sb1.append("javayı çok sever, sabah akşam Java çalışır");

        System.out.println(sb1.capacity()); // 70 = 2 * eski capacity + 2
        System.out.println(sb1.length()); // 60 Karakter

       // 2. Yontem ;

      StringBuilder sb2 = new StringBuilder("Java Candir");
      System.out.println(sb2.capacity()); // 16 + metin = 27
      System.out.println(sb2.length()); // 11

      // 3. Yöntem

      StringBuilder sb3 = new StringBuilder(11);
      sb3.append("12345678901");
      System.out.println(sb3.capacity()); // 11
      System.out.println(sb3.length()); // 11

      sb2.trimToSize(); // capacity ve length'i birbirine eşitliyor, gereksizleri atıyor
      System.out.println(sb2.capacity()); // 11
      System.out.println(sb2.length()); // 11
    }


}

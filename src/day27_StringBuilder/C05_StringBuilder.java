package day27_StringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java Candir");

        System.out.println(sb1.delete(4, 5)); // Aradaki metinleri siler ve yeni halini döndürür

        System.out.println(sb1);

        System.out.println(sb1.deleteCharAt(9)); // Aynı şekilde işlemi yapar ve son halini bize döndürür

        System.out.println(sb1);

        System.out.println(sb1.insert(9, "r")); //Belirtilen index'e belirtilen metni ekler
        System.out.println(sb1);

        System.out.println(sb1.insert(4, " "));

        String str = " can bize gelecekmis";
        sb1.insert(11,str,0,5);
        System.out.println(sb1); // Java Candir can

        sb1.replace(12,15,"Can");
        System.out.println(sb1); // Java Candir Can 


    }
}

package day10_StringManipulation;

public class C02_Contains {
    public static void main(String[] args) {
        String str = "Java ogren, isi kap";
        System.out.println(str.contains("Java")); // true
        String s = "ka";
        System.out.println(str.contains(s));// true

        System.out.println(str.contains("java")); //false , contains metotu ignoreCase gözetmez.
    }
}

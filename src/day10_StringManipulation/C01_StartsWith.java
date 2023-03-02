package day10_StringManipulation;

public class C01_StartsWith {
    public static void main(String[] args) {

        String str = "Java harika";
        System.out.println(str.startsWith("Java")); //true Java ile başlayıp başlamadığını kontrol ediyor.

        System.out.println(str.startsWith("Ja")); // true


        System.out.println(str.endsWith("ka")); // true
    }
}

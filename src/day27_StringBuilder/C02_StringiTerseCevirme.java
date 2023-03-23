package day27_StringBuilder;

public class C02_StringiTerseCevirme {
    public static void main(String[] args) {
        // Verilen bir metni tersine çevirin

        String str = "Java Candir";

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        System.out.println(sb);
    }
}

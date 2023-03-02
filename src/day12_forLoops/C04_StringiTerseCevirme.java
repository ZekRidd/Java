package day12_forLoops;

public class C04_StringiTerseCevirme {
    public static void main(String[] args) {
        // Kullanıcıdan bir string alıp bunu tersine yazdıırn

        String input = "Java Candir";

        String output = "";

        for (int i = input.length()-1; i >=0 ; i--) {

            output += input.charAt(i);
        }

        System.out.println(output);
    }
}

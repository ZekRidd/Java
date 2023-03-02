package day11_StringManipulations;

public class C03_Replace {
    public static void main(String[] args) {

        String str = "Java Candır";
        str = str.replace('J','H');
        System.out.println(str);

        System.out.println(str.replace("a", ""));

        str = str.replace(" ", ""); // boşluk yerine hiçlik geçer
        System.out.println(str);




    }
}

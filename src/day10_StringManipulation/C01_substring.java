package day10_StringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        // Substring iki farklı şekilde kullanılabilir.
        // 1. tek parametre olursa o indexten başlar sonuna kadar yazdırır.

        String str = "Java ne kadar güzel";
        System.out.println(str.substring(8)); // kadar güzel 8.indexten sonuna kadar
        System.out.println(str.substring(0)); // Java ne kadar güzel
        System.out.println(str.substring(str.length()-3)); //zel
        System.out.println(str.substring(str.length()));

        // 2 parametre girilirse başlangıç indexinden başlar(dahil) ve bitiş indexine (hariç)
        // kadar olan kısmı yazdırır


        System.out.println(str.substring(5,10)); // ne ka
    }
}

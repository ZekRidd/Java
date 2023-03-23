package day03_grupCalisma;

import java.util.Arrays;
import java.util.Random;

public class TCKimlikNo {

    /*
         //TC kimlik numarasının son rakamı çift olmak zorundadır.
        // 0 rakamı ile başlayamaz. ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
        //Ayrıca; 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile
        // 2, 4, 6 ve 8. rakamın toplamının 9 katının toplamının birler basamağı 10. rakamı;
        // 1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.
     */

    public static void main(String[] args) {
        Random rand = new Random();

        long randomLong = (long) (rand.nextDouble() * 9_000_000_000L) + 1_000_000_000L;

        System.out.println(randomLong);

    }
}

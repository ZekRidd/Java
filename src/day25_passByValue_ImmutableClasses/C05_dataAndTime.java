package day25_passByValue_ImmutableClasses;

import java.time.LocalTime;

public class C05_dataAndTime {
    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();
        System.out.println(saat);

        System.out.println(saat.getNano());

        // bir for loop ile 1 den 10.000'e kadar olan sayıları toplayın
        // ve bu işlemin kaç nano saniye sürdüğünü hesaplayın

        int toplam = 0;

        int basSuresiNano = saat.getNano();

        for (int i = 0; i <=10.000 ; i++) {
            toplam +=i;
        }

        LocalTime sonSaat = LocalTime.now();
        int bitSuresiNano = sonSaat.getNano();

        System.out.println("Geçen süre = " + (bitSuresiNano-basSuresiNano));

    }
}

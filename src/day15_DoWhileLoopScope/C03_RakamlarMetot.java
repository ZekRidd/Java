package day15_DoWhileLoopScope;

public class C03_RakamlarMetot {

    // Verilen pozitif bir sayının rakamlar toplayını bulan metot

    public static int rakamlarToplam (int verilenSayi) {

        int sayi = verilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami= 0;

        int basamakSayisi = (sayi + "").length();

        for (int i = 1; i <=basamakSayisi ; i++) {

            birlerBasamagi=sayi%10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;
            
        }

            return rakamlarToplami;

    }

}

package day21_forEachLoop;

import java.util.Arrays;

public class C05_IstenenHarfAdediniBulma {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir cümle ve bir harf alın
        harf cümlede kullanılmışsa kaç defa kullanıldığını yazdırın
        kullanılmamışsa "hiç kullanılmadı" yazdırın
         */

        String cumle = "Yatin Kalkin Java Calisin";
        String istenenHarf = "a";

        String[] karakterler = cumle.split(""); // cümleyi hiçlik ile karakterlerine ayırdık
        System.out.println(Arrays.toString(karakterler)); // [Y, a, t, i, n,  , K, a, l, k, i, n,  , J, a, v, a,  , C, a, l, i, s, i, n]

        int flag = 0;
        for (int i = 0; i <karakterler.length ; i++){
            if(istenenHarf.equalsIgnoreCase(karakterler[i])){
                flag++;
            }
        }
        if(flag==0){
            System.out.println("Aradığınız harf listede yer almamaktadır.");
        } else {
            System.out.println("Aradığınız harf listede " + flag + " defa kullanılmıştır.");
    }
}
}

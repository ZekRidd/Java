package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_FibonacciDizisi {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci
        sayisini bir list olarak donduren bir method olusturun.
         */


        int sayiAdedi=10;

        System.out.println(istenenSayidaFibonacciListele(10)); // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
        System.out.println(istenenSayidaFibonacciListele(15)); // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377]
    }

    public static List<Integer> istenenSayidaFibonacciListele(int sayiAdedi) {

        List<Integer> fibonacci = new ArrayList<>();

        if(sayiAdedi<=0) {
            System.out.println("Geçersiz sayı girdiniz!");
        } else if(sayiAdedi==1){
            fibonacci.add(0);
        } else if(sayiAdedi==2){
            fibonacci.add(0);
            fibonacci.add(1);
        } else {
            int ilkSayi = 0;
            fibonacci.add(ilkSayi);
            int ikinciSayi = 1;
            fibonacci.add(ikinciSayi);
            int yeniSayi = ilkSayi + ikinciSayi;
            fibonacci.add(yeniSayi);

            while (fibonacci.size()<sayiAdedi) {
                ilkSayi=ikinciSayi;
                ikinciSayi=yeniSayi;
                yeniSayi=ilkSayi+ikinciSayi;
                fibonacci.add(yeniSayi);
            }
        }
        return fibonacci;
    }
}

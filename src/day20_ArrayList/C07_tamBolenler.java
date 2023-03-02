package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_tamBolenler {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan main metotta pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
        tamsayilari bir liste olarak bize donduren bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bölenlerini bulmak için pozitif bir tamsayı giriniz");
        int girilenSayi = scan.nextInt();

        System.out.println(pozitifBolenleriListele(girilenSayi));
    }

    public static List<Integer> pozitifBolenleriListele(int verilenSayi) { // 20

        List<Integer> bolenlerListesi = new ArrayList<>();
        for (int i = 1; i <=verilenSayi ; i++) {
            if(verilenSayi%i==0){
                bolenlerListesi.add(i);
            }
        }
        return bolenlerListesi;
    }
}

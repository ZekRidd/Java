package day04_grupCalisma;

import java.util.Scanner;

public class bolenleriHesapla {
    /*
     Soru 3 - Kullanicidan aldıginiz pozitif bir tamsayinin
         tam bolenlerini ve tam bolenlerinin toplamini bulun
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bolenlerini hesaplamasını istediğinizi sayıyı girin");;
        int sayi = scan.nextInt();

        int bolenlerinToplami=0;
        int bolen = 1;

        while(bolen<=sayi){
            if(sayi%bolen==0){
                bolenlerinToplami+=bolen;
                System.out.print(bolen+ " ");
            } bolen++;
        }
        System.out.println("");
        System.out.println("Bolenlerin Toplamı :" + bolenlerinToplami);


    }
    /*

     */




}

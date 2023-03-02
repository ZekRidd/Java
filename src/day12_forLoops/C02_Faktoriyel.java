package day12_forLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C02_Faktoriyel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Faktoriyel hesaplanacak sayıyı giriniz");
        int faktoriyel = sc.nextInt();
        int sonuc = 1;

        for (int i=1; i<=faktoriyel; i++) {
            sonuc = sonuc * i;
        }
        System.out.println("Sonuç: " + sonuc );
    }
}

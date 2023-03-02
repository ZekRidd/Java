package day14_MethodOlusturmaWhileLoop;

import java.util.Scanner;

public class C01_AsalSayi {

    public static void main(String[] args) {

        int flag = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Asal sayı hesapla");
        int sayi = sc.nextInt();

        for (int i = 2; i <sayi ; i++) {
            if(sayi%i==0){
                flag++;
                break;
            }
        }

        if(flag==0) {
            System.out.println("Girilen " + sayi + " sayısı asaldır");
        } else {
            System.out.println("Girilen " + sayi + " sayısı ASAL değildir");
        }
    }

}

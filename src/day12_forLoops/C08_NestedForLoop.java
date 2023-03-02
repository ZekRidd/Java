package day12_forLoops;

import java.util.Scanner;

public class C08_NestedForLoop {
    public static void main(String[] args) {
        // Kullanıcının belirlediği sayıya kadar fibonacci sayılarını ekrana yazdırın

        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci yazdır");
        int fibonacci = sc.nextInt();

        // 1 1 2 3 5 8 13 21


        int a=2;
        int b=3;
        int sum = 0;

        System.out.print("1 1 2 3 ");
            for (int j = 2; j <=fibonacci ; j++) {
                sum = a+b;
                System.out.print(sum + " ");
                a=b;
                b=sum;
            }

        }


    }


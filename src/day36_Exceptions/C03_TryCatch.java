package day36_Exceptions;

public class C03_TryCatch {
    public static void main(String[] args) {

        int sayi1= 20;
        int sayi2= 0;

        try {

            System.out.println("Deneme0"); // Bu kod ekranda görünür
            System.out.println(sayi1/sayi2); // try bloğunda exception oluşursa sorun olan kod satırından sonra
                                            // tüm kodları ignore eder, önceki satırdaki kodlar çalışır
            System.out.println("Deneme1");
            System.out.println("Deneme2");
            System.out.println("Deneme3");
        } catch (ArithmeticException e) {
            System.out.println("Bölen sıfır olmamalı");
        }
    }
}

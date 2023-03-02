package day11_StringManipulations;

public class C08_Loops {
    public static void main(String[] args) {
        // 50'den başlayıp 100 e kadar sayıları yanyana aralarında 1 boşluk
       //  olacak şekilde yazdırın

        for (int i=50; i<=100; i++) {
           System.out.print(i + " ");
         }

        System.out.println("");
        // üç basamaklı sayılardan 23 ile bölünebilenleri
        // yanyana, aralarında bir boşluk bırakarak yazdırın

        for (int i=100; i<=999; i++) {
            if(i%23==0){
                System.out.print(i + " ");
            }
        }

        System.out.println("");

        // 20'den başlayıp, 7'şer artarak 100'e kadar yazdırın

        for(int i = 20; i<=100; i=i+7) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        // 100 den başlayarak 1 e kadar
        // 7 ile bölünebilen sayıları yazdırın

        for (int i=100; i>=1; i--) {
            if(i%7==0) {
                System.out.print(i + " ");
            }
        }
    }
}

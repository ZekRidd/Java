package day01_grupCalisma;

public class Soru6 {
    public static void main(String[] args) {
        /*
        Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        olusturun.
         */

        String[] arr = {"Suat","Fatma","Burhan","Kadir","Ramazan","Anıl","Hakan"};

        longestShortest(arr);
    }

    public static void longestShortest (String[] arr) {

        String longest = arr[0];
        String shortest = arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(longest.length()<arr[i].length()) {
                longest=arr[i];
            }
            if(shortest.length()>arr[i].length()){
                shortest=arr[i];
            }
        }

        System.out.println("Dizi içerisindeki en küçük ifade : " + shortest);
        System.out.println("Dizi içerisindeki en büyük ifade : " + longest);

    }
}

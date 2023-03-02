package ArraysTemelSorular;

public class Soru6 {
    public static void main(String[] args) {
        /*
        Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        olusturun.
         */

        String[] arr = {"Ahmet", "Hak","Canan","Ali","Zeynep"};
        enUzunEnKisa(arr);
    }

    public static String[] enUzunEnKisa(String[] arr){

        String enUzunKelime=arr[0];
        String enKisaKelime=arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(enKisaKelime.length()>arr[i].length()) {
                enKisaKelime=arr[i];
            }
            if(enUzunKelime.length()<arr[i].length()){
                enUzunKelime=arr[i];
            }
        }

        System.out.println("Dizi içerisindeki en uzun kelime : " + enUzunKelime);
        System.out.println("Dizi içerisindeki en kısa kelime : " + enKisaKelime);

        return arr;
    }
}

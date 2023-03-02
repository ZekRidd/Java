package day17_Arrays;

public class C03_EnUzunElementiYazdirma {
    public static void main(String[] args) {

        // Verilen bir String ifadede en uzun ve en kısa kelimeleri oluşturan metot yazın

        String[] arr = {"Melike", "Burkay", "inci", "Eda", "Emre"};

        enUzunEnKisaYazdir(arr);

        String[] arr2= {"Melike", "Burkay", "inci", "Eda", "Emre", "Huseyin"};
        enUzunEnKisaYazdir(arr2);

    }

    public static void enUzunEnKisaYazdir(String[] arr) {
        String enUzunKelime = arr[0];
        String enKisaKelime = arr[0];

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i].length()>=enUzunKelime.length()) { // = ifadesi yazılırsa en sondaki elementi atar
                enUzunKelime=arr[i];
            }
            if(arr[i].length()<=enKisaKelime.length()) { // = ifadesi yazılırsa en sondaki elementi atar
                enKisaKelime=arr[i];
            }
        }

        System.out.println("Array'deki en uzun kelime : " + enUzunKelime);
        System.out.println("Array'deki en kısa kelime : " + enKisaKelime);
    }
}

package day20_ArrayList;

public class C08_BaskaClassKullanma {
    public static void main(String[] args) {

        // Verilen sayının pozitif tam bölenleri sayısı 10'dan büyük ise "Güzel"
        // değilse "Kötü" yazdırın

        int sayi = 3000;

        int pozitifBolenlerListesi = C07_tamBolenler.pozitifBolenleriListele(sayi).size();

        if(pozitifBolenlerListesi>10) {
            System.out.println("Güzel");
        } else {
            System.out.println("Kötü");
        }
    }
}

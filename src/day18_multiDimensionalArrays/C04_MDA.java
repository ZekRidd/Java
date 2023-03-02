package day18_multiDimensionalArrays;

public class C04_MDA {
    public static void main(String[] args) {

        String[][] siniflar = {{"A","B","G","M"}, {"F","P","A","V"},{"K","D","Q"}};

        //G'yi yazdırın

        System.out.println(siniflar[0][2]);

        //Q'yu Y yapın

        siniflar[2][2]="Y";

        // ilk sinifin mevcudunu yazdırın

        System.out.println(siniflar[0].length); // 4

        // Sınıflarda toplam kaç kişi olduğunu yazdırın

        int toplamOgrSayisi = 0;

        for (int i = 0; i < siniflar.length; i++) {
            toplamOgrSayisi+=siniflar[i].length;
        }
        System.out.println(toplamOgrSayisi);
    }
}

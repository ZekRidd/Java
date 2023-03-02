package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_BaskaClasstanCalistirma {
    public static void main(String[] args) {
        // C05'deki istenmeyenleri sil metotunu burdan kullanalım

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Cokomel");
        urunler.add("Cokoprens");
        urunler.add("Cikolatalı Gofret");

        String istenmeyen = "o";


        System.out.println(C05_ArrayListSorularDevam.istenmeyenHarfIcerenleriSil(urunler, istenmeyen));
        System.out.println(C05_ArrayListSorularDevam.istenmeyenHarfIcerenleriSil(urunler, "a"));
    }
}

package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_ArrayListSorularDevam {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        kismini list olarak bize donduren bir method olusturun
         */

        List<String> liste = C04_ArrayListSorular.kullaniciyaListOlusturma();
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kullanılmasını istemediğimiz bir harfi giriniz");
        String istenmeyenHarf = scan.next().substring(0,1);


        List<String> ayiklanmisListe = istenmeyenHarfIcerenleriSil(liste,istenmeyenHarf);
        System.out.println(ayiklanmisListe);
    }

    public static List<String> istenmeyenHarfIcerenleriSil(List<String> liste, String istenmeyenHarf) {

        // mesela listemiz ali, veli, ayşe, fatma ve istenmeyen harf a olsun
        // eğer for loop ile istenmeyeni içeren index'i silersek
        // listenin boyutu değişeceği için sorun yaşarız
        // farklı bir liste oluşturup,silinmeyecekleri yeni listeye atayarak sorunu çözebiliriz

        List<String> kalanlarListesi = new ArrayList<>();

        for (int i = 0; i <liste.size(); i++) {
            if(!liste.get(i).contains(istenmeyenHarf)) {
                kalanlarListesi.add(liste.get(i));
            }
        }
        return kalanlarListesi;
    }

}

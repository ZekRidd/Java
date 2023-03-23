package day25_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_passByValue {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        System.out.println(sayilar);
    }

    public static void elementleriArtir(List<Integer> sayilar){
        // tüm elementleri 2 katına çıkaralım

        for (int i = 0; i <sayilar.size() ; i++) {
            sayilar.set(i, 2*(sayilar.get(i)));
        }
        System.out.println("Elementleri artir metotunda : " + sayilar);
    }

    public static void yeniListeAta(List<Integer> sayilar){
        // sayilar listesine yeni bir list değeri atayıp
        // sonra 1,2,3 elementlerini ekleyin


    }
}

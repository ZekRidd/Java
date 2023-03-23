package day21_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_asList {
    public static void main(String[] args) {

        Integer[] arr = {1,3,4,5,2,4,5,6,7,8,2,3,1,3};

        // arr'in tüm elementlerini içeren bir arraylist oluşturun

        List<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) { // for döngüsü ile dizideki elemanları listeye aldık
            arr2.add(arr[i]);
        }

        System.out.println(arr2); // [1, 3, 4, 5, 2, 4, 5, 6, 7, 8, 2, 3, 1, 3]

        // Java'da array'i list haline çevirmenin birden fazla yolu var. asList metotu gibi
        // Ancak kullanımı tavsiye edilmez. Çünkü iki tane büyük dezavantajı vardır

        // List<Integer> arraydenList = Arrays.asList(arr); // Bu şekilde kabul etmez ancak arr'i biz int data
                                                        // türünden oluşturmuştuk, yukarıda arr'i Integer'a çevirirsek
                                                        // Bu yöntem çalışır ve array'i list haline getirmiş oluruz

        List<Integer> arraydenList = Arrays.asList(arr);

        System.out.println("Arrayden liste çeviren : " + arraydenList); // Arrayden liste çeviren : [1, 3, 4, 5, 2, 4, 5, 6, 7, 8, 2, 3, 1, 3]


        arr2.add(11);
        // arraydenList.add(11); ekleme yapamayız, uzunluğu değiştirmiş oluyoruz

        System.out.println(arr2); // for loop ile çevirdik, düzgün çalışacaktır.
       //  System.out.println(arraydenList); // UnsupportedOperationException hatası verecektir.
        // Çünkü arraydenList'e eleman ekleyemiyoruz.
        // asList kullanılarak array'den liste çevrilen listelerde ekleme, silme gibi
        // uzunluğu değiştiren metotlar kullanılamaz.


        // 2. dezavantaj, arka planda array ve arrayden dönüştürdüğümüz list beraber hareket eder
        // Birinde yaptığımız değişiklikler diğerine de işlenir.

        System.out.println("Array : " + Arrays.toString(arr)); // Array : [1, 3, 4, 5, 2, 4, 5, 6, 7, 8, 2, 3, 1, 3]
        System.out.println("Array'den list : " + arraydenList); // Array'den list : [1, 3, 4, 5, 2, 4, 5, 6, 7, 8, 2, 3, 1, 3]

        // array'in bir elementine yeni değer atayalım

        arr[0]=22;
        System.out.println("==============Array'i değiştirdikten sonra ============");
        System.out.println("Array'i değiştirdikten sonra : " + Arrays.toString(arr)); // Array'i değiştirdikten sonra : [22, 3, 4, 5, 2, 4, 5, 6, 7, 8, 2, 3, 1, 3]
        System.out.println("Array'i değiştirdikten sonra list : " + arraydenList); // Array'i değiştirdikten sonra list : [22, 3, 4, 5, 2, 4, 5, 6, 7, 8, 2, 3, 1, 3]

        // List'in bir elementini update edelim

        arraydenList.set(1,45);
        System.out.println("==============List'i değiştirdikten sonra ============");
        System.out.println("List'i değiştirdikten sonra : " + Arrays.toString(arr)); // List'i değiştirdikten sonra : [22, 45, 4, 5, 2, 4, 5, 6, 7, 8, 2, 3, 1, 3]
        System.out.println("List'i değiştirdikten sonra list : " + arraydenList); // List'i değiştirdikten sonra : [22, 45, 4, 5, 2, 4, 5, 6, 7, 8, 2, 3, 1, 3]



    }
}

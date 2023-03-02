package day16_ScopeArrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        String[] isimler = {"Ahmet", "Mehmet", "Can"};

        int[] sayilar = {1,2,3,6,5,3,6,};

        char karakterler[] = {'a', 'b', '7'}; // Dizi işaretini değişken adının sonuna da ekleyebilir
                                            // Ancak tavsiye edilen bir yöntem değildir

        // Array non-primitive data türlerindendir.
        // Eğer array'i liste şeklinde oluşturmayıp
        // new keyword'u kullanarak çağırırsak
        // UZUNLUGUNU belirtmek zorundayız


        String [] arr = new String[5];

        // Bir array tanımlanan uzunluktan daha fazla veya az eleman ALAMAZ.


        // Bir array'i direkt yazdıramayız

        System.out.println(isimler); // [Ljava.lang.String;@5674cd4d bu şekilde yazdırır

        System.out.println(Arrays.toString(isimler)); // [Ahmet, Mehmet, Can], bu şekilde yazdırabiliriz

        System.out.println(Arrays.toString(arr)); // default değerleri yazdırır, [null, null, null, null, null]

        int[] a = new int [7];
        System.out.println(Arrays.toString(a)); // [0, 0, 0, 0, 0, 0, 0] default değerleri yazdırır


        // Array'deki elementlere index ile ulaşırız

        a[0] = 4;
        a[3] = 7;
        a[6] = 7; // son index 6. index'dır, Daha fazlasına atama yapamayız

        System.out.println(Arrays.toString(a)); // [4, 0, 0, 7, 0, 0, 7]

        System.out.println(isimler[2]); // Bu şekilde yazdırma işlemi yapabiliriz
                                        // Çünkü dizinin tamamını değil sadece belirli bir ifadeyi çağırıyoruz

    }

}

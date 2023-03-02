package day10and11examples;

import java.util.jar.JarEntry;

public class Alistirmalar {
    public static void main(String[] args) {
        String str = "Java çok zor";
        System.out.println(str.isEmpty()); // false
        // Verilen String'in boş olup olmadığını kontrol eder
        // ve sonucu boolean döndürür

        String str1="  ";
        System.out.println(str1.isBlank()); //true döner
        //Değerin sadece boşluklardan oluşup oluşmadığını kontrol eder.

        String first = null; //Burada yer alan üç değişkenin durumları birbirinden tamamen farklıdır
        String second;      // null olarak işaretlenmiş bir değişkeni metotlar ile kullanamayız.
        String third = " "; // 2. değişkene daha sonra değer atarsak metotlar ile kullanabiliriz. Bu hali ile
                            // kullanamayız.
                            // 3. değişkeni metotlar ile kullanabilir ve yazdırabiliriz.

        String kelime = "Java Candir";
        kelime = kelime.replace("J", "H"); // replace metotu ile ilk kısımda yer alan değer
                                                            // ikinci kısımda yer alan değer ile yer değiştirir.
        System.out.println(kelime); //Hava Candir

        // Not: Değişecek String i tamamen silmek istiyorsak yerine "" hiçlik ifadesini yazdırabiliriz.

        String kelime2 = "Herkesin github'u olmalı";
        kelime2=kelime2.replaceFirst("e","a"); // Karşılaştığı ilk e harfini a yapar.
        System.out.println(kelime2); // "Harkesin github'u olmalı"


    }
}

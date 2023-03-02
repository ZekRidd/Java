package day10_StringManipulation;

public class C05_IndexOf {
    public static void main(String[] args) {
        String str = "Java cok ama cok guzel";
        System.out.println(str.indexOf("c")); // 5

        System.out.println(str.indexOf("a")); // 1, birden fazla varsa ilk bulduğunu verir

        System.out.println(str.indexOf("cok")); // 5

        System.out.println(str.indexOf("cok", 6)); // 13
        System.out.println(str.indexOf("cok", 5)); //

        System.out.println(str.indexOf("java")); // -1, aranan string ifade yoksa her zaman -1 döner


        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 2 kere kullanilmis
        // 3- aradiginiz kelime cumlede 2'den fazla kullanilmis

        String cumle = "Yasasin java, iyi ki java ogreniyorum";
        String kelime = "java";

        if (cumle.indexOf(kelime) == (-1)) {
            System.out.println("Aradığınız kelime cümlede hiç kullanılmamış");
        } else {
            int kelimeIlkIndex = cumle.indexOf(kelime); // 8

        }

    }
}

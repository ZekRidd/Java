package day10_StringManipulation;

public class C06_LastIndexOf {
    public static void main(String[] args) {
        String str = "Java bazen beyin yakar";
        System.out.println(str.indexOf("a")); // 1 , baştan saymaya başlıyor

        System.out.println(str.lastIndexOf("a")); // 20, en sondaki a'nın indexini verir

        System.out.println(str.indexOf("a", 2)); // 3

        System.out.println(str.indexOf("a", 19)); // 18

        System.out.println(str.indexOf("a", 4)); // 6

        System.out.println(str.lastIndexOf('e')); // 12 , en sondaki e'nin nerede olduğunu gösterir


        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 2 kere kullanilmis
        // 3- aradiginiz kelime cumlede 2'den fazla kullanilmis


        String cumle = "Yasasin java, iyi ki java ogreniyorum";
        String kelime = "Yasasin";

        int ilkIndex=cumle.indexOf(kelime);
        int lastIndex=cumle.lastIndexOf(kelime);

        if (ilkIndex==(-1)) {
            System.out.println("Aradığınız kelime cümlede hiç kullanılmamış");
        } else if (ilkIndex==lastIndex){
            System.out.println("Aradığınız kelime cümlede 1 defa kullanılmıştır.");
        } else {
            System.out.println("Aradığınız kelime cümlede birden fazla kullanılmıştır.");
        }







    }
}

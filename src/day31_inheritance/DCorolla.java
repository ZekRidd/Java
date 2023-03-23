package day31_inheritance;



public class DCorolla extends CToyota {

    String str3="Corolla";

    DCorolla(){
        System.out.println("Parametresiz Corolla Constructor çalıştı");
    }

    DCorolla(int sayi){
        super(8);
        System.out.println("Int parametreli Corolla Constructor çalıştı");
    }

    public static void main(String[] args) {

        DCorolla obj1 = new DCorolla(5);
        /*
        Araba parametresiz constructor çalıştı
        Int Parametreli constructor çalıştı
        Int parametreli Corolla Constructor çalıştı
         */
    }
}

/*
Biz görünür bir constructor oluşturduğumuzda Java'nın default constructor'u silmesi gibi
Extends keyword kullanılmış bir class'da gözle görünür bir super() contructor call var ise
default olarak konulan super() constructor call silinir.
 */

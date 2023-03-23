package day25_passByValue_ImmutableClasses;

public class C03_immutableClasses {
    public static void main(String[] args) {

        /*
        Java'da bir class yada o class'tan oluşturulan objeler
         immutable ya da mutable'dır.

        Java metinsel ifadeleri atayabileceğimiz 3 farklı class oluşturmuştur.
        String -- immutable
        StringBuilder -- mutable
        StringBuffer -- mutable

        immutable bir class'tan oluşturulan objeler de immutable'dır
        String immutable bir class olduğundan
        aynı str objesine yeni değer atandığında Java eski değeri değiştirmez
        bunun yerine istenen yeni değere sahip yeni bir obje oluşturur
        ve str'in pointerini yeni objeye yöneltir

        Kullanılmayan eski objeler garbage collector tarafından toplanmak üzere bekler

         */
        String str = "Java Candır";

        str = str.toLowerCase();

        System.out.println(str); // java candır

        str=str.toUpperCase();

        System.out.println(str); // JAVA CANDIR
    }
}

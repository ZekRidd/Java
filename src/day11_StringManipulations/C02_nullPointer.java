package day11_StringManipulations;

public class C02_nullPointer {
    public static void main(String[] args) {

        //null bir değer değildir
        // null bir pointerdir.
        // yanına yazıldığı non-primitive variable'a değer atanmadığını işaret eder

        String str; // str oluşturuldu ama henüz değer atanmadı

        // Java metot içerisinde değer atamadan variable oluşturulmasına izin verir
        // ama değer atamadan kullanılmasına izin vermez.

        str=null; // str = "null" değildir
        // null olarak işaretlenmiştir, değeri null değildir.

        // System.out.println(str.concat("Java")); // Run-Time-Error verir,
                                                    // null olarak işaretlenmiş bir metota ekleme yapamazsın


        // int sayi = null; primitive değerler null olarak işaretlenemez.

        System.out.println(str.isEmpty()); //null olarak işaretlendiği için NullPointerException hatası verir
    }
}

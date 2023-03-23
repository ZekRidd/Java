package day27_StringBuilder;

public class C04_StringBuilderStringMethods {
    public static void main(String[] args) {

        /*
        StringBuilder class'ın olmayıp String class'ın olan metotları kullanmak istersek
        sb.toString kullanarak StringBuilder'i önce String'e çevirir sonra istediğimiz
        String metotlarını kullanırız

       Bu konuda dikkat etmemiz gereken konu String döndüren metotları veya
       String class'ından kullanacağımız metotlar kalıcı değişiklik yapmaz.
         */

        StringBuilder sb1 = new StringBuilder("Java Candir");
        StringBuilder sb2 = new StringBuilder("java Candir");

        sb1.substring(5); // StringBuilder mutable olduğu halde yapılan değişiklik sb1'e atanmaz
        // çünkü substring metotu String döndürür, oysa biz StringBuilder objesi üzerinden işlem yapıyoruz

        System.out.println(sb1.compareTo(sb2)); // -32

        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString())); // true

        sb1.subSequence(3,6); //Kalıcı değişiklik yapmaz

        System.out.println(sb1); // Java Candir


    }
}

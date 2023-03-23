package day28_deneme;

import day28_AccessModifier_encapsulation.C03_EncapsuleDatas;

public class AccessModifierUse {

    public static void main(String[] args) {
        C03_EncapsuleDatas object = new C03_EncapsuleDatas();
        System.out.println(object.toplamSatis); // read yetkisi
        object.toplamSatis=100; // write yetkisi

        /*
        1) Başka bir class'daki variable veya metot'a ulaşmak istediğimizde

        Ulaşmak istediğimiz class üyesinin static olup olmaması erişim yöntemini etkiler
        Static ise classIsmi.uyeIsmi yazarkan
        Static değil ise obje oluşturarak ulaşabiliriz.

        2) Ulaşmak istediğimiz variable veya metot'un accessModifier'ı ise
        o üyeye ulaşma yetkimizin olup olmadığını gösterir.

        Ulaşma yetkimiz var ise o datayı okuyabilir veya değiştirebiliriz
         */
    }

}

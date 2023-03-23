package day31_inheritance;

import day30_inheritance.GParent;

public class AChild extends GParent {

    String childStr;

    AChild(){
        System.out.println("Child class constructor çalıştı");
    }

    public static void main(String[] args) {
        // System.out.println(childStr); static olmadığı için kullanamayız
        // System.out.printf(sayiParent); bu da static olmadığı için ulaşamayız
        //  System.out.println(sayiGrandParent); bu da static olmadığı için ulaşamayız

        // Bunları kullanmamız için obje oluşturmalıyız

        AChild objChild = new AChild();
        objChild.sayiParent=3; // Obje oluşturduktan sonra import ettiğimiz class'daki variable'lara ulaşabiliriz
        objChild.sayiGrandParent=2;
        objChild.childStr="Ahmet";

        /*
        Java'da inheritance kullanırken
        Child class'daki obje parent class(lar)daki tüm özelliklere sahip olur.
        Bunu Java'nın super() constructor call methodu sağlar

        Extends keyword kullanan bir class'da oluşturulan her bir constructor'un ilk satırında
        Biz görmesek dahi super() vardır.
        super() methodu >> önce parent class'a gidip oradaki parametresiz constructor'ı çalıştır demektir.

        Bu şekilde child class'daki constructor çalıştığında
        extends keyword kullanmayan parent buluncaya kadar
        parent class'lara gider

         */
    }

}

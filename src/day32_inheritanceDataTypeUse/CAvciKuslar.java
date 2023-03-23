package day32_inheritanceDataTypeUse;

import day28_deneme.AccessModifierUse;

public class CAvciKuslar extends BKuslar {

    String hareket = "Ucarlar";
    String beslenme = "Et yerler";

    String pence ="Pencelidir";

    String gaga = "Sivri gagali";

    public static void main(String[] args) {
        CAvciKuslar kartalAvci = new CAvciKuslar();

        System.out.println(kartalAvci.hareket); // C Ucarlar
        System.out.println(kartalAvci.beslenme); // C  Et yerler
        System.out.println(kartalAvci.pence); // C Pencelidir
        System.out.println(kartalAvci.gaga); // C Sivri gagali

        System.out.println(kartalAvci.kanat); // B Kanatlıdır
        System.out.println(kartalAvci.solunum); // B Akciger
        System.out.println(kartalAvci.cogalma); // B Yumurta

        System.out.println(kartalAvci.omur); // A Yasar ve Olur

        BKuslar kartalKus = new CAvciKuslar();

        System.out.println(kartalKus.hareket); // A Hareket eder
        System.out.println(kartalKus.beslenme); // A Beslenir
        // System.out.println(kartalKus.pence); // CTE
        System.out.println(kartalKus.gaga); // B Gagaları var

        System.out.println(kartalKus.kanat); // B Kanatlıdır
        System.out.println(kartalKus.solunum); // B Akciger
        System.out.println(kartalKus.cogalma); // B Yumurta

        System.out.println(kartalKus.omur); // A Yasar ve Olur


        AHayvanlar kartalHayvan = new CAvciKuslar();
        System.out.println(kartalHayvan.hareket); // A hareket eder
        System.out.println(kartalHayvan.beslenme); // A Beslenir
       //  System.out.println(kartalHayvan.pence); CTE
       //  System.out.println(kartalHayvan.gaga); // CTE

       // System.out.println(kartalHayvan.kanat); // CTE
        System.out.println(kartalHayvan.solunum); // A Nefes alırlar
        System.out.println(kartalHayvan.cogalma); // A Cogalırlar

        System.out.println(kartalHayvan.omur); // A Yasar ve Olur

        // VARIABLE olarak özellikleri oluşturursak

        BKuslar kuslar = new BKuslar();
        BKuslar avciKuslar = new CAvciKuslar();

        // Bu iki obje arasında bir fark yoktur










        /*
        Eğer bir obje oluştururken Data türü ve contructor
        aynı ise aradığımız özellikler için direkt o class'a gider ve
        özellikleri ararız

        Eğer data türü ve constructor farklı ise
        variable ve methodlar farklı davranırlar.

        Variable'lar
            -önce data türünün olduğu class'a bakar
            o variable'ı bulursa değerini yazdırır
            bulamazsa data türünün parent'ine bakar




         */



    }
}

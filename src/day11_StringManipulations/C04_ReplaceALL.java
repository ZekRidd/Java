package day11_StringManipulations;

public class C04_ReplaceALL {
    public static void main(String[] args) {
        String str ="J1a23va34 5C54and65ir87";

        // Str'daki sayıları metot ile temizleyin

        /* Eğer değiştirmek istediğimiz tek bir metin değil
         ortak özelliği olan farklı metinler ise

       -  tüm sayılar
       - sayı olmayanların tümü
       - tüm space'ler
       - space olmayan tüm karakterler

       bu ortak özellikleri belirtmek için Java regex tanımlamıştır

         */

            str = str.replaceAll("\\d","");
             System.out.println(str);


    }
}

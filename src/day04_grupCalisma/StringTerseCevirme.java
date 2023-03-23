package day04_grupCalisma;

public class StringTerseCevirme {
    /*
      Soru 2 - While loop kullanarak verilen bir String'i terse cevirip, bu halini bize
     donduren bir method olusturun.

     */

    public static void main(String[] args) {

        String ornek = "Java Candır";
        System.out.println(terseCevirme(ornek)); // rıdnaC avaJ
    }

    public static String terseCevirme(String kelime) {
        String sonHali="";
        int sonIndex = kelime.length()-1;
        while(sonIndex>=0)
        {
            sonHali+=kelime.charAt(sonIndex);
            sonIndex--;
        } return sonHali;
    }
}

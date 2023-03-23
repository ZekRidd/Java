package day30_inheritance;

public class Araba {

    // Marka gözetmeksizin tüm arabaların ortak özelliklerini yazalım

    String marka = "Tüm arabaların markası olur";
    String model = "Tüm arabaların modeli olur";
    String vites = "Tüm arabaların vitesi olur";
    String yakit ="Tüm arabaların yakıtı olur";

    public void uretimYeri(){
        System.out.println("Tüm arabaların üretim yeri olur");
    }

    public void motor(){
        System.out.println("Tüm arabaların motoru olur");

    }

}

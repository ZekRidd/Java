package day23_constructor;

public class Araba {


    int yil;
    String marka="Marka belirtilmemis";
    String model="Model belirtilmemis";
    boolean hasarliMi;
    int fiyat;

    @Override
    public String toString() {
        return "Araba Bilgileri {" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                ", fiyat=" + fiyat +
                '}';
    }


    public Araba(int yil, String marka, boolean hasarliMi, int fiyat) {
        /*
        Eğer parametre ismi INSTANCE variable ile aynı değilse bir alttaki constructor'da
        olduğu gibi direkt atama yapabiliriz.

        Ancak genelde projenin daha anlaşılır olması ve doğru variable'ın kullanılması için
        Contructor'daki parametre ismi ile INSTANCE variable isimleri aynı seçilik

        Bu durumda Java'ya aynı isimdeki iki variable'ın hangisinin
        BU class'daki variable olduğunu belirtmemiz gerekir.

        Bunun için Java this yazılmasını istemiştir.

        this. yazmazsak Java en kısa şekilde ulaşabileceği variable'ı bulur.
         */
        this.yil = yil;
        this.marka = marka;
        this.hasarliMi = hasarliMi;
        this.fiyat = fiyat;
    }



    public Araba(int fyt, String mrk) {
        fiyat=fyt;
        marka=mrk;
    }

    public Araba(){ // Önceki default contructor'ı çağıran
                    // metotlar hata vermemesi için
                    // parametresiz bir contructor
                    // oluşturduk

    }


}

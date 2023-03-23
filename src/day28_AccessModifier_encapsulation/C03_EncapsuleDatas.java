package day28_AccessModifier_encapsulation;

public class C03_EncapsuleDatas {

    static private String isim = "Yıldız Pazarlama";

   private int satisTutari;
   public int toplamSatis;

    public static String getIsim() {
        return isim;
    }

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatis += satisTutari;
    }
}

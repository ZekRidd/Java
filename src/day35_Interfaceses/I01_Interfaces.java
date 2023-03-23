package day35_Interfaceses;

public interface I01_Interfaces {

    static int sayi=10;
    final String str = "Java Candir";
    public static final boolean b = true;

    /*
    Interface'de tüm variable ve method'lar yazılmasa bile public static final'dir.
    Final olduğu için de sonradan değiştirme imkanı yoktur.
    Oluştururken değer atanmalıdır.
    Bu özellikler standart olarak tüm variable'lara tanımlanır. Bu nedenle IDE griye çevirdi.
     */

    public static void main(String[] args) {

    }

    void toplama();
    public void cikarma();
    abstract String ekleme();

    public abstract int faktoriyel();

    /*

    Tüm methodlar da standart olaram public ve abstract'tır. Yazılmazsa dahi.

     */
}

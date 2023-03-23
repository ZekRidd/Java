package day22_constructor;

public class C02_Hemsire {
    /*
    Orneğin bir hastane programında
    hastanede çalışacak hemşirelerin hangi bilgilerini tutmak istiyorsak
    hangi metotları kullanmak istiyorsak
    bir hemşire class'ı oluşturup
    tüm bu özellikleri (variable ve metotları) o class'da oluştururuz

    Programda ne zaman bir hemşireye ihtiyac olsa bu class'dan hemrişe oluştururuz
    Bu şekilde tüm özelliklere(variable) sahip olur.

     */

    String isim;
    String soyIsim;
    String telNo;
    String adres;
    int yas;
    boolean izindeMi;
    char evliMi;
    int ekMesaiUcreti = 20;

    public int mesaiUcretiHesapla(int mesaiSaati){
        return mesaiSaati*ekMesaiUcreti;
    }

}

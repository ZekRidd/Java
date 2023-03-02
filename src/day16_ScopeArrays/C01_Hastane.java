package day16_ScopeArrays;

public class C01_Hastane {
    public static void main(String[] args) {
        ADoktor dok1 = new ADoktor();

        System.out.println(dok1.askerlikYaptiMi); // false, default değeri atadı
        dok1.isim="Kemal";
        dok1.soyisim="Yılmaz";
        dok1.dogumYil = 1980;

        System.out.println(dok1.isim); // atanmış Kemal değerini ekrana yazdırır

        ADoktor dok2 = new ADoktor();
        System.out.println(dok2.isim); // null , default değeri yazdırır

        dok2.soyisim = "Celik";

        System.out.println(dok2.soyisim); // çelik yazdırır


        System.out.println(dok1.fakulte); // Tıp, static olarak tanımlandığı için
                                        // atama yapamıyoruz

        System.out.println(dok2.fakulte); // Tıp ,




        dok1.isim = "Burcu";
        System.out.println(dok2.isim);// null yazdırır, çünkü isim variable'ı instance olarak tanımlanmıştır
                                    // sadece kendisini bağlar, diğer doktorların isimlerini etkilemez

        dok1.fakulte="Tıp Fakültesi";
        System.out.println(dok2.fakulte); // Tıp Fakültesi, yazdırır, çünkü;
                                        // fakulte variable'ı static olarak tanımlanmıştır.
                                        // Yapılan değişiklik, değişiklikten sonrakileri etkiler

        ADoktor dok3 = new ADoktor();
        System.out.println(dok3.dogumYil); // 0, default değeri yazdırır
        System.out.println(dok3.fakulte); // fakulte, static değer olduğu için en son atanan değeri alır
                                            // Tıp fakültesi yazdırır

        System.out.println(ADoktor.fakulte);
        // Static variable için tavsiye edilen erişim yöntemi


    }
}

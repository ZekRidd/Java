package day26_LocalTimeVarArgs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime time1 = LocalTime.of(20,15); // 20:15
        System.out.println(time1);

        LocalTime time = LocalTime.now(); // Şuanki zamanı yazdırır
        System.out.println(time);

        System.out.println(time.getHour());
        // get metotları LocalTime objesinin saat, dakika, saniye ve nano değerlerini bize getirir

        System.out.println(time.plusHours(2).plusMinutes(10));// Şuanki saate 2 saat 10 dakika ekler

        System.out.println(time.minusMinutes(10).minusSeconds(10)); // Şuanki saatten 10 dakika 10 saniye çıkarır

        System.out.println(time.withMinute(0).withSecond(0)); // Saatin dakika ve saniyesini 0 yapar

        System.out.println(time.compareTo(time)); // aynı ise 0 döner
    }
}

package day36_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Checked exceptions kod yazılır yazılmaz, run edilmeden
        Java'nın riskli kodları tanımlayıp, çalıştırmadan önce uyarı verdiği exception türüdür.

       Checked exceptions genelde dosya okuma-yazma IO işlemlerinde oluşur.

       IO Exception oluşma ihtimaline karşı Java kodu yazınca altını çizer

       Checked exception kodun altını çizdiğinden kodun çalışması için kırmızı çizgiyi
       kaldırmamız gerekiyor.

        1- try-catch blogu kullanılarak exception handle edilebilir ve Java'ya exception oluştuğunda
        ne yapması gerektiği gösterilebilir.

        2- Eğer exception'u handle etmek istemiyorsak sadece kodumuzun çalışmasını istiyorsak
        O zaman method deklarasyonuna bu exception ihtimalini yazarak kodu çalışır hale getirebiliriz.

        Method signature'ına throws keyword'u ile beklenen exception türünü yazarsak
        kod çalışır duruma gelir. Ancak hata oluşursa kod çözüm yolu sunulmadığından kod çalışmaz.


         */

        String dosyaYolu="src/day36_Exceptions/text.txt";

        FileInputStream fis = new FileInputStream(dosyaYolu);
    }
}

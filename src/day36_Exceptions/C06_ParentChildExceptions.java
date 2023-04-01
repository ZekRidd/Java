package day36_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_ParentChildExceptions {
    public static void main(String[] args) {

        String dosyaYolu="src/day36_Exceptions/text.txt";

        FileInputStream fis = null;
        try {

            fis = new FileInputStream(dosyaYolu);

            int k = 0;
            while((k=fis.read()) != (-1)){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }
}
/*
    Eğer kodumuzda birden fazla exception varsa ve bu exception'lar arasında
    parent child ilişkisi varsa
    1- ya sadece parent'i yazarız
    çünkü parent exception child exception'ı da kapsar

    2- ya da ikisini de yazmak istiyorsak
    önce child exception'u yazarız, yukarıdaki örnekte FileNotFoundException IOException class'ının child class'ıdır.
 */


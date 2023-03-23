package day33_polymorphism;

public class BChild extends AParent{

    void method1(){
       // super.method1();
        //Burada super. olursa hem Child class'daki method1
        // Hem de super class'daki method1 calisir

    }

    void method2(){

        /*
        Override method ile overridding method'un
        isim ve signature'ları aynı olmalıdır.

        return type ve access modifier signature'a dahil değildir

        Ancak overriding'de bunlarla ilgili de kurallar vardır.

        1- Access Modifier kuralı ;
            -Child, parent class'ı kısıtlayamaz.
            Kapsama alanı child'in daha geniş olmalıdır

        2 - Return type kuralı;
            -Return type primitive ve void ise
            iki method'un return type'ı aynı olmalıdır.

            -Non primitive ise ya aynı olmalı veya parent class'daki
            return type child class'daki return type'ın parent'i olmalı

            (Covariant data)



         */

    }

    Integer method3(){
        /*
        Bir method override edildiğinde
        child class'da @Override notasyonu KULLANILABILIR

        Kullanmak veya kullanmamak arasında pratikte şöyle
        bir sonuç oluşur

        Eğer notasyon kullanılırsa iki method arasındaki
        ilişki takip edilir parent class'daki method silinirse
        @Override notasyonu CTE verir

        Eğer notasyon yoksa parent class'daki overridden method
        silinirse CTE oluşmaz

         */
        return 5;
    }
}

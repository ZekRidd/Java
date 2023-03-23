package day34_abstractClasses;

public class DGocmenKuslar extends BKuslar{

    /*
        Sadece farkını belirtmek için
        abstract olmayan class'lara CONCRETE Class denir.

        1-Abstract bir class parent'i olan abstract class'daki
        abstract methodları IMPLEMENT etmek zorunda değildir.

        Isterse implement edip concrete hale getirir, isterse
        yok sayar.

        2-Abstract bir silsileden sonra gelen
        ilk concrete class parent veya grandParent(s) olan abstract class'larda
        concrete yapılmayan tüm abstract class'ları IMPLEMENT etmek zorundadır.


     */

    @Override
    public void hareket() {

    }

    @Override
    public void beslenme() {

    }

    @Override
    public void omur() {

    }
}

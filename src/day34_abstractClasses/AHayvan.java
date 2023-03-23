package day34_abstractClasses;

public abstract class AHayvan {

    /*
        Bir class'ı abstract yapmak için deklerasyona
        abstract yazmak yeterlidir.

        Abstract class'lar class oldukları için constructor'ları vardır
        ama  abstract class'lardan obje oluşturulamaz

        Abstract class'larda bugune kadar kullandığımız yapıda methodlar oluşturabiliriz
        ancak bunlar child class'lar tarafından uyarlanmak(override) zorunda olmaz.

        Child class'ları uyarlamaya mecbur etmek istediğimizde method'ları da abstract yapmalıyız

        Bir methodu abstract yapmak için declaration'a abstract yazmamız yeterlidir.

     */

    public abstract void hareket();

    public abstract void solunum();

    public abstract void beslenme();

    public abstract void cogalma();

    public abstract void omur();
}

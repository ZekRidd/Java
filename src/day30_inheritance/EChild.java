package day30_inheritance;

public class EChild extends DParentAccessModifier{

    static int sayiChildStatic;

    public static void main(String[] args) {

        //Inheritance da private class üyeleri inherit edilemez

        EChild eChild = new EChild();

        eChild.sayiDefault = 10;
        eChild.sayiProtected=1;
        eChild.sayi = 2;

        /*
        İçinde bulunduğumuz class'daki static variable'lar
        obje üzerinden otomatik gelmez ama
        Java kabul eder
         */
        System.out.println(eChild.sayiChildStatic);

        /*
        Ancak parent class'daki static variable'lar obje üzerinden
        Kullanılamaz, Class.isim ile kullanabiliriz
         */

       // System.out.println(eChild.sayiStaticPrivate);

        System.out.println(DParentAccessModifier.sayiStaticProtected);
        // Bu kullanım için inheritance'a ihtiyaç yok

    }
}

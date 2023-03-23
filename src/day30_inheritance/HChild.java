package day30_inheritance;

public class HChild extends GParent{

    protected int sayiChild;
    HChild(){
        System.out.println("Child Class constructor'ı çalıştı");
    }

    public static void main(String[] args) {

        HChild objChild = new HChild();

        System.out.println(objChild.sayiChild);
        System.out.println(objChild.sayiParent);
        System.out.println(objChild.sayiGrandParent);

        /*
        Child class'tan oluşturduğumuz bir obje Parent ve GrandParent class'larındaki tüm
        özelliklere sahip olur

        Bir obje oluşturulduğunda ilk değeleri alabilmesi için
        mutlaka bir constructor çalışmalıdır.

        Bu class'dan obje oluşturmak için HCHild constructor'ını kullandık
        Ama objemiz parent ve grandparent'teki özellikleri de üstlendi.

        Her ne kadar obje'yi child class'tan oluştursak da bu objenin parent ve grandparent teki özellikleri
        alabilmesi için o class'lardaki constructor'ları da çalışmak zorundadır

        Buna super() super Constructor call denir
         */


    }
}

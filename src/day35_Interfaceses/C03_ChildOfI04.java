package day35_Interfaceses;

import day29_Inheritance.C03_ParentClass;

public class C03_ChildOfI04 implements I04_InterfaceIstisnalar{
    @Override
    public void toplama() {

    }

    public static void main(String[] args) {
        C03_ChildOfI04 obj = new C03_ChildOfI04();
        obj.ekIsler(); // Default ile oluşturulana obje ile ulaşabiliriz
                        // Default keyword ile body'si olan method oluşturulabilir yazdırır

        I04_InterfaceIstisnalar.aciklama(); // Static ile oluşturulana class yardımıyla ulaşabiliriz
                                            // Bu methodu implement etmek mecbure değildir yazdırır
    }
}

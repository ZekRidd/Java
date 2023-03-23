package day29_Inheritance;

public class C02_EncapsulationUse {
    public static void main(String[] args) {

        C01 object = new C01();
        object.isim="Melike"; // write
        System.out.println(object.isim); // read

        object.setSayi(33); //Write
        System.out.println(object.getSayi()); //read

        /*
        Bir class üyesine hem getter hem de setter özelliğini atamak ile
        public olarak atamak aynı işlevselliği oluşturur.

        Bazı dev'ler get ve set yetkilerinin kullanıldığını
        belirtmek için bu yöntemi kullanırlar
         */

    }
}

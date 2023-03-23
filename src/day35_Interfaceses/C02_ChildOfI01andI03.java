package day35_Interfaceses;

public class C02_ChildOfI01andI03 implements I01_Interfaces, I03_Interface {

    /*

    Interface'in en önemli faydas
    Bir class'ın birden fazla interface'i implement edebilmesidir.

    Bir class'ı extends ile de başka class'a Child yapabiliriz.

    Ancak birden fazla interface'i implement ederken dikkat etmemiz gereken bir konu vardır;
    Eğer implement etmek istediğimiz farklı interface'lerde aynı isimde fakat
    farklı return type'ı olan methodlar varsa iki methodu aynı anda implement edemeyeceğimiz için
    birinden vazgeçmek zorundayız.
     */
    @Override
    public void toplama() {

    }

    @Override
    public void cikarma() {

    }

    @Override
    public String ekleme() {
        return null;
    }

    @Override
    public int faktoriyel() {
        return 0;
    }

    @Override
    public void bolme() {

    }

    public static void main(String[] args) {

        C02_ChildOfI01andI03 obj = new C02_ChildOfI01andI03();

        System.out.println(I01_Interfaces.str);
        System.out.println(I03_Interface.str);

        System.out.println(I02_Interface.sayi);
    }


}

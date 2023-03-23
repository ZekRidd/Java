package day35_Interfaceses;

import day32_inheritanceDataTypeUse.BKuslar;

public class C01_ChildofI01 extends BKuslar implements I01_Interfaces{
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

    public static void main(String[] args) {

        System.out.println(I01_Interfaces.sayi);
    }
}

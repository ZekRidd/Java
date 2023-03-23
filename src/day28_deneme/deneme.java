package day28_deneme;

import day28_AccessModifier_encapsulation.C01;

public class deneme {
    public static void main(String[] args) {

        C01 obj = new C01();
      //   obj.str = "Fava"; farklı package olduğu için default
        // AccessModifier'a ulaşamayız

        // C01.s = "Fava"; class üzerinden de ulaşamam
        // Static olup olmamasının bir alakası yok.

        obj.d=50; // public olarak tanımlı olduğu için ulaşabilirim

        C01.a=40; // Class üzerinden static olduğu için ulaşabilirim
    }
}

package day31_inheritance;

public class BAraba {

    String str1 = "Araba";

    protected BAraba(){
        System.out.println("Araba parametresiz constructor çalıştı");
    }

    protected BAraba(String str){
        System.out.println("Araba str parametreli constructor çalıştı");
    }

    protected BAraba(int a, int b ){
        System.out.println("Araba 2 int parametreli constructor çalıştı");
    }
}

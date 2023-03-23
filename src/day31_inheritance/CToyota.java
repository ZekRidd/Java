package day31_inheritance;

public class CToyota extends BAraba{
    String str2 = "Toyota";

    protected CToyota(){
        System.out.println("Parametresiz Toyota constructor çalıştı");
    }

    protected CToyota(int a){
        System.out.println("Int Parametreli Toyota constructor çalıştı");
    }

    protected CToyota(String s){
        System.out.println("String Parametreli Toyota constructor çalıştı");
    }
}

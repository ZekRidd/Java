package day32_inheritanceDataTypeUse;

public class EChild extends DParent{

    String str = "Child";


    void method1(){
        System.out.println("Child method1");
    }

    /*
    Override : geçersiz kılma
    Overridden : geçersiz kılınan
     */

    public static void main(String[] args) {
        EChild childC = new EChild();
        childC.method1(); // Child method1 yazdırır
        System.out.println(childC.str); // Child

        DParent childP = new EChild(); // Variable olarak  yaptığımız için genel olan özelliği alır
        System.out.println(childP.str); // Parent

        childP.method1(); // Child method1 yazdırır, Method overriding, en özel olanı getirir
    }
}

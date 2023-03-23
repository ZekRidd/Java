package day29_Inheritance;

public class C04_ChildClass extends C03_ParentClass {

    int c = 20;
    int a;

    String s = "Child Class";
    String m;

    public void method1(){
        System.out.println("Child Class Method çalıştı");
    }

    public static void main(String[] args) {
        C04_ChildClass ObjC04 = new C04_ChildClass();

        ObjC04.b=8;
        ObjC04.a=22;
        ObjC04.t="y";
        ObjC04.method2();

        /*
        C04Class'ını C03'e child yapınca, Child class'da olmayıp
        parent class'da olan b,t ve method2() özellikleri child class'a
        eklendi
         */


    }

}

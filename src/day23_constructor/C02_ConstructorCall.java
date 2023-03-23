package day23_constructor;

import javax.imageio.stream.ImageInputStream;

public class C02_ConstructorCall {
    /*
    Java'da ihtiyac olursa bir constructor içinden başka bir constructor çağrılabilir
    this(ilgili parametreler) yazarak istediğimiz constructor'ı çağırabiliriz
    Constructor call için 2 kural vardır;
    1- constructor call içinde bulunduğu constructor'ın ilk satırında olmalıdır
     */
    int sayi;
    String str;
    public C02_ConstructorCall() {
        System.out.println("Parametresiz constructor çalıştı");
    }
    public C02_ConstructorCall(int sayi) {
        this.sayi = sayi;
        System.out.println("Integer parametreli constructor çalıştı");
    }
    public C02_ConstructorCall(String str) {
        this(5);
        this.str = str;
        System.out.println("String parametreli constructor çalıştı");
    }
    public C02_ConstructorCall(int sayi, String str) {
       //  C02_ConstructorCall böyle çağırmak istediğimizde
        // Java methot call olarak algılar

        this(); // Java syntax olarak constructor call olarak bunu belirlemiştir
        this.sayi = sayi;
        this.str = "Java";
        System.out.println("2 parametreli constructor çalıştı");
    }

    public static void main(String[] args) {

        C02_ConstructorCall obj3 = new C02_ConstructorCall(7,"Selcuk");
        System.out.println(obj3.sayi); // 7 yazdırır
        System.out.println(obj3.str); // Java yazdırır

        /*
        C02_ConstructorCall obj2= new C02_ConstructorCall("Java"); // String parametreli constructor çalışır daha sonra ilk satırında çağrılar this(); constructor'ı çalıştırır
        System.out.println(obj2.sayi); // 5 yazdırır
        System.out.println(obj2.str); // Java yazdırır

         */

       // C02_ConstructorCall obj1= new C02_ConstructorCall(); // default constructor çalışır
    }
}

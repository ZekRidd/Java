package day35_Interfaceses;

public interface I04_InterfaceIstisnalar {

    void toplama();

    static void aciklama(){
        System.out.println("Bu methodu implement etmek mecbure değildir");
    }

    default void ekIsler(){
        System.out.println("Default keyword ile body'si olan method oluşturulabilir");
    }
}

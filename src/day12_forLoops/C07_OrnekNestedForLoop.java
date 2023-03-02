package day12_forLoops;

public class C07_OrnekNestedForLoop {
    public static void main(String[] args) {

        int satir = 4;

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

        System.out.println("=======");

        for (int i = satir; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}

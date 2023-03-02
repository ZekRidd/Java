package day12_forLoops;

public class C03_Faktoriyel {
    public static void main(String[] args) {
        int sayi=6;
        int faktoriyel = 1;

        System.out.print ("6! = ");

        for (int i = sayi; i >= 1; i--) {

            faktoriyel *=i;

            if (i!=1) {
                System.out.print (i+ " * ");
            } else {
                System.out.print(i + " ");
            }

        }
        System.out.print("= " + faktoriyel);
    }
}

package day05_grupCalisma;

public class CalismaSorulari {
    public static void main(String[] args) {
        /*

        Konsola aşağıdaki şekili yazdırın

        *********
        ******
        ****
        **


         */

        /*

        for (int i = 4; i > 0 ; i--) {
            for (int j = i*2; j>0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

         */

       /* for (int i = 8; i >0 ; i--) {
            for (int j = i; j >0 ; j-=2) {
                if (i>3){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        */

        for (int i = 8; i >= 2; i -= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}




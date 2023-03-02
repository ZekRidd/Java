package day14_MethodOlusturmaWhileLoop;

public class C05_WhileLoop {
    public static void main(String[] args) {
        /*
        Başlangıç ve bitiş değeri belli olan
        veya kaç kere tekrar edileceği bilinen loop'larda
        for loop ideal olarak kullanılabilir

        Ancak tekrar sayısı belli olmayan başlangıç veya
        bitişi başka bir variable'a bağlı olan durumlarda
        for loop yerine while tercih edilir
         */





        // Kullanıcıdan toplanmak üzere sayılar alın
        // toplam 500'ü aşınca
        // kaç sayı girdiğini ve sayıların toplamını yazdırın

        int toplam1 = 0;

        for (int i = 50; i <100 ; i++) {
            toplam1 +=i;
            
        }

        System.out.println("for ile toplam : " + toplam1);

        // aynı soruyu while ile yapalım

        int sayi = 50;
        int toplam2=0;
        while (sayi<100){

            sayi++;
            toplam2 += sayi;
        }

        System.out.println("while ile toplam : " + toplam2);



    }



}

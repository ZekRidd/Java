package day21_forEachLoop;

public class C02_forEach {
    public static void main(String[] args) {
        // enhanced; gelişmiş for döngüsü

        /*
        Bizden istenen görevde, sıralama önemsiz ise, asıl amaçlanan tüm elementleri elden geçirmek ise
        for loop yerine foreach loop tercih edilir
        for each loop da
            index yok
            başlangıç değeri yok
            bitiş değeri yok
         */

        int[] arr = {1,3,4,5,2,4,5,6,7,8,2,3,1,3};

        // arr'in tüm elementlerinin toplamını yazdırın

        int toplam = 0;

        for (int each:arr
             ) {
            toplam += each;
        }

        System.out.println("Elementler toplamı :" + toplam); // Elementler toplamı :54

        // arr'in elementlerinden 3 ile bölünebilenleri yazdırın

        for (int each: arr
             ) {
            if(each%3==0) {
                System.out.print(each + " ");
            }
        }

        // arr'in elementleri içinde kaç tane tek sayı olduğunu yazdırın

        int sayac = 0;

        for (int each: arr
             ) {
            if(each%2!=0) {
                sayac++;
            }
        }

        System.out.println("Tek elemanlar adedi: " + sayac);


    }
}

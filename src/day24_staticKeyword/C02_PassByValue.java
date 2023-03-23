package day24_staticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {

        double fiyat = 200;


        /*
        String fiyat = "Java pass by value kullanır";
        Java aynı metot içerisinde birden fazla aynı isimde variable oluşturulmasına izin vermez
         */

        indirimYap10(fiyat);
    }

    public static void indirimYap10(double fiyat) {
        fiyat = fiyat * 0.9;
        System.out.println("Yüzde 10 indirimli fiyat : " + fiyat);
    }
}

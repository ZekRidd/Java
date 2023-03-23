package day26_LocalTimeVarArgs;

import java.time.LocalDate;

public class C02_LocalDate {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date); // Şuanki tarihi verir

        System.out.println(date.getMonth()); // MARCH
        System.out.println(date.getDayOfMonth()); // 10
    }
}

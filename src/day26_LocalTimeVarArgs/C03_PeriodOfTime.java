package day26_LocalTimeVarArgs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C03_PeriodOfTime {
    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1993,3,15);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(bugun, dogumTarihi)); // P-29Y-11M-26D

        LocalDate dogumTarihi2 = LocalDate.of(1993,10,30);
        System.out.println(Period.between(bugun, dogumTarihi2)); // P-29Y-4M-11D
    }

}

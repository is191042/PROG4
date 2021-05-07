package at.ac.fhstp.gof.strategy;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        Discounter easterDiscounter = new EasterDiscounter();

        BigDecimal discountedValue = easterDiscounter.apply(BigDecimal.valueOf(100));

        System.out.println(discountedValue + " == " + BigDecimal.valueOf(50));
    }
}

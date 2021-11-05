import calc.Calc;
import calc.Calcimp;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BigDecimal weight, pricePerKg, length, pricePerKm;
        try (Scanner scanner =  new Scanner(System.in)) {
            do {
                weight = getValueFromCon(scanner,"Enter weight:");
                System.out.println("it's test");
                pricePerKg = getValueFromCon(scanner,"Enter pricePerKg:");
                length = getValueFromCon(scanner,"Enter length:");
                pricePerKm = getValueFromCon(scanner,"Enter pricePerKm:");
                //committ
                //hello gitHub
                //BigDecimal result =  weight.multiply(pricePerKg).add(length.multiply(pricePerKm));
                System.out.println("Result " + new Calcimp().handle(weight, pricePerKg, length, pricePerKm));
            } while (!scanner.hasNext("q")) ;
                if (scanner.hasNext("q")) scanner.close();

        }
    }

    private static BigDecimal getValueFromCon(Scanner scanner, String outputMassage) {
        BigDecimal enteredValue;
        System.out.print(outputMassage);
        enteredValue = scanner.nextBigDecimal();
        return enteredValue;
    }

}

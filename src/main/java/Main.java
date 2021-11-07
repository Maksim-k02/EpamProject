
import model.ReadData;
import model.Status;
import model.StatusType;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TODO read from file
        //pricePerKg = getValueFromCon(scanner,"Enter pricePerKg:");
        //pricePerKm = getValueFromCon(scanner,"Enter pricePerKm:");
        //BigDecimal weight, pricePerKg, length, pricePerKm;

        try (Scanner scanner =  new Scanner(System.in)) {
            Status currentStatus =  new ReadData(scanner);
            while (currentStatus.getType() != StatusType.EXIT){
                System.out.println("current type: " + currentStatus.getType());
                currentStatus = currentStatus.handle();

            }



        }
    }

}

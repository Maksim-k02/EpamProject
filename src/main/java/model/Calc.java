package model;

import java.math.BigDecimal;
import java.util.Scanner;

import static model.StatusType.*;

public class Calc  implements Status{

    Scanner scanner;

    public Calc(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Status handle() {

        try {
            System.out.println("Result " + userData.get(0).multiply(BigDecimal.valueOf(1)).add(userData.get(1).multiply(BigDecimal.valueOf(1))));
        } finally {
            userData.clear();
        }
        return new ReadData(scanner);
    }

    @Override
    public StatusType getType() {
        return CALC;
    }
}

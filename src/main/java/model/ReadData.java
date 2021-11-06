package model;


import java.math.BigDecimal;
import java.util.Scanner;

import static model.StatusType.*;

public class ReadData implements Status{

    Scanner scanner;

    public ReadData(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Status handle() {
        if (userData.size()<2){
            System.out.println(messages.get(userData.size()));
            String inputValue = scanner.next();
            if (inputValue.equalsIgnoreCase("q")){
                return new Exit();
            } else if (isCorrectValue(inputValue)){
                userData.add(new BigDecimal(inputValue));
            }

        } else {
            return  new Calc(scanner);
        }
        return this;
    }

    private boolean isCorrectValue(String inputValue) {
        try {
            BigDecimal enterValue =  new BigDecimal(inputValue);
            return enterValue.doubleValue() > 0;
        } catch (NumberFormatException nfe){
            System.out.println("Incorrect value " + inputValue);
        }
        return false;
    }

    @Override
    public StatusType getType() {
        return READ_DATA;
    }
}

package calc;

import java.math.BigDecimal;

public interface Calc {

    BigDecimal handle(BigDecimal weight, BigDecimal pricePerKg, BigDecimal length, BigDecimal pricePerKm);
}

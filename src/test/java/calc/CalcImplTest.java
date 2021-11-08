package calc;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CalcImplTest {
    Calc calc = new Calcimp();

    @Test
    void handle() {
        BigDecimal weight =  new BigDecimal(10);
        BigDecimal weightPrice =  new BigDecimal(10);
        BigDecimal length =  new BigDecimal(10);
        BigDecimal lengthPrice =  new BigDecimal(10);
        assertNotNull(calc);
        assertEquals(new BigDecimal("200"), calc.handle(weight,weightPrice,length,lengthPrice));

    }
}
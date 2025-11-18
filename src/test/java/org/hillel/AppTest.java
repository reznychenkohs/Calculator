package org.hillel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


public class AppTest {

    @Test
    public void checkSum() {
        App.calculate(3,3,"+");
        assertEquals(6, App.getResult(), "3 + 3 = " + App.getResult());
    }

    @Test
    public void checkSubtraction() {
        App.calculate(5,3,"-");
        assertEquals(2, App.getResult(), "5 - 3 = " + App.getResult());
    }

    @Test
    public void checkMultiplication() {
        App.calculate(6,3,"*");
        assertEquals(18, App.getResult(), "6 * 3 = " + App.getResult());
    }

    @Test
    public void checkDivision() {
         App.calculate(6,3,"/");
        assertEquals(2, App.getResult(), "6 / 3 = " + App.getResult());
    }

}

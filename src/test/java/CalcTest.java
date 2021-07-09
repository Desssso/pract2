import com.company.Calc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void sum() {
        Calc calc = new Calc();

        int s = calc.sum(2,4);

        assertEquals(6, s);
    }

    @Test
    void sub() {
        Calc calc = new Calc();

        int s = calc.sub(4,2);

        assertEquals(2, s);
    }

    @Test
    void mul() {
        Calc calc = new Calc();

        int s = calc.mul(2,4);

        assertEquals(8, s);
    }

    @Test
    void div() {
        Calc calc = new Calc();

        int s = calc.div(10,5);

        assertEquals(2, s);
    }

    @Test
    void divnull() {
        Calc calc = new Calc();

        try {
            int s = calc.div(10, 0);

            assertEquals(-1, s);
        }catch (ArithmeticException e){};
    }
}
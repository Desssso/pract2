import com.company.Equation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EquationTest {

    @Test
    void root() {
        Equation equation = new Equation();
        ArrayList<Double> arr1;
        ArrayList<Double> arr2 = new ArrayList<Double>();

        arr1 = equation.root(1,4,-5);
        arr2.add(-5.0);
        arr2.add(1.0);

        Assertions.assertEquals(arr2,arr1);
    }

    @Test
    void root_one() {
        Equation equation = new Equation();
        ArrayList<Double> arr1;
        ArrayList<Double> arr2 = new ArrayList<Double>();

        arr1 = equation.root(3, -18, 27);
        arr2.add(3.0);

        Assertions.assertEquals(arr2, arr1);
    }

    @Test
    void root_null() {
        Equation equation = new Equation();
        ArrayList<Double> arr1;
        ArrayList<Double> arr2 = new ArrayList<Double>();

        arr1 = equation.root(3, 8, 27);

        Assertions.assertEquals(arr2, arr1);
    }
}
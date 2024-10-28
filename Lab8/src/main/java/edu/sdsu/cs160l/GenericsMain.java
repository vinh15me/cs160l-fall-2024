package edu.sdsu.cs160l;

import edu.sdsu.cs160l.calculator.Calculator;
import edu.sdsu.cs160l.calculator.DoubleCalculator;
import edu.sdsu.cs160l.calculator.IntegerCalculator;

/**
 * Locate 2 todos
 *  1) Calculator Interface
 *  2) Math Operations class
 */
public class GenericsMain {
    public static void main(String[] args) {
        IntegerCalculator integerCalculator = new IntegerCalculator();
        DoubleCalculator doubleCalculator = new DoubleCalculator();
        int aInt = 23;
        int bInt = 123;
        double aDouble = 23.23;
        double bDouble = 123.123;

        System.out.println("Integer a = " + aInt);
        System.out.println("Integer b = " + bInt);
        System.out.println("Double a = " + aDouble);
        System.out.println("Double b = " + bDouble);

        System.out.println(integerCalculator.add(aInt,bInt) + " Integer Add");
        System.out.println(integerCalculator.sub(aInt,bInt) + " Integer Sub" );
        System.out.println(integerCalculator.mul(aInt,bInt) + " Integer Mul");
        System.out.println(integerCalculator.div(aInt,bInt) + " Integer Div");

        System.out.println(doubleCalculator.add(aDouble,bDouble) + " Double Add");
        System.out.println(doubleCalculator.sub(aDouble,bDouble) + " Double Sub");
        System.out.println(doubleCalculator.mul(aDouble,bDouble) + " Double Mul");
        System.out.println(doubleCalculator.div(aDouble,bDouble) + " Double Div");
    }
}

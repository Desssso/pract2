package com.company;

public class Main {

    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.sum(2,4);
        calc.sub(5,3);
        calc.mul(4,5);
        calc.div(20,4);

        Equation r = new Equation();
        r.root(1,4,-5);
    }
}

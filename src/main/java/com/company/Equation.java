package com.company;

import java.util.ArrayList;

public class Equation {
    private double x1,x2,x;

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getX() {
        return x;
    }

    public ArrayList root(double a, double b, double c){
        ArrayList<Double> arr = new ArrayList<Double>();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            arr.add(x1);
            arr.add(x2);
        } else if (d == 0) {
            x = -b / (2 * a);
            arr.add(x);
        }
        return arr;

    }
}

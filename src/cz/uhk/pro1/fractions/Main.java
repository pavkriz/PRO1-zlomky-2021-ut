package cz.uhk.pro1.fractions;

import cz.uhk.pro1.fractions.model.Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        double d = f1.toDouble();
        System.out.println(d);
        String s = f1.toString();
        System.out.println(s);
    }
}

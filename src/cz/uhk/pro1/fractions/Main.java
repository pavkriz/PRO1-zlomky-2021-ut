package cz.uhk.pro1.fractions;

import cz.uhk.pro1.fractions.model.Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 0);
        double d = f1.toDouble();
        System.out.println(d);
        String s = f1.toString();
        System.out.println(s);
        ////System.out.println(f1.denominator);
        //f1.denominator = 10;
        System.out.println(f1.getDenominator());
        //f1.setDenominator(0);
    }
}

package cz.uhk.pro1.fractions.test;

import cz.uhk.pro1.fractions.model.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {

    @Test
    public void testToString() {
        // vstupni data
        Fraction f = new Fraction(1,3);
        // provedeme operaci
        String s = f.toString();
        // overime vysledky
        assertEquals("1/3", s);
    }

    @Test
    public void testMult() {
        // vstupni data
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction (1, 2);
        // provedeme operaci
        Fraction r = f1.mult(f2);
        // overit vysledek
        assertEquals(1, r.getNumerator());
        assertEquals(6, r.getDenominator());
    }

    @Test
    public void testPlus() {
        // vstupni data
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction (1, 2);
        // provedeme operaci
        Fraction r = f1.plus(f2);
        // overit vysledek
        assertEquals(5, r.getNumerator());
        assertEquals(6, r.getDenominator());
    }

    @Test
    public void testMinus() {
        // vstupni data
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction (1, 4);
        // provedeme operaci
        Fraction r = f1.minus(f2);
        // overit vysledek
//        assertEquals(1, r.getNumerator());
//        assertEquals(4, r.getDenominator());
        assertEquals(1, r.getNumerator());
        assertEquals(4, r.getDenominator());
    }

    @Test
    public void testNormalized() {
        Fraction f = new Fraction(10,20);
        Fraction r = f.normalized();
        assertEquals(1, r.getNumerator());
        assertEquals(2, r.getDenominator());
    }

    @Test(expected = RuntimeException.class)
    public void testZeroDenominatorConstructor() {
        Fraction f1 = new Fraction(1, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testZeroDenominatorSetter() {
        Fraction f1 = new Fraction(1, 2);
        f1.setDenominator(0);
    }
}

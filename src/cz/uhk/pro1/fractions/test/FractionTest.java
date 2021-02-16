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
}

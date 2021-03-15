package cz.uhk.pro1.fractions.test;

import cz.uhk.pro1.fractions.model.Fraction;
import cz.uhk.pro1.fractions.model.FractionList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionListTest {
    @Test
    public void testSum() {
        // pripravime vstupy
        Fraction f1 = new Fraction(1,4);
        Fraction f2 = new Fraction(2,4);
        Fraction f3 = new Fraction(3,4);

        FractionList list = new FractionList();
        list.addFraction(f1);
        list.addFraction(f2);
        list.addFraction(f3);

        // provedeme operaci
        Fraction vysledek = list.sum();
        // zkontrolujeme vysledek
        assertEquals(3,vysledek.getNumerator());
        assertEquals(2,vysledek.getDenominator());
    }

    @Test(expected = RuntimeException.class)
    public void testEmpty() {
        FractionList list = new FractionList();
        list.sum();

    }

    @Test
    public void testMult() {
        // pripravime vstupy
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(1,4);
        Fraction f3 = new Fraction(1,5);

        FractionList list = new FractionList();
        list.addFraction(f1);
        list.addFraction(f2);
        list.addFraction(f3);

        // provedeme operaci
        Fraction vysledek = list.product();
        // zkontrolujeme vysledek
        assertEquals(1,vysledek.getNumerator());
        assertEquals(40,vysledek.getDenominator());
    }

}

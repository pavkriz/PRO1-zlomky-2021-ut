package cz.uhk.pro1.fractions.model;

import javax.management.RuntimeErrorException;
import java.util.ArrayList;
import java.util.List;

public class FractionList {

    private final List<Fraction> fractions = new ArrayList<>();

    public void addFraction(Fraction fr)
    {
        fractions.add(fr);
    }

    /**
     * Vypocita soucet vsech zlomku v seznamu.
     * @return soucet zlomku
     * @throws RuntimeException v pripade, ze je seznam prazdny
     */
    public Fraction sum()
    {
        assertNotEmpty();
        Fraction result = fractions.get(0);
        for(int i = 1; i < fractions.size(); i ++)
        {
            result = fractions.get(i).plus(result);
        }
        return result;
    }

    private void assertNotEmpty() {
        if (fractions.isEmpty()) {
            throw new RuntimeException("V seznamu se nenachazí žádné zlomky");
        }
    }

    public Fraction product()
    {
        assertNotEmpty();
        Fraction result = fractions.get(0);
        for(int i = 1; i < fractions.size(); i++){
            result = fractions.get(i).mult(result);
        }
        return result;
    }
}

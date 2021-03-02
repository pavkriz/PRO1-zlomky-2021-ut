package cz.uhk.pro1.fractions.model;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        setDenominator(denominator);
    }

    public double toDouble(){
        return ((double)numerator/denominator);
    }

    @Override
    public String toString(){
        return numerator +"/" + denominator;
    }

    public Fraction mult(Fraction f2) {
        // TODO
        return new Fraction(1,1);
    }

    public Fraction plus(Fraction f2) {
        int newDenominator= this.denominator*f2.denominator;
        int newNumerator = this.denominator * f2.numerator + this.numerator * f2.denominator;
        return new Fraction(newNumerator,newDenominator).normalized();
    }

    public int greatestCommonDivisor(int a, int b){
        int min = 0;
        if(a <b) {
            min = a;
        }else{
            min = b;
        }
    int divisor = 1;
        for(int i = 1; i <= min;i++){
            if(a%i ==0 && b%i ==0){
                divisor = i;
            }
        }

        return divisor;
    }

    public Fraction normalized(){
        int divisor = greatestCommonDivisor(numerator,denominator);
        Fraction result = new Fraction(numerator/divisor,denominator/divisor);
        return  result;
    }

    /**
     * Odecte od zlomku druhy zlomek.
     *
     * @param f2 druhy zlomek
     * @return novy zlomek, ktery je vysledkem operace odecitani, ve zkracene podobe
     */
    public Fraction minus(Fraction f2) {
        // behem odecitani nebude resit nejmensi poslecny jmenovatel
        int newDenominator= this.denominator * f2.denominator;
        int newNumerator = this.numerator * f2.denominator - this.denominator * f2.numerator ;

        Fraction result = new Fraction(newNumerator,newDenominator); // vysledek odecitani (nezkraceny)
        Fraction realResult = result.normalized(); // vysledek odecitani zkraceny

        return  realResult;
    }

    public Fraction div(Fraction f2) {
        int newDenominator= this.denominator * f2.numerator;
        int newNumerator = this.numerator * f2.denominator;
        Fraction result = new Fraction(newNumerator,newDenominator).normalized();
        return  result;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
       if (denominator != 0) {
           this.denominator = denominator;
       } else {
           throw new RuntimeException("Denominator must not be 0");
       }
    }
}

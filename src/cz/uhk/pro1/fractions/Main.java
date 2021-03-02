package cz.uhk.pro1.fractions;

import cz.uhk.pro1.fractions.model.Fraction;

import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Fraction f1 = new Fraction(1, 0);
        //double d = f1.toDouble();
        //System.out.println(d);
        //String s = f1.toString();
        //System.out.println(s);
        ////System.out.println(f1.denominator);
        //f1.denominator = 10;
        //System.out.println(f1.getDenominator());
        //f1.setDenominator(0);
        Random random = new Random();
        Fraction f1 = new Fraction(random.nextInt(11), random.nextInt(10)+1);
        Fraction f2 = new Fraction(random.nextInt(11), random.nextInt(10)+1);

        System.out.println("tady máš první zlomek");
        System.out.println(f1.toString());
        System.out.println("tady máš druhý zlomek");
        System.out.println(f2.toString());

        int cislo = random.nextInt(4)+1; // vygenerujeme nahodne cislo, podle ktereho urcime operaci k vypoctu
        Fraction vysledek = null;  // bude predpocitany spravny vysledek
        switch (cislo){
            case 1:
                System.out.println("vynásob zlomky mezi sebou");
                vysledek = f1.mult(f2);
                break;
            case 2:
                System.out.println("sečti zlomky");
                vysledek = f1.plus(f2);
                break;
            case 3:
                System.out.println("odečti zlomky");
                vysledek =f1.minus(f2);
                    break;
            case 4:
                System.out.println("vyděl zlomky");
                vysledek = f1.div(f2);
                break;

        }
        String str = JOptionPane.showInputDialog("Zadej vysledek ve tvaru citatel/jmenovatel");
        String stringVysledek = vysledek.toString();

        if(str.equals(stringVysledek))
        {
            System.out.println("tvůj zlomek je správně");

        }else{
            System.out.println("tvůj výsledek je špatně");
            System.out.println(vysledek.toString());
        }
    }
}

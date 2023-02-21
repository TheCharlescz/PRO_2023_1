package models;

import java.time.LocalDateTime;

public class Kalkulacka {
    private int posledniSoucet;
    private LocalDateTime casZmeny;

    public int getPosledniSoucet() {
        return posledniSoucet;
    }

    public void setPosledniSoucet(int c) {
        posledniSoucet = c;
        casZmeny = LocalDateTime.now();
    }

    public LocalDateTime getCasZmeny() {
        return casZmeny;
    }

    public int Soucet(int c1, int c2) {
        int soucet = c1 + c2;
        System.out.println("Součet " + c1 + " + " + c2 + " = " + soucet);
        setPosledniSoucet(soucet);
        return soucet;
    }

    public double Soucet(double c1, double c2) {
        System.out.println("Součet " + c1 + " + " + c2 + " = " + (c1 + c2));
        return c1 + c2;
    }

    public double Soucet(Cislo c1, Cislo c2) {
        double cislo1 = c1.getCislo();
        double cislo2 = c2.getCislo();

        System.out.println("Součet " + cislo1 + " + " + cislo2 + " = " + (cislo1 + cislo2));
        return cislo1 + cislo2;
    }

    public double Soucet(JednoCislo c1, JednoCislo c2) {
        double cislo1 = c1.getJednoCislo();
        double cislo2 = c2.getJednoCislo();

        System.out.println("Součet " + cislo1 + " + " + cislo2 + " = " + (cislo1 + cislo2));
        return cislo1 + cislo2;
    }
}

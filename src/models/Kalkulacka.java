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

}

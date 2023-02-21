package models;

import java.time.LocalDateTime;

public class Cislo {
    private double cislo;
    private LocalDateTime vytvoreno;

    public Cislo(double cislo) {
        this.cislo = cislo;
        vytvoreno = LocalDateTime.now();
    }

    public Cislo(double cislo, LocalDateTime vytvoreno) {
        this.cislo = cislo;
        this.vytvoreno = vytvoreno;
    }

    public double getCislo() {
        return cislo;
    }

    public LocalDateTime getVytvoreno() {
        return vytvoreno;
    }

    public static void vypisPocetHvezdicek(int x) {
        if (x == 0) return;
        String hvezdicky = "";
        for (int i = 0; i < x; i++) {
            hvezdicky += "*";
        }
        System.out.println(hvezdicky);
        vypisPocetHvezdicek(x - 1);
    }
}

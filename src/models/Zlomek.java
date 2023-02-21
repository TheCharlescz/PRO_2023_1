package models;

public class Zlomek implements JednoCislo {
    private int citatel;
    private int jmenovatel;

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    public int getCitatel() {
        return citatel;
    }

    public int getJmenovatel() {
        return jmenovatel;
    }

    public static int NejvetsiSpolecnyDelitel(int a, int b) {
        if (b == 0) return a;
        return NejvetsiSpolecnyDelitel(b, a % b);
    }

    @Override
    public String toString() {
        return citatel + "/" + jmenovatel;
    }

    @Override
    public boolean equals(Object obj) {
        Zlomek z1 = (Zlomek) obj;
        if (this.citatel != z1.getCitatel())
            return false;
        if (this.jmenovatel != z1.getJmenovatel())
            return false;
        return true;
    }

    @Override
    public double getJednoCislo() {
        return citatel / jmenovatel;
    }
}

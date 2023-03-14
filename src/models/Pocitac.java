package models;

public class Pocitac extends Zarizeni {
    private String cpu;

    public Pocitac(int id, String nazev, String cpu) {
        super(id, nazev);
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

}

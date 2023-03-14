package models;

public abstract class Zarizeni implements IZarizeni {
    private int id;
    private String nazev;

    public Zarizeni(int id, String nazev) {
        this.id = id;
        this.nazev = nazev;
    }

    public int getId() {
        return id;
    }

    public String getNazev() {
        return nazev;
    }

    public void zapnout() {
        System.out.println("aaa");
    }
}

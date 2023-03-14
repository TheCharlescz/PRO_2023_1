package models;

public class Meridlo extends Zarizeni {
    private String jednotka;

    public Meridlo(int id, String nazev, String jednotka) {
        super(id, nazev);
        this.jednotka = jednotka;
    }

    public String getJednotka() {
        return jednotka;
    }

    @Override
    public void zapnout() {
        //super.zapnout();
        System.out.println("bbbb");
    }
}

package models;

import java.util.ArrayList;
import java.util.List;

public class MeridloSDaty<T> extends Meridlo {
    private List<T> namereneHodnoty;

    public MeridloSDaty(int id, String nazev, String jednotka) {
        super(id, nazev, jednotka);
        namereneHodnoty = new ArrayList<>();
    }

    public List<T> getNamereneHodnoty() {
        return namereneHodnoty;
    }

    public void ulozHodnotu(T hodnota) {
        namereneHodnoty.add(hodnota);
    }
}

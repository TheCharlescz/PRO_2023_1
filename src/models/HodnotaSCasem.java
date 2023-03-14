package models;

import java.time.LocalDateTime;

public class HodnotaSCasem<T> {
    private T hodnota;
    private LocalDateTime cas;

    public HodnotaSCasem(T hodnota) {
        this.hodnota = hodnota;
        this.cas = LocalDateTime.now();
    }

    public T getHodnota() {
        return hodnota;
    }

    public LocalDateTime getCas() {
        return cas;
    }
}

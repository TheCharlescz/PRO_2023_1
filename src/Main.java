import models.Cislo;
import models.Kalkulacka;
import models.Zlomek;

public class Main {
    public static void main(String[] args) {
        int c1 = 10;
        int c2 = 20;
        int soucet = c1 + c2;

        System.out.println("Součet: " + soucet);
        System.out.println(Integer.MAX_VALUE);
        float f1 = 1f;
        double d1 = 2d;
        boolean b1 = true;
        String s1 = "sdadasda";

        int deleni = c2 / c1;
        float deleni2 = c1 / (float) c2;
        System.out.println(deleni2);
        if (soucet > 15) {
            System.out.println("součet větší než 15");
        } else {
            System.out.println("není");
        }

        Kalkulacka calc = new Kalkulacka();
        int soucet2 = calc.Soucet(19, 30);
        System.out.println("soucet2: " + soucet2);
        soucet2 = soucet2 + 10;
        soucet2 += 15;
        System.out.println("soucet2: " + soucet2);
        System.out.println("poslední součet:" + calc.getPosledniSoucet());
        calc.setPosledniSoucet(50);
        System.out.println("poslední součet:" + calc.getPosledniSoucet());

        int c10 = 10;
        int c11 = c10;
        if (c10 == c11)
            System.out.println("čísla jsou stejná");

        c10 = 15;

        Kalkulacka calc2 = new Kalkulacka();
        Kalkulacka calc3 = new Kalkulacka();

        if (calc2 != calc3)
            System.out.println("calc nejsou stejný stejný");

        Kalkulacka calc4 = calc2;
        if (calc4 == calc2)
            System.out.println("calc4 == calc2");

        calc2.Soucet(10, 18);

        System.out.println("poslední součet z calc4: " + calc4.getPosledniSoucet());


        Cislo cislo1 = new Cislo(15);

        Cislo cislo2 = new Cislo(23.6);

        double soucetCisel = cislo1.getCislo() + cislo2.getCislo();
        double soucetCisel2 = calc.Soucet(cislo1.getCislo(), cislo2.getCislo());
        double soucetCisel3 = calc.Soucet(cislo1, cislo2);


        Zlomek z1 = new Zlomek(5, 3);
        Zlomek z2 = new Zlomek(8, 5);

        System.out.println(z1);
        System.out.println(z1.toString());

        Zlomek z3 = new Zlomek(5, 3);
        if (z1 != z3)
            System.out.println("z1 != z3");

        if (z1.equals(z3))
            System.out.println("z1 equals z3");

        int modulo = 5 % 2;
        System.out.println("modulo:" + modulo);

        Cislo.vypisPocetHvezdicek(5);
        System.out.println("z1 společný dělitel: " + z1.NejvetsiSpolecnyDelitel(z1.getCitatel(), z1.getJmenovatel()));

        double soucet3 = calc.Soucet(z1, z2);

    }
}

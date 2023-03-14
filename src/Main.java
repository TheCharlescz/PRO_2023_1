import models.*;

import java.io.Console;
import java.util.*;

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

        Zlomek z4 = new Zlomek(16, 8);
        z4.ZkratitNaZakladniTvar();
        System.out.println("z4: základní tvar: " + z4);

        double soucet3 = calc.Soucet(z1, z2);

        // Ukázky pole
        int[] poleInt = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] poleInt2 = new int[10];
        for (int i = 0; i < poleInt2.length; i++) {
            poleInt2[i] = i;
        }

        poleInt2[7] = 70;

        for (int i = 0; i < poleInt2.length; i++) {
            System.out.println("prvek " + i + ": " + poleInt2[i]);
        }

        double[][] poleDouble2d = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };
        for (int i = 0; i < poleDouble2d.length; ++i) {
            for (int j = 0; j < poleDouble2d[i].length; ++j) {
                System.out.println("[" + i + "][" + j + "]: " + poleDouble2d[i][j]);
            }
        }
        double[][] poleDouble2d2 = new double[4][3];
        for (int i = 0; i < poleDouble2d2.length; i++) {
            for (int j = 0; j < poleDouble2d2[i].length; j++) {
                poleDouble2d2[i][j] = i + j;
            }
        }
        for (int i = 0; i < poleDouble2d2.length; ++i) {
            for (int j = 0; j < poleDouble2d2[i].length; ++j) {
                System.out.println("[" + i + "][" + j + "]: " + poleDouble2d2[i][j]);
            }
        }

        // do pole lze dávat i objekty
        String[] poleStringu = {"auto", "motorka", "kolo"};

        Zlomek[] poleZlomku = new Zlomek[4];
        poleZlomku[0] = new Zlomek(1, 3);
        poleZlomku[1] = new Zlomek(1, 4);
        poleZlomku[2] = new Zlomek(1, 5);
        poleZlomku[3] = new Zlomek(1, 6);

        for (int i = 0; i < poleZlomku.length; i++) {
            System.out.println(poleZlomku[i]);
        }

        Zlomek zlomekVytazenyZPole = poleZlomku[2];

        if (zlomekVytazenyZPole == poleZlomku[2])    // TRUE
            System.out.println("Je to stejný objekt");


        // řetězce
        Scanner input = new Scanner(System.in);
        if (false) {  // změnit na true pro vyzkoušení
            System.out.println("Zadejte text:");
            String nactenyText = input.nextLine();
            System.out.println("Zadali jste: " + nactenyText);
        }

        if (false) {  // změnit na true pro vyzkoušení
            System.out.println("Budeme zadávat zlomek.");
            System.out.println("Zadejte čitatele:");
            int nactenyCitatel = input.nextInt();
            System.out.println("Zadejte jmenovatele:");
            int nactenyJmenovatel = input.nextInt();

            Zlomek zlomek10 = new Zlomek(nactenyCitatel, nactenyJmenovatel);
            System.out.println("Zadali jste: " + zlomek10);
        }
        if (false) {  // změnit na true pro vyzkoušení
            Zlomek zlomek = Zlomek.NactiZlomekZConsole(input); // používáme statickou metodu
            System.out.println("zlomek11: " + zlomek);
            zlomek.ZkratitNaZakladniTvar();
            System.out.println("Zlomek lze zkrátit na základní tvar: " + zlomek);
        }
        if (false) {  // změnit na true pro vyzkoušení
            Zlomek zlomek = Zlomek.NactiZlomekZConsoleVar2(input); // používáme statickou metodu
            System.out.println("zlomek: " + zlomek);
            zlomek.ZkratitNaZakladniTvar();
            System.out.println("Zlomek lze zkrátit na základní tvar: " + zlomek);
        }

        // kolekce
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(3);
        for (int i = 0; i < 100; i++) {
            listInt.add(i * 50);
        }
        for (int i = 0; i < listInt.size(); i++) {
            listInt.get(i);
        }

        int sum = 0;
        for (Integer cislo :
                listInt) {
            sum += cislo;
        }
        System.out.println(sum);
        int sum2 = listInt.stream().mapToInt(a -> a).sum();
        System.out.println(sum2);

        List<Zlomek> listZlomku = new ArrayList<>();
        listZlomku.add(new Zlomek(10, 3));
        listZlomku.add(new Zlomek(15, 3));
        listZlomku.add(new Zlomek(9, 3));

        OptionalInt maxCitatelu = listZlomku
                .stream()
                .mapToInt(x -> x.getCitatel())
                .max();
        System.out.println(maxCitatelu.getAsInt());

        OptionalDouble avgCitatelu = listZlomku
                .stream()
                .mapToDouble(x -> x.getCitatel())
                .average();
        System.out.println("průměr:" + avgCitatelu.getAsDouble());

        double sumZlomku = listZlomku
                .stream()
                .mapToDouble(x -> x.getJednoCislo())
                .sum();
        System.out.println("suma: " + sumZlomku);
        double sumZlomku2 = listZlomku
                .stream()
                .mapToDouble(x -> x.getCitatel() / (double) x.getJmenovatel())
                .sum();
        System.out.println("suma2: " + sumZlomku2);


        final String textKAnalyze = "Toto je ukázkový text pro frekvenční analýzu.";
        HashMap<Character, Integer> frekvence = new HashMap<>();
        for (int i = 0; i < textKAnalyze.length(); i++) {
            char pismeno = textKAnalyze.charAt(i);
            pismeno = Character.toUpperCase(pismeno); // udělám velké písmeno
            if (pismeno == ' ')  // pokud je prázdný znak
                continue;
            if (!Character.isLetter(pismeno))    // pokud není písmeno
                continue;
            if (frekvence.containsKey(pismeno)) {
                int pocet = frekvence.get(pismeno);
                frekvence.put(pismeno, pocet + 1);
            } else {
                frekvence.put(pismeno, 1);
            }
        }
        
        for (char znak :
                frekvence.keySet()) {
            System.out.println(znak + ": " + frekvence.get(znak));
        }

        Meridlo meridlo1 = new Meridlo(1, "Teploměr", "°C");
        Pocitac pocitac1 = new Pocitac(2, "Dell", "Intel");

        List<Zarizeni> seznamZarizeni = new ArrayList<>();
        seznamZarizeni.add(meridlo1);
        seznamZarizeni.add(pocitac1);

        Zarizeni zarizeni1 = seznamZarizeni.get(0);
        if (zarizeni1 instanceof Meridlo) {   // zeptám se zda je zařízení meřidlo
            String jednotkaMeridla = ((Meridlo) zarizeni1).getJednotka();
            Meridlo meridlo = (Meridlo) zarizeni1;
        } else if (zarizeni1 instanceof Pocitac) {

        }


        List<IZarizeni> seznamZarizeniDve = new ArrayList<>();
        seznamZarizeniDve.add(meridlo1);
        seznamZarizeniDve.add(pocitac1);

        IZarizeni iZarizeni1 = seznamZarizeniDve.get(0);


        List<Pocitac> seznamPocitacu = new ArrayList<>();
        seznamPocitacu.add(pocitac1);
        //seznamPocitacu.add(meridlo1);

        MeridloSDaty<Integer> teplomerVKancelari = new MeridloSDaty<>(1, "teploměr", "°C");
        teplomerVKancelari.ulozHodnotu(23);
        teplomerVKancelari.ulozHodnotu(22);
        teplomerVKancelari.ulozHodnotu(24);


        MeridloSDaty<Float> teplomerVeSklepe = new MeridloSDaty<>(2, "teploměr2", "°C");
        teplomerVeSklepe.ulozHodnotu(14.3f);
        teplomerVeSklepe.ulozHodnotu(14.8f);
        teplomerVeSklepe.ulozHodnotu(15.1f);


        MeridloSDaty<HodnotaSCasem<Integer>> teplomerVeSkladu =
                new MeridloSDaty<>(3, "teploměrSklad", "°C");

        teplomerVeSkladu.ulozHodnotu(new HodnotaSCasem<>(16));

        teplomerVeSkladu.ulozHodnotu(new HodnotaSCasem<>(17));

        teplomerVeSkladu.ulozHodnotu(new HodnotaSCasem<>(16));


    }
}

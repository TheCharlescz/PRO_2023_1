import models.Kalkulacka;

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
    }
}
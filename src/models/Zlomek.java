package models;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public void ZkratitNaZakladniTvar(){
        int maxD = NejvetsiSpolecnyDelitel(citatel, jmenovatel);
        citatel /= maxD;
        jmenovatel /= maxD;
    }

    public int NejvetsiSpolecnyDelitel(int a, int b){
        if(b == 0) return a;
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
        return citatel / (double) jmenovatel;
    }


    public static Zlomek NactiZlomekZConsole(Scanner input){
        Integer c = null;
        while (c == null){
            try {
                System.out.println("Zadejte čitatele");
                c = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Chybný formát");
                input.next();
            } catch (Exception e) {
                System.out.println("Chyba");
                input.next();
            } finally {
                System.out.println("finally");
            }
        }
        int j = 0;
        while (j == 0){
            try {
                System.out.println("Zadejte jmenovatele");
                j = input.nextInt();
                if (j == 0)
                    System.out.println("Jmenovatel nemůže být 0");
            }catch (InputMismatchException e){
                System.out.println("Chybný formát");
                input.next();
            }
        }
        return new Zlomek(c, j);
    }
    public static Zlomek NactiZlomekZConsoleVar2(Scanner input){
        String s;
        boolean matchFound = false;
        do{
            System.out.println("Zadejte zlomek ve formátu čitatel/jmenovatel, například 8/6:");
            s = input.nextLine();

            Pattern pattern = Pattern.compile("[0-9]/[0-9]", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(s);
            matchFound = matcher.find();
        }while (!matchFound);

        return Parse(s);

    }
    public static Zlomek Parse(String s) {
        String[] pole = s.split("/");

        int c = Integer.parseInt(pole[0]);
        int j = Integer.parseInt(pole[1]);
        return new Zlomek(c, j);
    }
}

package Cwiczenia2;

import java.util.Scanner;

public class Private {
    private int a;
    private int b;

    Private() {
        Scanner input = new Scanner(System.in);
        String sumowanie = "1";
        System.out.println("Podaj pierwsza liczbe:");
        this.a = input.nextInt();
        System.out.println("Podaj druga liczbe:");
        this.b = input.nextInt();
    }

    public void sumowanie() {
        System.out.println(this.a+this.b);
    }
}

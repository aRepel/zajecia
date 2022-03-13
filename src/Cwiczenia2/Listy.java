package Cwiczenia2;

import java.util.ArrayList;

public class Listy {
    /*private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }*/
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Niebieski");
        lista.add("Czerwony");
        lista.add("Turkusowy");
        lista.add("Zielony");
        lista.set(0, "Szary");
        String zmienna_dodatkowa = lista.get(0);
        lista.remove(1);
        System.out.println(zmienna_dodatkowa);
        System.out.println(lista);


        for(String i : lista){
            System.out.print(i);
        }
    }
}

package Cwiczenia2;

import Cwiczenia1.Auto;

import java.util.ArrayList;
import java.util.Scanner;

public class Auto2 {
    private String kolor_auta;
    private int predkosc_max;

    public Auto2() {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj kolor auta:");
        this.kolor_auta = input.next();
        System.out.println("podaj predkosc auta:");
        this.predkosc_max = Integer.parseInt(input.next());
    }

    public String getKolor_auta() {
        return kolor_auta;
    }

    public void setKolor_auta(String kolor_auta) {
        this.kolor_auta = kolor_auta;
    }

    public int getPredkosc_max() {
        return predkosc_max;
    }

    public void setPredkosc_max(int predkosc_max) {
        this.predkosc_max = predkosc_max;
    }

    public String toString(){
        String tekst="predkosc maksymalna to:"+predkosc_max+" a kolor auta to :"+kolor_auta;
        return tekst;
    /*public static void main(String[] args) {
        ArrayList<Auto> lisa_aut = ArrayList<>();
        for(int i = 0; i<3; i++){
            lista_aut.add(new Auto());
        }
        for(Auto i : lista_aut){
            System.out.println(i.toString());
        }*/
    }
}

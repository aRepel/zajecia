package Cwiczenia1;

public class Auto {
    public String kolor;
    public int predkość;

    Auto(){
        kolor = "standardowy kolor";
        predkość = 100;
    }
    public void zmiana_predkosci(){
        predkość+=10;
    }
    public void  jedzie(){
        System.out.println("auto jedzie");
    }

    public void stoi(){
        System.out.println("auto stoi");

    }
}

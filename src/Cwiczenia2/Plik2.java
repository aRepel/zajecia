package Cwiczenia2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Plik2 {
    public static void main(String[] args) throws IOException {
        //Tworzenie pliku
        try {
            File plik = new File("plik_tekstowy.txt");
            if (plik.createNewFile()) {
                System.out.println("Stworzony plik");
            } else {
                if (plik.exists()) {
                    System.out.println("Nie udało się stworzyć pliku, bo już istnieje");
                } else {
                    System.out.println("Nie udało się stworzyć pliku");
                }
            }
        } catch (IOException e) {
            System.out.println("Błąd");
        }
        //Zapis do pliku
        try {
            FileWriter plik = new FileWriter("plik_tekstowy.txt");
            plik.write("zapiszmy coś w pliku.");
            plik.write("\nzapiszmy coś innego.");
            plik.close();
        } catch (IOException e){
            System.out.println("Nie udało się zapisać do pliku");
        }
    }
}

package Cwiczenia2;

public class ForEach {
    public static void main(String[] args) {
        int tablica1[]={10, 15, 30, 41, 57, 23, 124, 111, 18, 1};
        int tablica2[]={2, 5, 13, 28, 22, 17, 93, 34, 67, 6};
        /*int index=0;
        for(int liczba : tablica){
            liczba+=1;
            tablica[index]=liczba;
            index++;
        }*/
        //tabelka z wynikiem mnożenia
        for(int i = 0; i<tablica1.length; i++){

            System.out.print(tablica1[i]);
            System.out.print("\t\t");
            System.out.print(tablica2[i]);
            System.out.print("\t\t");
            System.out.println(tablica1[i]*tablica2[i]);
        }
        //double a = 3+Math.PI;
        for(int i = 0; i<tablica1.length; i++) {
            int temp = Math.max(tablica1[i], tablica2[i]);
            if (temp == tablica1[i]) {
                System.out.println("Tablica1 jest większa");
            } else {
                System.out.println("Tablica2 jest większa");
            }
        }
        System.out.println("--------------------------");
        //operator warunkowy
        //(warunek?co jesli prawda:co jesli nieprawda;

        for(int i = 0; i<tablica1.length; i++){
            System.out.println((tablica1[i]>tablica2[i])?"Tablica1 jest większa":"Tablica2 jest większa");
        }

    }

}


package Cwiczenia2;

public class Nowy {
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
        Math

    }

}


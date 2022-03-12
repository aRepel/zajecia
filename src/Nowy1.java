import java.util.Scanner;

public class Nowy1 {
    public static void main(String[] args) {
        //tworzymy obiekt skanner
        Scanner input = new Scanner(System.in);
        //Deklarujemy zmienna string aby jej uzywac
        String dzialanie = "1";
        //warunek petli while (!) neguje
        while (!dzialanie.equals("x")) {
            //pytamy o dzialanie
            System.out.println("Prosze podaj dzialanie (wyjscie(x), dodawanie(d), odejmowanie(o), mnozenie(m), dzielenie(dz))");
            dzialanie = input.next();
            //przerwanie aplikacji jesli x
            if (dzialanie.equals("x")) {
                break;
            }
            //Pytamy o liczby
            System.out.println("Podaj pierwsza liczbe:");
            int a = input.nextInt();
            System.out.println("Podaj druga liczbe:");
            int b = input.nextInt();
            //wykonywanie dzialan za pomoca switcha

            switch (dzialanie) {
                case"d":
                    System.out.println(String.valueOf(a)+"+"+String.valueOf(b)+"="+(a+b));
                    break;
                case"o":
                    System.out.println(String.valueOf(a)+"-"+String.valueOf(b)+"="+(a-b));
                    break;
                case"m":
                    System.out.println(String.valueOf(a)+"*"+String.valueOf(b)+"="+(a*b));
                    break;
                case"dz":
                    System.out.println(String.valueOf(a)+"/"+String.valueOf(b)+"="+(a/b));
                    break;
                default:
                    break;
                        /*else{
                    continue;
                }*/

            }


           /* if (dzialanie > 10) {
                System.out.println(dzialanie + " jest wieksze od 10");
            } else {
                System.out.println(dzialanie + " jest mniejsze od 10");
            }*/
        }
    }
}

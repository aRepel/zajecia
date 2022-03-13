package Cwiczenia2;

public class Main {
    int a;
    String b;
    Main(){
        this.a=123;
        this.b="Nasza Klasa";
    }
    Main(int a,String b){
        this.a=a;
        this.b=b;
    }
    Main(int a) {
        this.a = a;
    }
    public static void main(String[] args) {
        Main ob = new Main(100);
        System.out.println(ob.a);
    }

}

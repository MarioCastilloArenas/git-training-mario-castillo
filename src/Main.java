import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Thread{

    public static void main(String[] args){
    ArrayList<Hilo> hilos = new ArrayList<>();
    int numeroDeVeces;
    boolean numero = true;

    System.out.println("introduce la cantidad de veces que quieres tirar la moneda");
    Scanner sc = new Scanner(System.in);
    numeroDeVeces = sc.nextInt();

    for(int i = 0; i < numeroDeVeces; i++){
        Hilo newHilo = new Hilo(numero);
        hilos.add(newHilo);
        newHilo.start();
    }

    }
}
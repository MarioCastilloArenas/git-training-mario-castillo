import java.util.Random;

public class Hilo extends Thread {
    Random random = new Random();
    private boolean numero = random.nextBoolean();

    public Hilo(boolean numero){
        this.numero = numero;
    }
    public void run (){
        Random radnom = new Random();
        numero = random.nextBoolean();

        if (numero == true){
            System.out.println(numero + "cara");
        } else {
            System.out.println(numero + "cruz");
        }

    }


}

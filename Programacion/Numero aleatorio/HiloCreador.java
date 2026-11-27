import java.util.Random;

public class HiloCreador implements Runnable {
    private int numero = 0 ;
    private NumeroAletatorio numeroAleatorio;


    

    public HiloCreador(NumeroAletatorio numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }


    public void generarNumero(){
        Random random = new Random();
        int numGenerado = random.nextInt(101);
        numero = numGenerado;
        System.out.println("NUMERO OCULTO++ ES "+numGenerado);
        numeroAleatorio.setNumero(numero);
    }


    @Override
    public void run() {
        generarNumero();
    }
}

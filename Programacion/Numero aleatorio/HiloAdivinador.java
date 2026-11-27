import java.util.Random;

public class HiloAdivinador implements Runnable{
    private int id;
    private NumeroAletatorio numeroAletatorio;
    private int intento;

    


    public HiloAdivinador(NumeroAletatorio numeroAletatorio, int id) {
        this.numeroAletatorio = numeroAletatorio;
        this.id = id;
    }

    public int intentar(){
        Random random = new Random();
        int numero = random.nextInt(101);
        intento = numero;
        
        return numeroAletatorio.porpuestaNumero(id, intento);
    }


    @Override
    public void run() {
        int num = 0;
        do {
            num = intentar();
        } while (num == 0);
        
    }
}

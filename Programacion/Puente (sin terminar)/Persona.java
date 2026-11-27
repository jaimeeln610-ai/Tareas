import java.util.Random;

public class Persona implements Runnable{
    private int peso;
    private Random r;
    private long tiempo;
    private Puente puente;
    private int posicion;
    
    

    public Persona(Puente puente) {
        this.r = new Random();
        this.peso = r.nextInt(80) + 40;
        this.tiempo = r.nextLong(40000)+10000;
        this.puente = puente;
    }

    public boolean acceder(){
        posicion = puente.acceder(peso);
        if (posicion!=3) {
            return true;
        }else{ 
            return false;
        }
    }

    public void salir(){
        puente.salir(posicion, peso);
    }

    @Override
    public void run() {
        if (acceder()) {
            try {
                Thread.sleep(tiempo);
                salir();
                notifyAll();
            } catch (Exception e) {
                System.out.println("Error al dormir");
            }
        }else{
            try {
                wait();
                try {
                Thread.sleep(tiempo);
                salir();
                notifyAll();
            } catch (Exception e) {
                System.out.println("Error al dormir");
            }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

import java.util.Random;

import javax.swing.plaf.basic.BasicSliderUI.TrackListener;

public class Estudiante implements Runnable {
    private int numEstudiante;

    public Estudiante(int numEstudiante) {
        this.numEstudiante = numEstudiante;
    }

    public int getNumEstudiante() {
        return numEstudiante;
    }

    public void setNumEstudiante(int numEstudiante) {
        this.numEstudiante = numEstudiante;
    }

    @Override
    public void run() {
        while (true) {
            GestorReservas gr = new GestorReservas();
            Random random = new Random();
            int numAacceder = random.nextInt(3);


            gr.acceder(numAacceder);

            long tiempo = random.nextLong(1000,5000);

            gr.salir(numAacceder);
            try {
                Thread.sleep(tiempo);
            } catch (Exception e) {
                // TODO: handle exception
            }
           
        }

    }

}

import java.util.Random;

public class GestorReservas {
    Sala sala1= new Sala(1);
    Sala sala2= new Sala(2);
    Sala sala3= new Sala(3);


    Sala[] salas = {sala1,sala2,sala3};
    
    public GestorReservas() {
    }


    public synchronized void acceder(int numAacceder){

        if (salas[numAacceder].getCantidadEstudiantes()<4) {
            salas[numAacceder].sumar();

            System.out.println("EStudiante accediendo a sala " + numAacceder);
        }
    }

    public synchronized void salir(int numAsalir){
        salas[numAsalir].restar(); 
        System.out.println("EStudiante saliendo de sala " + numAsalir);
    }
}

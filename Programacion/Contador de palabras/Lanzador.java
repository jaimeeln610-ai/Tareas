import java.io.File;
import java.util.ArrayList;

import javax.xml.stream.events.ProcessingInstruction;

public class Lanzador {

    public Process lanzarProceso(String Entrada, String Salida){
        String clase = System.getProperty("user.dir")+"\\ContadorPalabra.java";
        ProcessBuilder pb;
        System.out.println(clase);
        try {
            pb = new ProcessBuilder("java",clase,Entrada);
            pb.inheritIO();
            pb.redirectInput(new File(Entrada));
            pb.redirectOutput(new File(Salida));
            pb.redirectError(new File("errorFich.txt"));
            
            return pb.start();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Lanzador l = new Lanzador();
        ArrayList<Process> procesos = new ArrayList<>();
        for (int i = 0; i <3; i++) {
            String nombreEntrada = "fichero"+(i+1)+".txt";
            String nombreSalida = "Resultado"+(i+1)+".txt";
            procesos.add(l.lanzarProceso(nombreEntrada, nombreSalida));
        }
        System.out.println("Todos los procesos fueron lanzados exitosamente.");
        for (Process process : procesos) {
            process.waitFor();
        }
    }
}

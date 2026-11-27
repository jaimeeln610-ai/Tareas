public class Sala {
    private int cantidadEstudiantes = 0;
    private int numSala;

    public Sala(int numSala) {
        this.numSala = numSala;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public void sumar(){
        cantidadEstudiantes++;
    }

    public void restar(){
        cantidadEstudiantes--;
    }
    
}

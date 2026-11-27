public class Puente {
    private boolean[] personasEnPuente;
    private int pesoMaximo;
    private int pesoEnPuente;

    public Puente() {
        this.personasEnPuente = new boolean[3];
        this.pesoMaximo = 200;
        this.pesoEnPuente = 0;
    }

    public synchronized int acceder(int peso) {
        int posicionAccedida = 0;
        for (int i = 0; i < personasEnPuente.length; i++) {
            if (personasEnPuente[i]) {
                if (pesoEnPuente + peso <= pesoMaximo) {
                    personasEnPuente[i] = !personasEnPuente[i];
                    posicionAccedida = i;
                    pesoEnPuente=pesoEnPuente+peso;
                    return posicionAccedida;
                }else{
                    System.out.println("El puente no puede soportar tanto peso.");
                }
            }
        }
        return 3;
    }

    public synchronized void salir(int posicion, int peso) {
        personasEnPuente[posicion] = !personasEnPuente[posicion];
        pesoEnPuente = pesoEnPuente-peso;
    }

}
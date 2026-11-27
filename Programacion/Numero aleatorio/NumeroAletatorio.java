public class NumeroAletatorio {
    private int numero;
    private boolean adivinado = false;

    public NumeroAletatorio() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public synchronized int porpuestaNumero(int id, int num){
        if (adivinado) {
            System.out.println("Alguien ya ha adivinado el numero");
            return -1;
        }else{System.out.println("Hilo <"+id+"> intentado con: "+num);}
        
        if (num== numero) {
            adivinado=true;
        System.out.println("Hilo <"+id+"> ha acertado el numero aleatorio con: "+num);
            return 1;
        }
        return 0;
    }
}

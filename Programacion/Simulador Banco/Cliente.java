import java.util.Random;

public class Cliente implements Runnable {
    private CuentaBancaria cuenta;
    private int idCliente;
    private Random r = new Random();

    public Cliente(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
        this.idCliente = r.nextInt(1000);
    }

    @Override
    public void run() {
        Random random = new Random();
        int opc = random.nextInt(2);
        long tiempo = random.nextLong(1001);

        for (int i = 0; i < 3; i++) {
            switch (opc) {
                case 0:
                    cuenta.depositar(idCliente, 100.0);
                    break;
                    
                case 1:
                    cuenta.retirar(idCliente, 100.0 );
                    break;

                default:
                    break;
            }
        }
        try {
            Thread.sleep(tiempo);
        } catch (Exception e) {
            System.out.println("Error al dormir.");
        }
       

    }
}

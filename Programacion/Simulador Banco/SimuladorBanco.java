public class SimuladorBanco {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Cuenta Bancaria");

        Thread Cliente1 = new Thread(new Cliente(cuenta));
        Thread Cliente2 = new Thread(new Cliente(cuenta));
        Thread Cliente3 = new Thread(new Cliente(cuenta));
        Thread Cliente4 = new Thread(new Cliente(cuenta));
        Thread Cliente5 = new Thread(new Cliente(cuenta));

        Cliente1.start();
        Cliente2.start();
        Cliente3.start();
        Cliente4.start();
        Cliente5.start();
        try {
            Cliente1.join();
            Cliente2.join();
            Cliente3.join();
            Cliente4.join();
            Cliente5.join();
        } catch (Exception e) {
            System.out.println("Error en los joins :(");
        }
        System.out.println("=====================");
        System.out.println("Saldo Final = " + cuenta.getSaldo() + "$");
        System.out.println("=====================");
    }
}

public class CuentaBancaria {
    private Double saldo = 500.0;
    private String nombre;


    public CuentaBancaria(String nombre) {
        this.nombre = nombre;
    }


    public Double getSaldo() {
        return saldo;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public synchronized  void depositar(int idCliente, Double cantidad){
        Double saldoAnterior = saldo;
        saldo = saldo+cantidad;
        Double saldoNuevo = saldo;
        System.out.println("Cliente: " + idCliente + " depositando " + cantidad +"$.");
        System.out.println("Saldo anterior: " + saldoAnterior + "$ , Nuevo saldo: " + saldoNuevo + "$"+  "\n");
    }

    public synchronized  void retirar(int idCliente, Double cantidad){
        Double saldoAnterior = saldo;
        saldo = saldo-cantidad;
        Double saldoNuevo = saldo;
        System.out.println("Cliente: " + idCliente + " retirando " + cantidad +"$.");
        System.out.println("Saldo anterior: $" + saldoAnterior + "$ , Nuevo saldo: " + saldoNuevo +"$" + "\n");
    }
    
 
}
public class Main {
    public static void main(String[] args) {
        NumeroAletatorio na = new NumeroAletatorio();
        Thread hiloCreador = new Thread(new HiloCreador(na));
        Thread hiloAdivinador1 = new Thread(new HiloAdivinador(na,1));
        Thread hiloAdivinador2 = new Thread(new HiloAdivinador(na,2));
        Thread hiloAdivinador3 = new Thread(new HiloAdivinador(na,3));
        Thread hiloAdivinador4 = new Thread(new HiloAdivinador(na,4));
        Thread hiloAdivinador5 = new Thread(new HiloAdivinador(na,5));
        Thread hiloAdivinador6 = new Thread(new HiloAdivinador(na,6));
        Thread hiloAdivinador7 = new Thread(new HiloAdivinador(na,7));
        Thread hiloAdivinador8 = new Thread(new HiloAdivinador(na,8));
        Thread hiloAdivinador9 = new Thread(new HiloAdivinador(na,9));
        Thread hiloAdivinador10 = new Thread(new HiloAdivinador(na,10));
        
        hiloCreador.start();

        hiloAdivinador1.start();
        hiloAdivinador2.start();
        hiloAdivinador3.start();
        hiloAdivinador4.start();
        hiloAdivinador5.start();
        hiloAdivinador6.start();
        hiloAdivinador7.start();
        hiloAdivinador8.start();
        hiloAdivinador9.start();
        hiloAdivinador10.start();


    }
}

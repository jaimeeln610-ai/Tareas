import java.util.Scanner;

public class ContadorPalabra {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            contador++;
        }
        System.out.println(contador);
        sc.close();
    }
}

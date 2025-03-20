package riassunto;
import java.util.Scanner;

public class CalcolatriceArray {

    public static double CalcolaMediaAritmetica(double[] numeri) {
        double dMedia = 0;
        for (int i = 0; i < numeri.length; i++) {
            dMedia += numeri[i];
        }
        return dMedia / numeri.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanti numeri vuoi inserire? ");
        int dimensione = scanner.nextInt();
        double[] numeri = new double[dimensione];

        for (int i = 0; i < dimensione; i++) {
            System.out.print("Inserisci il numero " + (i + 1) + ": ");
            numeri[i] = scanner.nextDouble();
        }

        double media = CalcolaMediaAritmetica(numeri);
        System.out.println("La media aritmetica è: " + media);

        scanner.close();
    }
}

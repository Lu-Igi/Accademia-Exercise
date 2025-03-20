package riassunto;
import java.util.Scanner;

public class Calcolatrice3 {

    public static double Somma(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static double Sottrazione(double num1, double num2, double num3) {
        return num1 - num2 - num3;
    }

    public static double Moltiplicazione(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }

    public static double Divisione(double num1, double num2, double num3) {
        if (num2 == 0 || num3 == 0) {
            System.out.println("Errore: impossibile dividere per zero.");
            return Double.NaN;
        }
        return num1 / num2 / num3;
    }

    public static double CalcolaMediaAritmetica(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci il primo numero: ");
            double iPrimoNumero = myObj.nextDouble();

            System.out.print("Inserisci il secondo numero: ");
            double iSecondoNumero = myObj.nextDouble();

            System.out.print("Inserisci il terzo numero: ");
            double iTerzoNumero = myObj.nextDouble();

            System.out.print("Scegli un'operazione (+, -, *, /, media): ");
            String sOperatore = myObj.next();

            double dRisultato = 0;
            switch (sOperatore) {
                case "+":
                    dRisultato = Somma(iPrimoNumero, iSecondoNumero, iTerzoNumero);
                    break;
                case "-":
                    dRisultato = Sottrazione(iPrimoNumero, iSecondoNumero, iTerzoNumero);
                    break;
                case "*":
                    dRisultato = Moltiplicazione(iPrimoNumero, iSecondoNumero, iTerzoNumero);
                    break;
                case "/":
                    dRisultato = Divisione(iPrimoNumero, iSecondoNumero, iTerzoNumero);
                    break;
                case "media":
                    dRisultato = CalcolaMediaAritmetica(iPrimoNumero, iSecondoNumero, iTerzoNumero);
                    break;
                default:
                    System.out.println("Errore: operazione non riconosciuta.");
                    continue;
            }

            System.out.println("Il risultato è: " + dRisultato);

            System.out.print("Vuoi fare un altro calcolo? (s/n): ");
            String risposta = myObj.next();
            if (!risposta.equalsIgnoreCase("s")) {
                System.out.println("Grazie per aver usato la calcolatrice. Arrivederci!");
                break;
            }
        }

        myObj.close();
    }
}

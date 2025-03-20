package riassunto;

import java.util.Scanner;

public class Calcolatrice1 {

    // Metodi per le operazioni
    public static int Somma(int num1, int num2) {
        return num1 + num2;
    }

    public static int Sottrazione(int num1, int num2) {
        return num1 - num2;
    }

    public static int Moltiplicazione(int num1, int num2) {
        return num1 * num2;
    }

    public static double Divisione(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Errore: impossibile dividere per zero.");
            return Double.NaN; // Restituisce un valore speciale per indicare errore
        }
        return (double) num1 / num2;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        // Input dell'utente
        System.out.println("Inserisci il primo numero: ");
        int iPrimoNumero = myObj.nextInt();

        System.out.println("Inserisci il secondo numero: ");
        int iSecondoNumero = myObj.nextInt();

        System.out.println("Inserisci un operatore (+ - * /): ");
        String sOperatore = myObj.next();

        // Variabile per il risultato
        double dRisultato = 0;
        boolean operazioneValida = true;

        // Uso dello switch per selezionare l'operazione
        switch (sOperatore) {
            case "+":
                dRisultato = Somma(iPrimoNumero, iSecondoNumero);
                break;
            case "-":
                dRisultato = Sottrazione(iPrimoNumero, iSecondoNumero);
                break;
            case "*":
                dRisultato = Moltiplicazione(iPrimoNumero, iSecondoNumero);
                break;
            case "/":
                dRisultato = Divisione(iPrimoNumero, iSecondoNumero);
                break;
            default:
                System.out.println("Errore: operatore non valido.");
                operazioneValida = false;
        }

        // Stampa del risultato solo se l'operazione è valida
        if (operazioneValida) {
            System.out.println("Il risultato è: " + dRisultato);
        }

        myObj.close();
    }
}

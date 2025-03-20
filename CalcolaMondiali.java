package riassunto;

import java.time.Year;
import java.util.Scanner;

public class CalcolaMondiali {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annoNascita;
        int annoCorrente = Year.now().getValue();

        // Ciclo do-while per ottenere un anno valido
        do {
            System.out.print("Inserisci il tuo anno di nascita (compreso tra 1900 e " + annoCorrente + "): ");
            annoNascita = scanner.nextInt();

            if (annoNascita < 1900 || annoNascita > annoCorrente) {
                System.out.println("⚠ Errore: anno non valido. Riprova.");
            }
        } while (annoNascita < 1900 || annoNascita > annoCorrente);

        // Stampiamo l'età nei prossimi Mondiali
        int annoPrimoMondiale = 2026; // Prossimo Mondiale
        int numeroMondiali = 5; // Quanti Mondiali mostrare

        stampaEtaProssimiMondiali(annoNascita, annoPrimoMondiale, numeroMondiali);

        scanner.close();
    }

    // Metodo per calcolare l'età in un Mondiale specifico
    public static int calcolaEtaMondiale(int annoNascita, int annoMondiale) {
        return annoMondiale - annoNascita;
    }

    // Metodo per stampare l'età nei Mondiali successivi
    public static void stampaEtaProssimiMondiali(int annoNascita, int annoInizio, int numeroMondiali) {
        int annoMondiale = annoInizio;

        for (int i = 0; i < numeroMondiali; i++) {
            int eta = calcolaEtaMondiale(annoNascita, annoMondiale);
            System.out.println("🏆 Nel Mondiale del " + annoMondiale + " avrai " + eta + " anni.");
            annoMondiale += 4; // I Mondiali si giocano ogni 4 anni
        }
    }
}

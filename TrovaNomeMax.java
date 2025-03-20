package riassunto;
public class TrovaNomeMax {
    public static void main(String[] args) {
        String[] nomi = {"pippo", "pluto", "paparino"};

        // Inizializziamo le variabili
        String nomeMax = nomi[0]; // il primo nome come riferimento
        int lunghezzaMax = nomeMax.length(); // la lunghezza del primo nome

        // Cicliamo sull'array
        for (int i = 1; i < nomi.length; i++) { // partiamo dal secondo nome
            if (nomi[i].length() > lunghezzaMax) {
                nomeMax = nomi[i]; // aggiorniamo nomeMax
                lunghezzaMax = nomi[i].length(); // aggiorniamo lunghezzaMax
            }
        }

        // Output del risultato
        System.out.println("Il nome con più lettere è: " + nomeMax);
    }
}
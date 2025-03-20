package riassunto;
public class CalcolaMinMaxStringhe {

    public static void main(String[] args) {
        // Definiamo un array di stringhe da analizzare
        String[] personaggi = { "pippo", "pluto", "paperino", "topolino" };

        // Chiamata alla funzione MinMaxString e stampa dei risultati
        int[] risultato = MinMaxString(personaggi);
        System.out.println("Lunghezza minima: " + risultato[0]);
        System.out.println("Lunghezza massima: " + risultato[1]);
    }

    public static int[] MinMaxString(String[] arrayStringhe) {
        // Definizione delle variabili lunghezzaMin e lunghezzaMax
        int lunghezzaMin = arrayStringhe[0].length();
        int lunghezzaMax = arrayStringhe[0].length();

        // Ciclo per trovare la lunghezza minima e massima
        for (int i = 0; i < arrayStringhe.length; i++) {
            int lunghezza = arrayStringhe[i].length();

            if (lunghezza < lunghezzaMin) {
                lunghezzaMin = lunghezza;
            }
            if (lunghezza > lunghezzaMax) {  // Correzione dell'errore
                lunghezzaMax = lunghezza;
            }
        }

        // Creazione dell'array risultato con i valori trovati
        int[] risultato = new int[2];
        risultato[0] = lunghezzaMin;  // Minimo in posizione 0
        risultato[1] = lunghezzaMax;  // Massimo in posizione 1

        return risultato;  // Restituzione dell'array
    }
}

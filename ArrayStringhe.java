package riassunto;
// Classe che dimostra l'uso di un array di stringhe
public class ArrayStringhe {

    public static void main(String[] args) {
        // Creazione di un array di 4 stringhe
        String[] parole = new String[4];

        // Assegnazione dei valori all'array
        parole[0] = "Topolino";
        parole[1] = "Pippo";
        parole[2] = "Paperino";
        parole[3] = "Pluto";

        // Chiamata al metodo per visualizzare l'array
        visualizzaArrayStringhe(parole);
    }

    /**
     * Metodo che stampa tutti gli elementi di un array di stringhe
     * @param arrayDaVisualizzare l'array di stringhe da stampare
     */
    public static void visualizzaArrayStringhe(String[] arrayDaVisualizzare) {
        // Scorrimento dell'array e stampa degli elementi
        for (int i = 0; i < arrayDaVisualizzare.length; i++) {
            System.out.println(arrayDaVisualizzare[i]);
        }
    }
}

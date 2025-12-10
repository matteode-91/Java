import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

// Final è una costante e significa che la classe non potrà essere modificata o riutilizzata nell'ereditarietà
public class Studente {
    private final String nome;
    private final String cognome;
    private final String matricola;
    private final int annoNascita;

    public Studente(String nome, String cognome, String matricola, int annoNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.annoNascita = annoNascita;
    }

    // Converte in una riga CSV "matricola;nome;cognome;anno"
    // Il ; permette di separare ogni valore con il punto e virgola all'interno del file CSV
    public String toCsv() {
        return String.join(";", matricola, nome, cognome, Integer.toString(annoNascita));   
    }

    // Path serve a definire il percorso dove il file andrà salvato
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Path csv = Path.of("studenti.csv");

        System.out.println("Inserisci studenti. Digita 'exit' per terminare.");
        while (true) {
            System.out.print("Nome (o 'exit' per uscire): ");
            String nome = sc.nextLine().trim();
            if (nome.equalsIgnoreCase("exit")) break;

            System.out.print("Cognome: ");
            String cognome = sc.nextLine().trim();

            System.out.print("Matricola: ");
            String matricola = sc.nextLine().trim();

            System.out.print("Anno nascita: ");
            String annoInput = sc.nextLine().trim();
            int anno;
            try {
                anno = Integer.parseInt(annoInput);
            } catch (NumberFormatException e) {
                System.out.println("Anno non valido, riprova.\n");
                continue;
            }

            Studente s = new Studente(nome, cognome, matricola, anno);
            Files.writeString(    //scrive dentro il file
                csv,
                s.toCsv() + System.lineSeparator(),
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
            );
            System.out.println("Salvato: " + s.toCsv());

            System.out.print("Premi Invio per aggiungere un altro studente o digita 'exit' per uscire: ");
            if (sc.nextLine().trim().equalsIgnoreCase("exit")) {
                break;
            }
        }
        System.out.println("Programma terminato.");
    }
}

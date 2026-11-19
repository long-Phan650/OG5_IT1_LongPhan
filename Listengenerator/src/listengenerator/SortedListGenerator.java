package listengenerator;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class SortedListGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Array mit 20 Millionen Werten erstellen
        int[] zahlen = new int[20_000_000];

        // Array mit 1, 2, 3, 4, 5, ... füllen
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = i + 1;
        }

        System.out.println("Array wurde erstellt!");
        System.out.println("Anzahl der Werte: " + zahlen.length);
        System.out.println("Erster Wert: " + zahlen[0]);
        System.out.println("Letzter Wert: " + zahlen[zahlen.length - 1]);

        // Zahl eingeben
        System.out.print("\nWelche Zahl möchtest du suchen? ");
        int gesucht = scanner.nextInt();

        // Zeitmessung starten
        long start = System.nanoTime();

        // Binäre Suche
        int ergebnis = binarySearch(zahlen, gesucht);

        // Zeitmessung beenden
        long ende = System.nanoTime();

        // Ergebnis ausgeben
        if (ergebnis != -1) {
            System.out.println("\nZahl gefunden!");
            System.out.println("Position im Array: " + ergebnis);
        } else {
            System.out.println("\nZahl nicht gefunden!");
        }

        // Suchzeit in Millisekunden
        double zeit = (ende - start) / 1_000_000.0;

        System.out.println("Suchzeit: " + zeit + " ms");

        scanner.close();
    }

    public static int binarySearch(int[] array, int gesucht) {

        int links = 0;
        int rechts = array.length - 1;

        while (links <= rechts) {

            int mitte = links + (rechts - links) / 2;

            if (array[mitte] == gesucht) {
                return mitte;
            }

            if (array[mitte] < gesucht) {
                links = mitte + 1;
            } else {
                rechts = mitte - 1;
            }
        }

        return -1;
    }
}

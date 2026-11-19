
package de.promocode.logic;

public class CodeSearch {

    public static final int NOT_FOUND = -1;

    /**
     * Sucht einen Code mithilfe der binären Suche
     * und misst die benötigte Suchzeit.
     *
     * @param list Liste der aufsteigend sortierten Codes
     * @param searchValue Gesuchter Code
     * @return Index des Codes oder NOT_FOUND
     */
    public static int findPromoCode(long[] list, long searchValue) {

        // Zeitmessung starten
        long startTime = System.nanoTime();

        int links = 0;
        int rechts = list.length - 1;

        // Binäre Suche
        while (links <= rechts) {

            int mitte = links + (rechts - links) / 2;

            if (list[mitte] == searchValue) {

                // Zeitmessung beenden
                long endTime = System.nanoTime();

                double suchzeit = (endTime - startTime) / 1_000_000.0;

                System.out.println("Code gefunden!");
                System.out.println("Position: " + mitte);
                System.out.println("Suchzeit: " + suchzeit + " ms");

                return mitte;
            }

            if (list[mitte] < searchValue) {
                links = mitte + 1;
            } else {
                rechts = mitte - 1;
            }
        }

        // Zeitmessung bei erfolgloser Suche
        long endTime = System.nanoTime();

        double suchzeit = (endTime - startTime) / 1_000_000.0;

        System.out.println("Code nicht gefunden!");
        System.out.println("Suchzeit: " + suchzeit + " ms");

        return NOT_FOUND;
    }
}


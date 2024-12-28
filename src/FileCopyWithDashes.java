package pl.vistula.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyWithDashes {
    public void copyFileWithDashes(String inputFile, String outputFile) {
        // Zastosowanie try-with-resources do automatycznego zamykania plików
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            int bajt;

            while ((bajt = fis.read()) != -1) {
                if (bajt == 32) { // Sprawdzenie, czy bajt to spacja
                    fos.write('-'); // Zastąpienie spacji myślnikiem
                } else {
                    fos.write(bajt); // Zapisz inne znaki bez zmian
                }
            }

            System.out.println("Plik został skopiowany i przetworzony.");

        } catch (IOException e) {
            System.out.println("Błąd wejścia-wyjścia: " + e.getMessage());
        }
    }
}

package pl.vistula.io;

public class Main {
    public static void main(String[] args) {
        // Utworzenie obiektu klasy FileCopyWithDashes
        FileCopyWithDashes fileCopy = new FileCopyWithDashes();

        // Wywołanie metody do kopiowania pliku
        fileCopy.copyFileWithDashes("input.txt", "output.txt");
    }
}

Opis:
- Projekt implementuje prostą aplikację w Javie, która kopiuje plik tekstowy, zamieniając wszystkie wystąpienia spacji na myślniki w pliku wyjściowym. 
- Program wykorzystuje try-with-resources do automatycznego zamykania plików po zakończeniu operacji.

Funkcjonalności:
- Kopiowanie pliku: Program odczytuje dane z pliku wejściowego (input.txt), a następnie zapisuje je do pliku wyjściowego (output.txt).
- Zamiana spacji na myślniki: Każda spacja w pliku wejściowym jest zamieniana na myślnik (-) w pliku wyjściowym.
- Obsługa błędów: Program obsługuje wyjątki związane z operacjami wejścia/wyjścia.

Struktura projektu:
1. FileCopyWithDashes.java
- Klasa zawierająca metodę copyFileWithDashes, która realizuje kopiowanie pliku z zamianą spacji na myślniki.
2. Main.java
- Klasa główna, która tworzy obiekt klasy FileCopyWithDashes i wywołuje metodę kopiującą plik.
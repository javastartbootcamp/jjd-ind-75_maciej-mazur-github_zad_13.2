package app;

import static io.ConsolePrinter.*;
import io.DataReader;
import model.NumbersData;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        // napisz swój program tutaj. Do wczytywania danych użyj przekazanego w parametrze scannera
        DataReader reader = new DataReader();

        printLine("Wprowadzaj kolejne liczby nieujemne. Wpisanie liczby ujemnej wywoła serię wydruków statystyk.");
        NumbersData numbersData = reader.readNumbers(scanner);

        if (!numbersData.list().isEmpty()) {
            printReversedList(numbersData.list());
            printSumEquation(numbersData.list());
            printLine("Najmniejsza liczba w liście to " + numbersData.smallestNumber());
            printLine("Największa liczba w liście to " + numbersData.greatestNumber());
        } else {
            System.out.println("Lista zgromadzonych liczb nieujemnych jest pusta.");
        }
    }
}

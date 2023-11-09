package io;

import model.NumbersData;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DataReader {
    public NumbersData readNumbers(Scanner scanner) {

        boolean quit = false;
        List<Integer> list = new ArrayList<>();
        int numberToAdd;

        while (!quit) {
            numberToAdd = readInt(scanner);

            if (numberToAdd >= 0) {
                list.add(numberToAdd);
            } else {
                quit = true;
            }
        }

        return new NumbersData(list);
    }

    private int readInt(Scanner scanner) {
        int number;

        while (true) {
            try {
                number = scanner.nextInt();
                return number;
            } catch (InputMismatchException ignored) {
                ConsolePrinter.printLine("Błędny format liczby, spróbuj ponownie.");
                scanner.nextLine();
            }
        }
    }
}

package io;

import model.NumbersData;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DataReader {
    private int smallestNumber = 0;
    private int greatestNumber = 0;
    private boolean atLeastOneNumberAdded = false;
    Scanner scanner;

    public DataReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public NumbersData readNumbers(Scanner scanner) {

        boolean quit = false;
        List<Integer> list = new ArrayList<>();
        int numberToAdd;

        while (!quit) {
            numberToAdd = readInt(scanner);

            if (numberToAdd >= 0) {
                list.add(numberToAdd);
                updateStatistics(numberToAdd);
            } else {
                quit = true;
            }
        }

        return new NumbersData(smallestNumber, greatestNumber, list);
    }

    private void updateStatistics(int numberToAdd) {
        if (!atLeastOneNumberAdded) {
            smallestNumber = numberToAdd;
            atLeastOneNumberAdded = true;
        }

        if (numberToAdd < smallestNumber) {
            smallestNumber = numberToAdd;
        }

        if (numberToAdd > greatestNumber) {
            greatestNumber = numberToAdd;
        }
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

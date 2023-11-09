package io;

import java.util.List;

public class ConsolePrinter {
    public static void printLine(String text) {
        System.out.println(text);
    }

    public static void printReversedList(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.printf("%d%s",
                    list.get(i), (i == 0) ? "" : ", ");
        }
        printLine("");   // celem przejścia do nowej linii
    }

    public static void printSumEquation(List<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d%s",
                    list.get(i), (i == (list.size() - 1)) ? " = " : " + ");
            sum += list.get(i);
        }

        printLine(String.valueOf(sum));  // dopisanie wyniku sumowania i przejście do nowej linii
    }
}

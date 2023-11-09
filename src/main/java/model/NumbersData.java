package model;

import java.util.List;

public class NumbersData {
    private int smallestNumber;
    private int greatestNumber;
    private final List<Integer> list;

    public NumbersData(List<Integer> list) {
        this.list = list;
        boolean atLeastOneNumberAdded = false;

        for (Integer element : list) {
            if (!atLeastOneNumberAdded) {
                smallestNumber = element;
                atLeastOneNumberAdded = true;
            }

            if (element < smallestNumber) {
                smallestNumber = element;
            }

            if (element > greatestNumber) {
                greatestNumber = element;
            }
        }
    }

    public int smallestNumber() {
        return smallestNumber;
    }

    public int greatestNumber() {
        return greatestNumber;
    }

    public List<Integer> list() {
        return list;
    }
}

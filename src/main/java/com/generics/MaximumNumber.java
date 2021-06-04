package com.generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumNumber<E extends Comparable<E>> {
    E number1, number2, number3;

    public static void main(String[] args) {
        new MaximumNumber<Integer>(1,2,3).testMaximumNumber();
        new MaximumNumber<Float>(1.1f,1.2f,1.3f).testMaximumNumber();
        new MaximumNumber<String>("abc","abcde", "abcd").testMaximumNumber();
    }

    public MaximumNumber(E number1, E number2, E number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public E testMaximumNumber() {
        return maximum(number1, number2, number3);
    }

    public static <E extends Comparable<E>> E maximum(E number1, E number2, E number3) {
        E maximum = number1;
        if (number2.compareTo(maximum) > 0)
            maximum = number2;
        if (number3.compareTo(maximum) > 0)
            maximum = number3;
        maxPrint(number1,number2,number3,maximum);
        return maximum;
    }

    @SafeVarargs
    public static <E extends Comparable<E>> E maximumValue(E... inputValues) {
        List<E> sortedInputValues = Arrays.stream(inputValues)
                .sorted()
                .collect(Collectors.toList());
        return sortedInputValues.get(sortedInputValues.size() - 1);
    }

    public static <E extends Comparable<E>> void maxPrint(E number1, E number2, E number3, E maximum) {
        System.out.println("Given Values: "+number1 +
                ", " + number2 + ", " + number3);
        System.out.println("Maximum Value: " + maximum);
    }
}

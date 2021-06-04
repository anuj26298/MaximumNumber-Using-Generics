package com.generics;

public class MaximumNumber {
    public static <E extends  Comparable<E>> E maximum(E number1, E number2, E number3) {
        E maximum = number1;
        if (number2.compareTo(maximum) > 0)
            maximum = number2;
        if (number3.compareTo(maximum) > 0)
            maximum = number3;

        return maximum;

    }
}

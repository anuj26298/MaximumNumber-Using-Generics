package com.generics;

public class MaximumNumber {
    public static Integer maximumInteger(Integer number1, Integer number2, Integer number3) {
        Integer maximum = number1;
        if (number2.compareTo(maximum) > 0)
            maximum = number2;
        if (number3.compareTo(maximum) > 0)
            maximum = number3;

        return maximum;

    }

    public static Float maximumFloat(Float number1, Float number2, Float number3) {
        Float maximum = number1;
        if (number2.compareTo(maximum) > 0)
            maximum = number2;
        if (number3.compareTo(maximum) > 0)
            maximum = number3;
        return maximum;
    }

    public static String maximumString(String str1, String str2, String str3) {
        String maximum = str1;
        if (str2.compareTo(maximum) > 0)
            maximum = str2;
        if (str3.compareTo(maximum) > 0)
            maximum = str3;
        return maximum;
    }

}

package com.company;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        var doubleValue = 10_000_000.53;

        // Number formatters
        // Create an instance of the formatter then use it on variable.
        var numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue));

        var intF = NumberFormat.getInstance();
        System.out.println("Number: " + intF.format(doubleValue));

        intF.setGroupingUsed(false);
        System.out.println("Number: " + intF.format(doubleValue));

        var locale = Locale.getDefault();
        var localeFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + localeFormatter.format(doubleValue));
    }
}

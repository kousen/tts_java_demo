package io;

import org.junit.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTests {
    @Test
    public void defaultFormat() {
        double amount = 123456.78901234;
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(amount));
    }

    @Test
    public void germanFormat() {
        double amount = 123456.78901234;
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(nf.format(amount));
    }

    @Test
    public void indiaFormat() {
        double amount = 123456.78901234;
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("hi","in"));
        System.out.println(nf.format(amount));
    }

}

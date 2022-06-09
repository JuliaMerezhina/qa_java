package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void shouldBeEqualFeline() {

        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensCountCheck() {
        int kittensCount = 1;
        int expected = kittensCount;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensKittensCountCheck() {
        int getKittens = 2;
        int expected = getKittens;
        int actual = feline.getKittens(getKittens);
        assertEquals(expected, actual);
    }
}
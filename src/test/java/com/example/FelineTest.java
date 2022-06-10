package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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
    public void getFoodFelineTest() throws Exception {
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actual = feline.getFood("Хищник");
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
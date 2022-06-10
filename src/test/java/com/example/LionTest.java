package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Lion lion;


    @Test
    public void getFoodLionTest() throws Exception {
        Feline feline = new Feline();
        Lion lion1 = new Lion(feline);
        List<String> actual = lion1.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    public void checkLionManeOfMale() throws Exception {
        Lion lion = new Lion("Самец");
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void checkLionManeOfFemale() throws Exception {
        Lion lion = new Lion("Самка");
        assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void checkLionManeException() throws Exception {
        Lion lion = new Lion("test");
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        Lion lion1 = new Lion(feline);
        assertEquals(1, lion1.getKittens());
    }

    @Test
    public void doesHaveManeResultReturnTrue() {
        boolean actual = lion.doesHaveMane();
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
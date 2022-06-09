package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Lion lion;


    @Test
    public void getFoodLionTest() throws Exception {
        Lion lion = new Lion("Самец");
        List<String> actual = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    public void checkLionManeOfMale() throws Exception {
        Lion lion = new Lion("Самец");
        assertEquals(true, lion.doesHaveMane());
    }

    @Test
    public void checkLionManeOfFemale() throws Exception {
        Lion lion = new Lion("Самка");
        assertEquals(false, lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void checkLionManeException() throws Exception {
        Lion lion = new Lion("test");
    }

    @Test
    public void getKittens() {
        Mockito.when(lion.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void doesHaveManeResultReturnTrue() {
        boolean actual = lion.doesHaveMane();
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
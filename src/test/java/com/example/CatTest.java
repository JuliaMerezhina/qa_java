package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void checkGetSound() {
        String kittySound = "Мяу";
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        assertEquals(kittySound, cat.getSound());
    }


    @Test
    public void getFoodCatTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> actual = cat.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }

}


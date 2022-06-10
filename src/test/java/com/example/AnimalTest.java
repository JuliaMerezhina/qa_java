package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalTest {

    private final String animalType;
    private final List<String> expected;

    private final Animal animal = new Animal();

    public AnimalTest(String animalType, List<String> expected) throws Exception {
        this.animalType = animalType;
        this.expected = expected;
    }


    @Parameterized.Parameters(name = "{index}: {0} , {1}")
    public static Object[] getResult() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void getFoodAnimal() throws Exception {
        List<String> actual = animal.getFood(animalType);
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void getFoodAnimalException() throws Exception {
        String animalType = "";
        List<String> actual = animal.getFood(animalType);
    }

    @Test
    public void shouldBeEqual() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        assertEquals(expected, actual);

    }
}
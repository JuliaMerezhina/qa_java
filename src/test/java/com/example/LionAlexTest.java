package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionAlexTest {

    private LionAlex lionAlex;

    @Before
    public void prepare() throws Exception {
        lionAlex = new LionAlex();
    }

    public LionAlexTest() {
    }

    @Test
    public void getKittensLionAlexCheck() {
        int expected = 0;
        int actual = lionAlex.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLivingLionAlexCheck() {
        String expected = "Нью-Йоркский зоопарк";
        String actual = lionAlex.getPlaceOfLiving();
        assertEquals(expected, actual);
    }

    @Test
    public void getFriendsLionAlexCheck() {
        List<String> actual = lionAlex.getFriends();
        assertEquals(List.of("Марти", "Глория", "Мелман"), actual);
    }
}
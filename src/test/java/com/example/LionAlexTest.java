package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionAlexTest {

    private String sex;
    LionAlex lionAlex = new LionAlex();

    public LionAlexTest() throws Exception {
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
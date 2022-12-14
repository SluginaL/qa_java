package com.example;

import java.util.List;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;



public class FelineWithoutMock {
    private Feline feline;

    @Before
    public void createNewObj() {
        feline = new Feline();
    }

    @Test
    public void eatMeat() throws Exception {
        List<String> list = feline.eatMeat();
        int actual = list.size();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void getFamily() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";

        assertEquals(expected, actual);
    }

    @Test
    public void getKittens() {
        int actual = feline.getKittens();
        int expected = 1;

        assertEquals(expected, actual);
    }
}

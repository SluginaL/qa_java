package com.example;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

import java.util.List;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Cat cat;

    @Test
    public void returnGetSound() {
        cat.getSound();
        Mockito.verify(cat, Mockito.times(1)).getSound();
        Mockito.when(cat.getSound()).thenReturn("Мяу");
        String expected = "Мяу";
        Assert.assertEquals(expected, cat.getSound());
    }

    @Test
    public void returnGetFood() throws Exception {
        cat.getFood();
        Mockito.verify(cat, Mockito.times(1)).getFood();
        Mockito.when(cat.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(cat.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }
}


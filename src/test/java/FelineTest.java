package com.example;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Feline feline;

    @Test
    public void returnGetFamily() {
        feline.getFamily();
        Mockito.verify(feline, Mockito.times(1)).getFamily();
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        String expected = "Кошачьи";
        Assert.assertEquals(expected, feline.getFamily());
    }

    @Test
    public void returnGetKittens() {
        feline.getKittens(1);
        Mockito.verify(feline).getKittens(Mockito.anyInt());
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
        Mockito.when(feline.getKittens(1)).thenReturn(1);
        int expected = 1;
        Assert.assertEquals(expected, feline.getKittens(1));
    }

    @Test
    public void eatMeat() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }


    @Test
    public void returnGetKittensWithoutArg() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expected = 1;
        Assert.assertEquals(expected, feline.getKittens());

    }
}

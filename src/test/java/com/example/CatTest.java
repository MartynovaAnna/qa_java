package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void shouldSpeakMeaw() {
        Cat cat = new Cat(feline);
        String actualSound = cat.getSound();
        String expectedSound = "Мяу";
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void shouldEatMeat() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualAnimals = cat.getFood();
        List<String> expectedAnimals = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedAnimals, actualAnimals);
    }
}
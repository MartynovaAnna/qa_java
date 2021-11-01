package com.example;

import org.junit.Test;

import java.util.List;
import static org.junit.Assert.assertEquals;
public class FelineTest {

    Feline feline = new Feline();

    @Test

    public void shouldBePredator() throws Exception {
        List<String> actualAnimals = feline.eatMeat();
        List<String> expectedAnimals = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedAnimals, actualAnimals);
    }

    @Test

    public void shouldBeFeline() {
        String actualFamily = feline.getFamily();
        String expectedFamily = "Кошачьи";
        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void shouldGetOneKitten() {
        int actualKittenCount = feline.getKittens();
        int expectedKittenCount = 1;
        assertEquals(expectedKittenCount, actualKittenCount);
    }

    @Test
    public void shouldGetKittens() {
        int actualKittensCount = feline.getKittens(12);
        int expectedKittensCount = 12;
        assertEquals(expectedKittensCount, actualKittensCount);
    }
}
package com.example;

import org.junit.Assert;
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
    Feline feline;

    @Test(expected = AssertionError.class)
    public void anotherSexThrowsException() throws AssertionError {
        try {
            Lion lion = new Lion("Мальчик", feline);
            Assert.fail("Expected AssertionError");
        }
        catch (Exception thrown) {
            Assert.assertNotEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
        }
    }

    @Test
    public void shouldEatMeat() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualAnimals = lion.getFood();
        List<String> expectedAnimals = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedAnimals, actualAnimals);}


    @Test
    public void shouldGetKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(12);
        int actualKittensCount = lion.getKittens();
        int expectedKittensCount = 12;
        assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void shouldHasMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actualHasMane = lion.doesHaveMane();
        boolean expectedHasMane = true;
        assertEquals(expectedHasMane, actualHasMane);
    }


}

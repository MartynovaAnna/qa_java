package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    private final String kind;
    private final boolean mane;

    public LionTest (String kind, boolean mane) {
        this.kind = kind;
        this.mane = mane;
    }

    @Mock
    Feline feline;

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void maleShouldHasMane() throws Exception {
        Lion lion = new Lion(kind, feline);
        boolean hasMane = lion.hasMane;
        assertEquals(hasMane, mane);
    }

    @Test
    public void shouldHasMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actualHasMane = lion.doesHaveMane();
        boolean expectedHasMane = true;
        assertEquals(expectedHasMane, actualHasMane);
    }
}
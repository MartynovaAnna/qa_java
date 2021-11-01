package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String kind;
    private final boolean mane;

    public LionParameterizedTest (String kind, boolean mane) {
        this.kind = kind;
        this.mane = mane;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void maleShouldHasMane() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(kind, feline);
        boolean hasMane = lion.hasMane;
        assertEquals(hasMane, mane);
    }
}
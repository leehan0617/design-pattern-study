package com.pattern.design.builder;

import org.junit.Assert;
import org.junit.Test;

public class SnackTest {

    @Test
    public void test() {
        Snack snack = new Snack.Builder("홈런볼", 1000)
                .brand("orion")
                .calories(300)
                .fat(100)
                .build();

        Assert.assertEquals("홈런볼", snack.getName());
        Assert.assertEquals(1000, snack.getPrice());
        Assert.assertEquals("orion", snack.getBrand());
        Assert.assertEquals(300, snack.getCalories());
        Assert.assertEquals(100, snack.getFat());
    }
}

package com.pattern.design.builder;

import org.junit.Assert;
import org.junit.Test;

public class SampleTest {

    @Test
    public void testSample () {
        Sample sample = new Sample();
        sample.setKey(1);
        sample.setName("name");
        Assert.assertEquals(1, sample.getKey());
        Assert.assertEquals("name", sample.getName());
        Sample sample2 = new Sample.SampleBuilder().key(2).name("name2").build();
        Assert.assertEquals(2, sample2.getKey());
        Assert.assertEquals("name2", sample2.getName());
    }

    @Test
    public void testSampleAnswer() {
        SampleAnswer sa = new SampleAnswer.SampleBuilder().key(3).name("name3").build();
        Assert.assertEquals(3, sa.getKey());
        Assert.assertEquals("name3", sa.getName());

        Sample sample = Sample.builder().key(4).name("name4").build();
        SampleAnswer sa2 = SampleAnswer.builder().key(5).name("name5").build();
        SampleExtend se = SampleExtend.builder().key(6).name("name6").value(6).build();
    }
}

package com.pattern.design.builder;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SampleExtend extends Sample {

    private int value;

    @Builder
    public SampleExtend(long key, String name, int value) {
        super(key, name);
        this.value = value;
    }
}

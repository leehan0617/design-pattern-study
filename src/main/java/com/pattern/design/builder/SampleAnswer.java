package com.pattern.design.builder;

public class SampleAnswer {

    private long key;
    private String name;

    public static class SampleBuilder {

        private long key;
        private String name;

        public SampleBuilder key(long key) {
            this.key = key;
            return this;
        }

        public SampleBuilder name(String name) {
            this.name = name;
            return this;
        }

        public SampleAnswer build () {
            return new SampleAnswer(this);
        }
    }

    public long getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public SampleAnswer (SampleBuilder sampleBuilder) {
        this.key = sampleBuilder.key;
        this.name = sampleBuilder.name;
    }
}

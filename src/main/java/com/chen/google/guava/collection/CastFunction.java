package com.chen.google.guava.collection;


import com.google.common.base.Function;

public class CastFunction<F, T extends F> implements Function<F, T>{
    @Override
    public T apply(final F input) {
        return (T) input;
    }
}

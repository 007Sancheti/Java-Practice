package com.sancheti.lamdas;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class LamdasDemo {
    public static void show() {
        BinaryOperator<Integer> add = (a, b) -> a + b;
        UnaryOperator<Integer> square = a -> a * a;
        var result = add.andThen(square).apply(1, 2);
        System.out.println(result);
    }
}

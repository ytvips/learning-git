package com.yt.learning.git.lambda;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;
public class LambdaDemo {
    public static void demo(){
        Runnable noArgument = () -> System.out.println("Hello world");

        ActionListener listener = event -> System.out.println("button clicked");
        BinaryOperator<Long> add = (x, y) -> x + y;
        Long result  = add.apply(1l,2l);
        System.out.println(result);
        noArgument.run();
    }

    public static void main(String[] args) {
        demo();
    }
}

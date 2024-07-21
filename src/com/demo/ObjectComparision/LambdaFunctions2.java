package src.com.demo.ObjectComparision;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions2 {
    public static void main(String[] args) {

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;

        LambdaFunctions2 func = new LambdaFunctions2();
        // it is a method in the class
        System.out.println(func.operate(1,2,sum));

    }

    private int operate(int a,int b,Operation op){
        return op.operation(a,b);
    }

interface Operation{
    int operation(int a,int b);
}
}

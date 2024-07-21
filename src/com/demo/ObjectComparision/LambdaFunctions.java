package src.com.demo.ObjectComparision;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<5;i++){
            arr.add(i);
        }

        arr.forEach((item) -> System.out.println(item*2));
        // Using consumer type
        System.out.println("Using consumer type");
        Consumer<Integer> func1 = (item) -> System.out.println(item*2);

        arr.forEach(func1);
    }

    int sum(int a,int b){
        return a+b;
    }
}

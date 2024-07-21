package src.com.demo.EncapsulationAbstraction;

import src.com.demo.access.ExampleClass;

import java.util.Arrays;

public class NewClass extends ExampleClass{
    public NewClass(int num, String name, int[] arr) {
        super(num, name, arr);
    }
}

class SubSubClass extends NewClass{
    public SubSubClass(int num, String name, int[] arr) {
        super(num, name, arr);
    }

    public static void main(String[] args) {
        ExampleClass exampleClass = new
                ExampleClass(34,"Tuhin",new int[]{1,2,3});

        System.out.println(Arrays.toString(exampleClass.arr));
    }
}


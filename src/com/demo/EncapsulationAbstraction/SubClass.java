package src.com.demo.EncapsulationAbstraction;

import src.com.demo.access.ExampleClass;

public class SubClass extends ExampleClass {

    public SubClass(int num, String name, int[] arr) {
        super(num, name, arr);
    }

    public static void main(String[] args) {
        SubClass subClass = new
                SubClass(25,"tuhin",new int[]{1,2,3});

        System.out.println(subClass.name);
    }
}

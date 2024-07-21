package src.com.demo.EncapsulationAbstraction;

import src.com.demo.access.ExampleClass;

public class Main {

    public static void main(String[] args) {
        // Abstraction -> Hiding unnecessary details and only showing
        // the necessary one
        // Like in array.sort() sort() is accessible but we don't care
        // how the sort() is functioning
        // This is an design issue
        // The process of gaining information

        // Encapsulation -> Wrapping all the data members and methods
        // It is solving an implementation level issue
        // It is a storing the information

        ExampleClass newClass = new ExampleClass(34,"Tuhin",new int[]{1,2,3});
//        newClass.name
//        ^
//        error from importing from other packages

    }
}

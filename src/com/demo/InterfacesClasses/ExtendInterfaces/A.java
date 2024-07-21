package src.com.demo.InterfacesClasses.ExtendInterfaces;

public interface A {
    // In Interfaces all methods and variables are static final type
    default void fun(){
        System.out.println("fun");
    }
}

package src.com.demo.InterfacesClasses.ExtendInterfaces;

public interface B extends A{

    default void greet(){
        System.out.println("Hello");
    }
}

package src.com.demo.Polymorphism;

public class Circle extends Shapes{

    @Override
    public void area(){
        System.out.println("Area is pi * r * r");
    }

    // static methods can't be overriden
//    @Override
//    static void greeting(){
//        System.out.println("Hello from circle");
//    }
}

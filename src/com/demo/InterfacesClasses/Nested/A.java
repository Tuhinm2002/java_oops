package src.com.demo.InterfacesClasses.Nested;

public class A {
    public interface NestedInterface{

        void greet();

    }
}

class B implements A.NestedInterface{
    @Override
    public void greet(){
        System.out.println("Hello");
    }
}

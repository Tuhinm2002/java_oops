package src.com.demo.InterfacesClasses;

public class DieselEngine implements Engine{

    @Override
    public void start(){
        System.out.println("Diesel Engine starts");
    }

    @Override
    public void stop(){
        System.out.println("Diesel Engine stops");
    }

    @Override
    public void acc(){
        System.out.println("Diesel Engine accelerates");
    }
}

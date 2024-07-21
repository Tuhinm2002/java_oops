package src.com.demo.InterfacesClasses.ExtendInterfaces;

public class Main implements B{

    @Override
    public void fun(){
        System.out.println("New Fun");
    }

    @Override
    public void greet(){
        System.out.println("New Hello");
    }

    public static void main(String[] args) {

        Main newMain = new Main();
        newMain.greet();
        newMain.fun();
    }
}

package src.com.demo.singletonClass;

public class Main {
    public static void main(String[] args){
//        Singleton obj = new Singleton();
        System.out.println("Singleton classes can't be called anywhere else");

        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        // All three reference variables are pointing to same object
    }
}

package src.com.demo.singletonClass;

public class Singleton {
    private int a = 0;
    private Singleton (){

    }
    private static Singleton instance;

    public static Singleton getInstance() {

        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}

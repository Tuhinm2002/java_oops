package src.com.demo.packageExample;

public class StaticExample {

    static int a = 5;
    static int b = 7;

    static {
        System.out.println("The static block only runs once");
        System.out.println("hello from static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticExample obj = new StaticExample();
        System.out.println(StaticExample.a + " " + StaticExample.b);

        StaticExample.b += 3;

        StaticExample obj2 = new StaticExample();
        System.out.println(StaticExample.a + " " + StaticExample.b);
    }
}

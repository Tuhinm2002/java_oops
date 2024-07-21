package src.com.demo.access;

public class Main {
    public static void main(String[] args) {
        ExampleClass newClass = new
                ExampleClass(34,"Tuhin",new int[]{1,2,3});

        System.out.println(newClass.getNum());
        System.out.println(newClass.name);
    }
}

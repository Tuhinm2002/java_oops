package src.com.demo.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        // Abstract classes are dependent on child classes for body
        // Abstract classes doesn't have any body

        Son son = new Son(22,10000);
        son.career("software engineer");

        Daughter daughter = new Daughter(34,100000);
        daughter.career("Nurse");

        // Abstract objects cannot be created because there is
        // "no body" of the methods. So how we can access this 

        // Object of abstract class can't be created

        ParentClass daughter1 = new Daughter(34,10000);
        // Here ParentClass is acting as reference variable

    }
}

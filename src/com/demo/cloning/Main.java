package src.com.demo.cloning;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        Human tuhin = new Human(21,"tuhin");
//        Human twin = new Human(tuhin);

        Human twin = (Human)tuhin.clone(); // shallow copying
        // For deep cloning just create a new array and copy the elements

        System.out.println(twin.age);
    }
}

package src.com.demo.packageExample;

public class Main {
    public static void main(String[] args) {
        
        Human tuhin = new Human("Tuhin", 21, 1000000, false);
        Human swarnanko = new Human("Swarnanko", 30, 150000, true);
        Human arpit = new Human("Arpit", 30, 150000, true);

        // System.out.println(tuhin.married);

        // System.out.println(tuhin.population);
        // System.out.println(swarnanko.population);
        // System.out.println(Human.population);



        // static methods are those things which are property independent
        // It is not dependent on other variables

        // The same way we access the other class objects
        Main new_main = new Main();
        new_main.something();

        // something(); this is illegal btw as non-static can't be accessed under static
    }

    void something(){
        System.out.println("Something");
    }
}

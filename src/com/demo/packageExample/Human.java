package src.com.demo.packageExample;


public class Human {
    
    String name;
    int age;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("hello");
        
        // Here this will not work under static 
        //and this keyword represents an object
        // System.out.println(this.age); 
        Human new_age = new Human();
        System.out.println(new_age.age);
    }

    Human(){

    }

    public Human(String name,int age,int salary,boolean married){

        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
        // population += 1; this is also valid
    }

}

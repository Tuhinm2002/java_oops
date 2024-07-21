package src.com.demo.AbstractDemo;

public class Daughter extends ParentClass{

    public Daughter(int age,int salary){
        super(salary);
        this.age = age;
    }

    @Override // dynamic polymorphism
    void career(String name){
        System.out.println("Career "+name + " age is "+age+" salary "+salary);
    }

    @Override
    void partner(String name,int age){
        System.out.println(name + " " + age);
    }

}

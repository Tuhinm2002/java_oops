package src.com.demo.AbstractDemo;

public abstract class ParentClass {

    int age;
    int salary;

    public ParentClass(int salary){
        this.salary = salary;
    }

    abstract void career(String name);
    abstract void partner(String name,int num);
}

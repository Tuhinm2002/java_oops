package src.com.demo.AbstractDemo;

public class Son extends ParentClass{

    public Son(int age,int salary){
        super(salary);
        this.age = age;
    }

    @Override
    void career(String name){
        System.out.println("Career "+name+" age is "+age+" salary "+salary);
    }

    @Override
    void partner(String name,int age){
        System.out.println(name + " " + age);
    }
}

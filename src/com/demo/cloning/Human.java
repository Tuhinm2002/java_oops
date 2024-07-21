package src.com.demo.cloning;

public class Human implements Cloneable{
    int age;
    String name;

    Human(int age,String name){
        this.name = name;
        this.age = age;
    }

    Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

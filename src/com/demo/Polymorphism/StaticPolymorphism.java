package src.com.demo.Polymorphism;

public class StaticPolymorphism {

    int sum(int a,int b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
    double sum(double a,int b){
        return a+b;
    }

    public static void main(String[] args) {

        StaticPolymorphism obj = new StaticPolymorphism();

        System.out.println(obj.sum(1,2));
        System.out.println(obj.sum(1,2,3));

    }
}

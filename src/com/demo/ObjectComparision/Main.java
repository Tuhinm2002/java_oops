package src.com.demo.ObjectComparision;

public class Main {
    public static void main(String[] args) {
        Student tuhin = new Student(61,8.9f);
        Student swarnanko = new Student(58,9.2f);

        if (tuhin.compareTo(swarnanko) > 0){
            System.out.println(tuhin.compareTo(swarnanko));
            System.out.println("tuhin has higher marks");
        }
        else{
            System.out.println("swarnanko has higher marks");
        }
    }
}

package src.com.demo.EncapsulationAbstraction;

public class ObjectDemo{
    public ObjectDemo() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
public static void main(String[] args) {
    ObjectDemo objectDemo = new ObjectDemo();
    System.out.println(objectDemo.hashCode());
    System.out.println(objectDemo instanceof ObjectDemo);

    // Get data about class
    System.out.println(objectDemo.getClass());

    // Get data about class
    System.out.println(objectDemo.getClass().getClasses());

}
}

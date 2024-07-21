package src.com.demo.Inheritance;

public class Main {

    public static void main(String[] args){
        Box box = new Box(4,5,10);

        System.out.println(box.l + " " + box.w + " " + box.h);

        BoxWeight boxWeight = new BoxWeight();

    System.out.println(boxWeight.weight + " " + boxWeight.l +
            " "+ boxWeight.w + " " + boxWeight.h);

    BoxWeight box2 = new BoxWeight(8.5,2.5,3.3,6.7);
        System.out.println(box2.weight + " " + box2.l +
                " "+ box2.w + " " + box2.h);
        //Referencing from parent to child
        Box box3 = new BoxWeight(1,1,2,3);
//        System.out.println(box3.weight); // this is not possible

          // Referencing from parent to child
//        BoxWeight boxWeight1 = new Box(1,1,1,2);

        // Multiple inheritance is not supported by java
        // as if two parent classes has same variable
        // i.e in class A n=5; in class B n=10
        // then in class C which n to pick

        //Multi-level inheritance is supported by java
        // not multiple

        // Hybrid inheritance is also not available

        // All hybrid and multiple can be implemented using interfaces

        // Hierarchical


    }
}

package src.com.demo.Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Poly means -> many
        // morphism means -> ways to represent

        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes circle2 = new Circle();
                        //    ^
                        // Which method will be called depends on the above
                        // This is called upcasting
        

        shape.area();
        square.area();
        circle.area();
        System.out.println("\n");
        System.out.println("Dynamic Polymorphism");
        circle2.area();


        // Types of polymorphism

        // Compile time/Static polymorphism -> achieved by method overloading
        // ex -> multiple constructor

        // Runtime/Dynamic polymorphism -> achieved by method overriding

        Circle new_circle = new Circle();
        new_circle.greeting();

        // static doesn't depends on object
        // but you can inherit it

    }
}

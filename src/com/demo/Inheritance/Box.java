package src.com.demo.Inheritance;

public class Box {
    private double l1; //This private variable is used only in this file
    // And strictly no where else not even accessed in main file


    double l;
    double h;
    double w;

    Box(){
        super(); // Inheriting from object class

        this.w = -1;
        this.l = -1;
        this.h = -1;
    }

    // Making a cube
    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    //Three arguments
    Box(double w,double h,double l){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    //Passing constructor
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void displayInfo(){
        System.out.println("Information about box");
    }
}

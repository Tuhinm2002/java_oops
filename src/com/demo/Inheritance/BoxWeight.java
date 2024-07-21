package src.com.demo.Inheritance;

public class BoxWeight extends Box{
    public double weight;

    public BoxWeight(){

        this.weight = -1;
    }

    public BoxWeight(double l,double w,double h,double weight){
        // Used to initialize values in parent class
        super(l,w,h);
        this.weight = weight;
    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
}

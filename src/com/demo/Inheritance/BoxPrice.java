package src.com.demo.Inheritance;

public class BoxPrice extends BoxWeight{

    double cost;

    BoxPrice(){
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    BoxPrice(double l,double w,double h,double weight,double cost){
        super(l,h,w,weight);
        this.cost = cost;
    }
}

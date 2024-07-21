package src.com.demo.access;

public class ExampleClass {
    private int num;
    protected String name;
    public int[] arr;

    // getters and setters

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public ExampleClass(int num,String name,int[] arr){
        this.num = num;
        this.name = name;
        this.arr = arr;
    }
}

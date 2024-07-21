package src.com.demo.ExceptionHandling;

public class Demo {
    public static void main(String[] args) {
//        Main.divide(3,0);

        try{
            String name = "tuhin";
            if(name.equals("tuhin")){
                throw new MyException("Name tuhin found");
            }
        }
        // More specific things or the child classes are mentioned
        // above the parent class
        catch (ArithmeticException a){
            System.out.println(a.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

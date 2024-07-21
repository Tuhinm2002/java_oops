package src.com.demo.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("No matter what it will run exception occurs " +
                    "or not doesn't matter");
        }
    }

    // basically throws means it may throw an exception
    static int divide(int a,int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Please do not divide by 0");
        }
        else {
            return a/b;
        }
    }
}

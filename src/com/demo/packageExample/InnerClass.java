package src.com.demo.packageExample;

import java.sql.SQLOutput;

// Outer class like the above one can't be static
public class InnerClass {

    // This inner class can be static
    static class Test{
        static String name;
//        String name;

        Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args){

        Test a = new Test("Tuhin");
        Test b = new Test("Swarnanko");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

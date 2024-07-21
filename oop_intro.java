import java.util.Arrays;;

public class oop_intro {
    public static void main(String[] args) {
        // int[] arr = {1,2};
        // System.out.println(Arrays.toString(arr));

        // new is used for dynamic memory allocation
        Student[] students = new Student[5];
        // float i =5.546546f;

        Student tuhin = new Student(61,"Tuhin Mondal",8.8f);
                            // ^ the above thing is called constructor
                            // which allows us to write all the variable names
                            // at once

                            // The constructor is a special function

        System.out.println("By default values "+tuhin.name+" "+tuhin.rno+" "+tuhin.marks);

        // tuhin.name = "Tuhin Mondal";
        // tuhin.marks = 8.8f;
        // tuhin.rno = 61;

        tuhin.changeName("meow");
        tuhin.greeting();

        System.out.println("After updating values "+tuhin.name+" "+tuhin.rno+" "+tuhin.marks);

        // System.out.println(Arrays.toString(students));

        Student newStudent = new Student();

        System.out.println("New student with default constructor "
        +newStudent.name+" "+newStudent.rno+" "+newStudent.marks);

        Student newStudent2 = new Student(tuhin);
        System.out.println("After creating new tuhin "
        +newStudent2.name+" "+newStudent2.rno+" "+newStudent2.marks);

    }
       
}
// class name starts with capital

// classes are logical while object exists physically and occupies some space
class Student{
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Heelllo from "+name);
    }

    void changeName(String newName){
        name = newName;
    }

    // constructor overloading
    
    Student(){
        this.name = null;
        this.marks = 0;
        this.rno = 0;

    }

    Student (String name){
        this (1,"default",0.0f);
    }

    Student (Student other){
        name = other.name;
        rno = other.rno;
        marks = other.marks;
    }

    Student(int roll,String new_name,float new_marks){
        name = new_name;
        marks = new_marks;
        rno = roll;

        // either change the name above or use this keyword for arguments setting

    //     this.name = "Tuhin Mondal";
    //     this.marks = 8.8f;
    //     this.rno = 61;

    }
}
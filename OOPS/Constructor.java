/*
Constructor - It is a special method which is invoked automatically at the time of object creation.

  - Constructors have tha same name as class or structure.
  - Constructors don't have a return type. (Not even void)
  - Constructors are only called once, at object creation.
  - Memory allocations happens when constructor is called.

  Types of Constructor

  1. Non prameterized
  2. Parameterized
  3. Copy Constructor
*/

public class Constructor {
    public static void main(String[] args) {
        /*  Non prameterized constructor
        student s1 = new student(); // Default constructor by java
        
        Parameterized Constructor
        student s2 = new student("VIRAJ");
        System.out.println(s2.name);
        
        student s3 = new student(62);
        System.out.println(s3.roll);
        */
        
        student s4 = new student();
        s4.name = "VIRAJ JAHAV";
        s4.roll = 62;
        s4.password = "abc";
        s4.marks[0] = 100; // physic
        s4.marks[1] = 90;  // chemistry
        s4.marks[2] = 80;  // Math
        
        // Copy Constructor
        student s5 = new student(s4); // copy
        s5.password = "xyz";

        s5.marks[2] = 100;
        
        for(int i=0; i<3; i++) {
            System.out.println(s4.marks[i]);
        }

    }
}

class student {
    String name;
    int roll;
    String password;
    // int marks[]; // Error
    int marks[] = new int[3];

    // Copy Constructor
    student(student s4) {
        this.name = s4.name;
        this.roll = s4.roll;
        this.marks = s4.marks;
    }

    // Non prameterized constructor
    student() {
        System.out.println("Constructor is called...");
    }
    
    // Parameterized Constructor
    student(String name) {
        
        this.name = name;
    }

    student(int roll) {
        
        this.roll = roll;
    }

    
}

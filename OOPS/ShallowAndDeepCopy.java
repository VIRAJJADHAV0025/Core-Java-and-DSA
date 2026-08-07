/*
Shallow & Deep Copy
- In shallow it create references (changes reflects)
- In Deep copy we create a new marks array ( Changes don't reflects)
*/
public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "VIRAJ JAHAV";
        s1.roll = 62;
        s1.password = "abc";
        s1.marks[0] = 100; // physic
        s1.marks[1] = 90;  // chemistry
        s1.marks[2] = 80;  // Math
        
        // Copy Constructor
        student s2 = new student(s1); // copy
        s2.password = "xyz";

        s2.marks[2] = 100;
        
        for(int i=0; i<3; i++) {
            System.out.println(s1.marks[i]);
        }
    }
}

class student {
    String name;
    int roll;
    String password;
    // int[] marks; // Error
    int marks[] = new int[3];

    // // Shallow Copy Constructor
    // student(student s1) {
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // Deep copy Constructor
    student(student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length;i++) {
            this.marks[i] = s1.marks[i];
        }
    }

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

package Oops_Assignment;


class Student {
    // Private data members
    private String name;
    private int rollNo;
    private float marks;

    // --- Getter for name ---
    public String getName() {
        return name;
    }

    // --- Setter for name ---
    public void setName(String name) {
        this.name = name;
    }

    // --- Getter for rollNo ---
    public int getRollNo() {
        return rollNo;
    }

    // --- Setter for rollNo ---
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // --- Getter for marks ---
    public float getMarks() {
        return marks;
    }

    // --- Setter for marks with validation ---
    public void setMarks(float marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("❌ Invalid marks! Marks must be between 0 and 100.");
        } else {
            this.marks = marks;
        }
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();

        // Using setters
        s.setName("Rohith");
        s.setRollNo(101);

        s.setMarks(90);   // ✔ valid
        s.setMarks(150);  // ❌ invalid

        // Using getters
        System.out.println("\nUsing Getters:");
        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Marks: " + s.getMarks());

        System.out.println("\nUsing display():");
        s.display();
    }
}

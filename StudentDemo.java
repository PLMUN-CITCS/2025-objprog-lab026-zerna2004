class Student {

    private final String name;
    private final int id;
    private final double gpa;
    private static int studentCount = 0;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        studentCount++;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }

    public static void displayStudentCount() {
        System.out.println("Total students: " + studentCount);
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Student student1 = new Student("Alice", 101, 3.8);
        Student student2 = new Student("Bob", 102, 3.5);
        Student student3 = new Student("Charlie", 103, 3.9);

        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();

        Student.displayStudentCount();
    }
}

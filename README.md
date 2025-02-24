# **2025-OBJPROG-LAB026**
Week 05 - Methods in Java

Laboratory # 26 - Week 05 - Guided Coding Exercise 5: Integrated Example - Modeling a Student Class

## **Instructions**

### **Step 1.1: Accept the Assignment**

   1. Click on the assignment link provided by your instructor.
   2. GitHub Classroom will create a **private repository** under your GitHub account.
   3. After the repository is created, click **"Go to Repository"** to view your assignment.

---

### **Step 1.2: Setup your Git Environment**
Only perform this if this is the first time you will setup your Git Environment

   1. Create a GitHub Account:
   ```bash
   https://github.com/signup?source=login
   ```
      
   2. Download and Install Git on your Laptop/Desktop:
   ```bash
   https://git-scm.com/downloads
   ```
   
   3. Create a Folder in your Laptop/Desktop
   4. Right-click anywhere in the created folder and select "Open Git Bash Here".
   5. In the Git Bash Terminal, set your git name, perform command:
   ```bash
   git config --global user.name "Your Name"
   ```
   
   6. In the Git Bash Terminal, set your git email, perform command:
   ```bash
   git config --global user.email "your.email@example.com"
   ```
   
   7. Create your SSH Key, just follow the instructions, no need to provide filename and passphrase. In the Git Bash Terminal, perform command:
   ```bash
   ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
   ```
   
   8. Copy your SSH Keys into clipboard. In the Git Bash Terminal, perform command:
   ```bash
   clip < ~/.ssh/id_rsa.pub
   ```
   
   9. Log in to your GitHub account.
   10. In the upper-right corner of GitHub, click your profile picture and select Settings.
   11. In the left sidebar, click on SSH and GPG keys.
   12. Click the New SSH key button.
   13. In the Title field, give the key a recognizable name (e.g., "My Windows Laptop").
   14. In the Key field, CTRL + V or paste the keys copied into your clipboard. Save the key.
   15. Go Back to terminal, use command:
   ```bash
   ssh -T git@github.com
   ```

### **Step 2: Clone the Repository to Your Local Machine**

   1. On your repository page, click the green **"Code"** button.
   2. Copy the repository URL (choose HTTPS for simplicity).
   3. Open your terminal (or Git Bash, Command Prompt, or PowerShell) and run:
   
   ```bash
   git clone <git_repo_url>
   ```
   
   4. Navigate into the cloned folder:
   
   ```bash
   cd <git_cloned_folder>
   ```

### **Step 3: Complete the Assignment**

**Laboratory # 26 - Week 05 - Guided Coding Exercise 5: Integrated Example - Modeling a Student Class**

   **Objective:**
   - Combine all concepts: classes, objects, access modifiers, constructors, methods, static members, and a discussion on deconstruction.

   **File Naming Convention:**
   - `StudentDemo.java`

   **Desired Output:**
   ```txt
   Student ID: 101, Name: Alice, GPA: 3.8
   Student ID: 102, Name: Bob, GPA: 3.5
   Student ID: 103, Name: Charlie, GPA: 3.9
   Total students: 3
   ```

   **Notable Observations:**
   - This example combines various object-oriented programming concepts:
      - Classes and objects
      - Access modifiers
      - Constructors
      - Instance methods
      - Static variables and methods
   - The studentCount variable is shared by all instances of the Student class and is incremented each time a new Student object is created.
   - You can call the static method displayStudentCount() directly using the class name, without needing an object instance.

   **Java Programming Best Practices:**
   - Use private access for attributes to enforce encapsulation.
   - Provide constructors to initialize objects.
   - Use static variables for data shared across all objects of a class.
   - Use static methods for operations related to the class itself rather than specific instances.
      
   **Step-by-Step Instructions:**

   1. Create the Item Class
      - Create a new Java file named `StudentDemo.java`.
      - Define a class called `Student`.
      ```Java      
      class Student {
          // Code will go here
      }
      ```
            
   2. Add Private Attributes
      - Inside the Student class, declare three instance variables (attributes) with private access:
         - name of type String
         - id of type int
         - gpa of type double
      ```Java
      class Student {
          private String name;
          private int id;
          private double gpa;
      }
      ```

   3. Add a Static Variable
      - Inside the Student class, declare a static variable named studentCount of type int. Initialize it to 0.
      - Use the static keyword to indicate that this variable belongs to the class itself, not to any specific object of the class.
      ```Java
      class Student {
          //... (private attributes)...
          private static int studentCount = 0;
      }
      ```

   4. Create a Constructor
      - Inside the Student class, create a constructor.
      - The constructor should take three parameters:
         - a String for the name
         - an int for the id
         - a double for the gpa
      - Inside the constructor, initialize the name, id, and gpa attributes using the provided parameters.
      - Increment the static studentCount variable by 1.
      ```Java
      class Student {
          //... (attributes)...
      
          public Student(String name, int id, double gpa) {
              this.name = name;
              this.id = id;
              this.gpa = gpa;
              studentCount++;
          }
      }
      ```

   5. Add a displayStudentInfo Method
      - Inside the Student class, create a method named displayStudentInfo.
      - This method should not return any value (void).
      - Inside the displayStudentInfo method, add a println statement to print the student's information in the format: "Student ID: [id], Name: [name], GPA: [gpa]"
      ```Java
      class Student {
          //... (attributes and constructor)...
      
          public void displayStudentInfo() {
              System.out.println("Student ID: " + id + ", Name: " + name + ", GPA: " + gpa);
          }
      }
      ```

   6. Add a Static displayStudentCount Method
      - Inside the Student class, create a static method named displayStudentCount.
      - This method should not return any value (void).
      - Inside the displayStudentCount method, add a println statement to print the value of the studentCount variable.
      ```Java
      class Student {
          //... (other methods)...
      
          public static void displayStudentCount() {
              System.out.println("Total students: " + studentCount);
          }
      }
      ```

   7. Create the main Method
      - In the same file (StudentDemo.java), outside the Student class, create the main method.
      ```Java
      public class StudentDemo {
          public static void main(String[] args) {
              // Code will go here
          }
      }
      ```

   8. Create Student Objects
      - Inside the main method, create three objects of the Student class named student1, student2, and student3, each with different names, IDs, and GPAs.
      ```Java
      Student student1 = new Student("Alice", 101, 3.8);
      Student student2 = new Student("Bob", 102, 3.5);
      Student student3 = new Student("Charlie", 103, 3.9);
      ```
      
   9. Call the Instance and Static Methods
      - In the main method, call the displayStudentInfo() method on each of the Student objects (student1, student2, student3).
      ```Java
      student1.displayStudentInfo();
      student2.displayStudentInfo();
      student3.displayStudentInfo();
      ```
      - Call the static displayStudentCount() method using the class name: Student.displayStudentCount();
      ```Java
      Student.displayStudentCount();
      ```
      
   10. Compile and Run
       - Save the file as `StudentDemo.java`.
       - Compile the code using `javac StudentDemo.java` in your terminal or command prompt.
       - Run the compiled code using `java StudentDemo`.

   **Conclusion**
   This exercise provided an integrated example of modeling a real-world entity (a student) using a class in Java. It combined various object-oriented programming concepts to create a more comprehensive and realistic example. By understanding and applying these concepts, you can build well-structured and maintainable Java programs that effectively model and manage data and behavior.

### **Step 4: Push Changes to GitHub**
Once you've completed your changes, follow these steps to upload your work to your GitHub repository.

1. Check the status of your changes:
   Open the terminal and run:
   
   ```bash
   git status
   ```
   This command shows any modified or new files.
   
2. Stage the changes:
   Add all modified files to staging:
   
   ```bash
   git add .
   ```
   
3. Commit your changes:
   Write a meaningful commit message:
   
   ```bash
   git commit -m "Submitting OBJPROG Week 05 - Laboratory # 26"
   ```
   
4. Push your changes to GitHub:
   Upload your changes to your remote repository:
   
   ```bash
   git push origin main
   ```

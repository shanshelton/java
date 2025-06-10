import java.util.Scanner; 
 
class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
         
        // Prompt user for the number of teachers 
        System.out.print("Enter the number of teachers: "); 
        int numberOfTeachers = Integer.parseInt(sc.nextLine()); 
         
        // Create an array to hold Teacher objects 
        Teacher teacObj[] = new Teacher[numberOfTeachers]; 
         
        // Loop to gather details for each teacher 
        for (int i = 0; i < numberOfTeachers; i++) { 
            System.out.println("Enter details for Teacher " + (i + 1) + ":"); 
            System.out.print("EmpID: "); 
            String empId = sc.nextLine(); 
            System.out.print("Name: "); 
            String name = sc.nextLine(); 
            System.out.print("Address: "); 
            String address = sc.nextLine(); 
            System.out.print("Salary: "); 
            int salary = Integer.parseInt(sc.nextLine()); 
            System.out.print("Department: "); 
            String department = sc.nextLine(); 
            System.out.print("Subject: "); 
            String subject = sc.nextLine(); 
             
            // Create a new Teacher object and store it in the array 
            teacObj[i] = new Teacher(empId, name, address, salary, department, subject); 
        } 
         
        // Display all teacher details 
        System.out.println("\nTeacher Details:"); 
        for (int i = 0; i < numberOfTeachers; i++) { 
            teacObj[i].display(); 
        } 
         
        // Close the scanner 
        sc.close(); 
    } 
} 
 
class Employees { 
    String Empid; 
    String Name; 
    String Address; 
    int Salary; 
 
    Employees(String id, String name, String addr, int salary) { 
        this.Empid = id; 
        this.Name = name; 
        this.Address = addr; 
        this.Salary = salary; 
    } 
 
    void display() { 
        System.out.println("EmpID   : " + this.Empid); 
        System.out.println("Name    : " + this.Name); 
        System.out.println("Address : " + this.Address); 
        System.out.println("Salary  : " + this.Salary); 
    } 
} 
 
class Teacher extends Employees { 
    String Department; 
    String Subject; 
 
    Teacher(String id, String name, String addr, int salary, String dept, String subj) { 
        super(id, name, addr, salary); 
        this.Department = dept; 
        this.Subject = subj; 
    } 
 
    void display() { 
        System.out.println(".........................................."); 
        super.display(); 
        System.out.println("Dept Name : " + this.Department); 
        System.out.println("Subject Name : " + this.Subject); 
        System.out.println(".........................................."); 
    } 
} 
 

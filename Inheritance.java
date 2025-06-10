import java.util.Scanner;
class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of teachers: ");
        int numberOfTeachers = Integer.parseInt(sc.nextLine());
        Teacher[] teacObj = new Teacher[numberOfTeachers];
        for (int i = 0; i < numberOfTeachers; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1) + ":");
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
            teacObj[i] = new Teacher(empId, name, address, salary, department, subject);
        }
        System.out.println("\n============= Teacher Details =============");
        for (int i = 0; i < numberOfTeachers; i++) {
            teacObj[i].display();
        }
        sc.close();
    }  }
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
        System.out.println("EmpID    : " + this.Empid);
        System.out.println("Name     : " + this.Name);
        System.out.println("Address  : " + this.Address);
        System.out.println("Salary   : " + this.Salary);
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
    @Override
    void display() {
        System.out.println("------------------------------------------");
        super.display();
        System.out.println("Department: " + this.Department);
        System.out.println("Subject   : " + this.Subject);
        System.out.println("------------------------------------------");
    }
}

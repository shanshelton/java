import java.util.Scanner;
class Person 
{
    String name, gender, address;
    protected int age;
    public Person() {}
    public Person(String n, String g, String addr, int a) 
{
        this.name = n;
        this.gender = g;
        this.address = addr;
        this.age = a;
    }

    public void displayPerson()
 {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person
 {
     int empid, salary;
    String companyName, qualif;	
    public Employee() {}	
    public Employee(String n, String g, String addr, int a, int eid, String cname, String qual, int sal)
 {
        super(n, g, addr, a);
        empid = eid;
        companyName = cname;
        qualif = qual;
        salary = sal;
    }
    public void displayEmployee()
{
        super.displayPerson();
        System.out.println("EmpID: " + empid);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualif);
        System.out.println("Salary: " + salary);
    }
}
class Teacher extends Employee
 {
    int teacherid;
    String subject, department;
    public Teacher(String n, String g, String addr, int a, int eid, String cname, String qual, int sal, String sub, String dept, int tid) 
{
        super(n, g, addr, a, eid, cname, qual, sal);
        subject = sub;
        department = dept;
        teacherid = tid;
    }
    public void displayTeacher()
 {
        super.displayEmployee();
        System.out.println("Teacher ID: " + teacherid);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
    }
}

public class school
 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of teachers:");
        int n = s.nextInt();
        s.nextLine(); 
        Teacher[] teachers = new Teacher[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of teacher:");
            String name = s.nextLine();
            System.out.println("Enter gender of teacher:");
            String gen = s.nextLine();
            System.out.println("Enter address of teacher:");
            String addr = s.nextLine();
            System.out.println("Enter age of teacher:");
            int age = s.nextInt();
            System.out.println("Enter EmpID of teacher:");
            int eid = s.nextInt();
            s.nextLine(); // Consume the newline character
            System.out.println("Enter company name:");
            String cn = s.nextLine();
            System.out.println("Enter qualification of teacher:");
            String quali = s.nextLine();
            System.out.println("Enter salary of teacher:");
            int sal = s.nextInt();
            System.out.println("Enter ID of teacher:");
            int tid = s.nextInt();
            s.nextLine(); // Consume the newline character
            System.out.println("Enter subject of teacher:");
            String sub = s.nextLine();
            System.out.println("Enter department of teacher:");
            String dept = s.nextLine();
            Teacher t = new Teacher(name, gen, addr, age, eid, cn, quali, sal, sub, dept, tid);
            teachers[i] = t;
        }
        System.out.println("\nTeacher Details:");
         for (Teacher t : teachers)
 {
            t.displayTeacher();
        }
        s.close();
    }
}


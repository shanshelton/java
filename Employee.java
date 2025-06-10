import java.util.Scanner; 
 
class Employee { 
    int eNo; 
    String eName; 
    int eSalary; 
 
    public void read() { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter ID : "); 
        eNo = Integer.parseInt(sc.nextLine()); 
        System.out.print("Enter Name : "); 
        eName = sc.nextLine(); 
        System.out.print("Enter monthly salary : "); 
        eSalary = Integer.parseInt(sc.nextLine()); 
    } 
 
    public void display() { 
        System.out.println("ID: " + eNo); 
        System.out.println("Name: " + eName); 
        System.out.println("Monthly Salary: " + eSalary); 
    } 
 
    public static void main(String[] args) { 
        int i, n = 3; 
        int No; 
        Employee emp[] = new Employee[n]; 
        Scanner sc = new Scanner(System.in); // Create a single Scanner instance 
 
        for (i = 0; i < n; i++) { 
            emp[i] = new Employee(); 
            emp[i].read(); 
        } 
 
        System.out.println("Search"); 
        while (true) { 
            System.out.print("Enter ID (or type 'exit' to quit): "); 
            String input = sc.nextLine(); 
            if (input.equalsIgnoreCase("exit")) { 
                break; // Exit the loop if the user types 'exit' 
            } 
            No = Integer.parseInt(input); 
            boolean found = false; // Flag to check if employee is found 
            for (i = 0; i < n; i++) { 
                if (emp[i].eNo == No) { 
                    emp[i].display(); 
                    found = true; // Set flag to true if found 
                    break; 
                } 
            } 
            if (!found) { 
                System.out.println("Employee with ID " + No + " not found."); 
            } 
        } 
        sc.close(); // Close the scanner 
    } 
} 
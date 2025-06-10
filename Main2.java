import java.util.Scanner;

class Student {
    private String name;
    private String rollNumber;
    private String grade;

    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String displayAcademicInfo() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
    }
}

class Sport {
    private String sportName;
    private String teamName;

    public Sport(String sportName, String teamName) {
        this.sportName = sportName;
        this.teamName = teamName;
    }

    public String displaySportInfo() {
        return "Sport: " + sportName + ", Team: " + teamName;
    }
}

class Result extends Student {
    private Sport sport;

    public Result(String name, String rollNumber, String grade, String sportName, String teamName) {
        super(name, rollNumber, grade);
        this.sport = new Sport(sportName, teamName);
    }

    public String displayResult() {
        return displayAcademicInfo() + "\n" + sport.displaySportInfo();
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student information
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter grade: ");
        String grade = scanner.nextLine();

        // Get sport information
        System.out.print("Enter sport name: ");
        String sportName = scanner.nextLine();

        System.out.print("Enter team name: ");
        String teamName = scanner.nextLine();

        // Create Result object with user input
        Result result = new Result(name, rollNumber, grade, sportName, teamName);
        
        // Display the result
        System.out.println(result.displayResult());

        // Close the scanner
        scanner.close();
    }
}

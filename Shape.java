import java.util.Scanner; 
 
interface Ap { 
    void input(); 
    void area(); 
    void perimeter(); 
} 
 
class Rectangle implements Ap { 
    int l = 0, b = 0; 
    double area, perimeter; 
 
    public void input() { 
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter the length of rectangle:"); 
        l = s.nextInt(); 
        System.out.println("Enter the breadth of the rectangle:"); 
        b = s.nextInt(); 
    } 
 
    public void area() { 
        area = l * b; 
        System.out.println("Area of the rectangle: " + area); 
    } 
 
    public void perimeter() { 
        perimeter = 2 * (l + b); 
        System.out.println("The perimeter of the rectangle: " + perimeter); 
    } 
} 
 
class Circle implements Ap { 
    int r = 0; 
    double pi = 3.14, area = 0, perimeter = 0; 
 
    public void input() { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the radius of the circle:"); 
        r = sc.nextInt(); 
    } 
 
    public void area() { 
        area = pi * r * r; 
        System.out.println("Area of the circle: " + area); 
    } 
 
    public void perimeter() { 
        perimeter = 2 * pi * r; // Corrected formula for circumference 
        System.out.println("Perimeter of the circle: " + perimeter); 
    } 
} 
 
class Shape { 
    public static void main(String args[]) { 
        int ch; 
        Circle c = new Circle(); 
        Rectangle r = new Rectangle(); 
        Scanner s = new Scanner(System.in); 
        System.out.println("1. Area of the circle\n2. Area of rectangle\n3. Perimeter of the 
circle\n4. Perimeter of the rectangle\n5. Exit"); 
 
        while (true) { 
            System.out.println("Make your choice:"); 
            ch = s.nextInt(); 
            switch (ch) { 
                case 1: 
                    c.input(); 
                    c.area(); 
                    break; 
                case 2: 
                    r.input(); 
                    r.area(); 
                    break; 
                case 3: 
                    c.input(); 
                    c.perimeter(); 
                    break; 
                case 4: 
                    r.input(); 
                    r.perimeter(); 
                    break; 
                case 5: 
                    s.close(); // Close the scanner 
                    return; // Exit the program 
                default: 
                    System.out.println("Invalid entry"); 
            } 
        } 
    } 
} 
 

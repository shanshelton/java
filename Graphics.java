import java.util.Scanner; 
 
class Circle { 
    private int radius; 
 
    public Circle(int r) { 
        radius = r; 
    } 
 
    public double area() { 
        return (3.14 * radius * radius); 
    } 
} 
 
class Triangle { 
    private int si1, si2, si3; 
 
    public Triangle(int s1, int s2, int s3) { 
        si1 = s1; 
        si2 = s2; 
        si3 = s3; 
    } 
 
    public double area() { 
        double s = (si1 + si2 + si3) / 2.0; 
        return Math.sqrt(s * (s - si1) * (s - si2) * (s - si3)); // Heron's formula 
    } 
} 
 
class Square { 
    private int side; 
 
    public Square(int s) { 
        side = s; 
    } 
 
    public int area() { 
        return (side * side); 
    } 
} 
 
public class Graphics { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        // Square 
        System.out.println("Enter the side of the square:"); 
        int s = sc.nextInt(); 
        Square sq = new Square(s); 
        System.out.println("Area of the square: " + sq.area()); 
 
        // Circle 
        System.out.println("Enter the radius of the circle:"); 
        int r = sc.nextInt(); 
        Circle c1 = new Circle(r); 
        System.out.println("Area of the circle: " + c1.area()); 
 
        // Triangle 
        System.out.println("Enter the 3 sides of the triangle:"); 
        int s1 = sc.nextInt(); 
        int s2 = sc.nextInt(); 
        int s3 = sc.nextInt(); 
        Triangle t1 = new Triangle(s1, s2, s3); 
        System.out.println("Area of the triangle: " + t1.area()); 
 
        sc.close(); // Always good to close the scanner 
    } 
}
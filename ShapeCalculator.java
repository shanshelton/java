import java.util.Scanner; 
 
class Circle { 
    private int radius; 
 
    public void setRadius(int r) { 
        this.radius = r; 
    } 
 
    public float area() { 
        return (3.14F * radius * radius); 
    } 
 
    public float perimeter() { 
        return (2 * 3.14F * radius); 
    } 
} 
 
class Rectangle { 
    private int length, breadth; 
 
    public void setDimensions(int l, int b) { 
        this.length = l; 
        this.breadth = b; 
    } 
 
    public float area() { 
        return (length * breadth); 
    } 
 
    public float perimeter() { 
        return (2 * (length + breadth)); 
    } 
} 
 
public class ShapeCalculator { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        Circle circle = new Circle(); 
        Rectangle rectangle = new Rectangle(); 
        int choice; 
 
        while (true) { 
            System.out.println("1: Set Circle Radius"); 
            System.out.println("2: Area of Circle"); 
            System.out.println("3: Perimeter of Circle"); 
            System.out.println("4: Set Rectangle Dimensions"); 
            System.out.println("5: Area of Rectangle"); 
            System.out.println("6: Perimeter of Rectangle"); 
            System.out.println("7: EXIT"); 
            System.out.print("Enter choice: "); 
            choice = Integer.parseInt(sc.nextLine()); 
 
            switch (choice) { 
                case 1: 
                    System.out.print("Enter the radius: "); 
                    int radius = Integer.parseInt(sc.nextLine()); 
                    circle.setRadius(radius); 
                    break; 
                case 2: 
                    System.out.println("Area of Circle: " + circle.area()); 
                    break; 
                case 3: 
                    System.out.println("Perimeter of Circle: " + circle.perimeter()); 
                    break; 
                case 4: 
                    System.out.print("Enter the Length: "); 
                    int length = Integer.parseInt(sc.nextLine()); 
                    System.out.print("Enter the Breadth: "); 
                    int breadth = Integer.parseInt(sc.nextLine()); 
                    rectangle.setDimensions(length, breadth); 
                    break; 
                case 5: 
                    System.out.println("Area of Rectangle: " + rectangle.area()); 
                    break; 
                case 6: 
                    System.out.println("Perimeter of Rectangle: " + rectangle.perimeter()); 
                    break; 
                case 7: 
                    System.out.println("Exiting the Program"); 
                    sc.close(); 
                    System.exit(0); 
                default: 
                    System.out.println("Invalid choice! Please try again."); 
            } 
        } 
    } 
}
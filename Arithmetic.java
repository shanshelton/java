import java.util.Scanner; 
 
class Add { 
    private int x, y; 
 
    public Add(int a, int b) { 
        x = a; 
        y = b; 
    } 
 
    public int add() { 
        return x + y; 
    } 
} 
 
class Sub { 
    private int x, y; 
 
    public Sub(int a, int b) { 
        x = a; 
        y = b; 
    } 
 
    public int subtract() { 
        return x - y; 
    } 
} 
 
class Mul { 
    private int x, y; 
 
    public Mul(int a, int b) { 
        x = a; 
        y = b; 
    } 
 
    public int multiply() { 
        return x * y; 
    } 
} 
 
class Div { 
    private int x, y; 
 
    public Div(int a, int b) { 
        x = a; 
        y = b; 
    } 
 
    public int divide() { 
        if (y == 0) { 
            throw new ArithmeticException("Division by zero is not allowed."); 
        } 
        return x / y; 
    } 
} 
 
public class Arithmetic { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter two numbers:"); 
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
 
        Add add = new Add(a, b); 
        System.out.println("Addition: " + add.add()); 
 
        Sub sub = new Sub(a, b); 
        System.out.println("Subtraction: " + sub.subtract()); 
 
        Mul mul = new Mul(a, b); 
        System.out.println("Product: " + mul.multiply()); 
 
        Div div = new Div(a, b); 
        try { 
            System.out.println("Division: " + div.divide()); 
        } catch (ArithmeticException e) { 
            System.out.println(e.getMessage()); 
        } 
 
        sc.close(); 
    } 
} 

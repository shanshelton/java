import java.util.Scanner; 
 
class EvenRangeThread implements Runnable { 
    private int start; 
    private int end; 
 
    public EvenRangeThread(int start, int end) { 
        this.start = start; 
        this.end = end; 
    } 
 
    @Override 
    public void run() { 
        for (int k = start; k <= end; k++) { 
            if (k % 2 == 0) { 
                System.out.println("Even Range Thread: " + k); 
            } 
        } 
    } 
} 
 
class Fthread implements Runnable { 
    private int count; 
 
    public Fthread(int count) { 
        this.count = count; 
    } 
 
    @Override 
    public void run() { 
        int a = 0, b = 1, c; 
        if (count <= 0) { 
            System.out.println("Fib Thread: Invalid count"); 
            return; 
        } 
        System.out.println("Fib Thread: " + a); 
        if (count == 1) return; 
        System.out.println("Fib Thread: " + b); 
        for (int i = 2; i < count; i++) { 
            c = a + b; 
            System.out.println("Fib Thread: " + c); 
            a = b; 
            b = c; 
        } 
    } 
} 
 
public class Main17 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter start of even range: "); 
        int evenStart = sc.nextInt(); 
 
        System.out.print("Enter end of even range: "); 
        int evenEnd = sc.nextInt(); 
 
        System.out.print("Enter number of Fibonacci numbers to print: "); 
        int fibCount = sc.nextInt(); 
 
        Fthread ft = new Fthread(fibCount); 
        EvenRangeThread ev = new EvenRangeThread(evenStart, evenEnd); 
 
        Thread t1 = new Thread(ft); 
        Thread t2 = new Thread(ev); 
 
        t1.start(); 
        t2.start(); 
 
        sc.close(); 
    } 
} 

import java.util.Scanner; 
import java.util.Calendar; 
import java.util.Date; 
 
interface Begin { 
    int calculate(); 
} 
 
class Product implements Begin { 
    public String name; 
    public int prodid, quantity, unitprice, total; 
 
    Product() { 
    } 
 
    public Product(String n, int p, int q, int u) { 
        name = n; 
        prodid = p; 
        quantity = q; 
        unitprice = u; 
    } 
 
    public int calculate() { 
        total = quantity * unitprice; 
        return total; 
    } 
} 
 
public class Shop { 
    public static void main(String args[]) { 
        Product[][] order; 
        System.out.println("Enter the number of orders:"); 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        order = new Product[n][]; 
 
        for (int i = 0; i < n; i++) { 
            System.out.println("Enter the number of products for order " + (i + 1) + ":"); 
            int m = sc.nextInt(); 
            order[i] = new Product[m]; 
            for (int j = 0; j < m; j++) { 
                System.out.println("Enter product " + (j + 1) + " name:"); 
                String a = sc.next(); 
                System.out.println("Enter product ID:"); 
                int b = sc.nextInt(); 
                System.out.println("Enter product quantity:"); 
                int c = sc.nextInt(); 
                System.out.println("Enter product price:"); 
                int d = sc.nextInt(); 
                Product pb = new Product(a, b, c, d); 
                order[i][j] = pb; 
                order[i][j].total = order[i][j].calculate(); 
            } 
        } 
 
        for (int i = 0; i < n; i++) { 
            int sum = 0; 
            System.out.println("\nOrder number " + (i + 1)); 
            Date date = Calendar.getInstance().getTime(); 
            System.out.println(date); 
            System.out.println("_________"); 
            System.out.println("Product ID\tProduct Name\tQuantity\tUnit Price\tTotal"); 
            System.out.println("__________________________________________________"); 
            for (int j = 0; j < order[i].length; j++) { 
                System.out.println(order[i][j].prodid + "\t\t" + order[i][j].name + "\t\t" + 
order[i][j].quantity + "\t\t" + order[i][j].unitprice + "\t\t" + order[i][j].total); 
            } 
            for (int t = 0; t < order[i].length; t++) { 
                sum += order[i][t].total; 
            } 
            System.out.println("Net amount: " + sum); 
            System.out.println("__________"); 
        } 
        sc.close(); 
    } 
} 
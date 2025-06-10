Program 1 
 
import java.util.Scanner; 
 
class Product { 
    String pname, pcode; 
    int price; 
 
    public Product(String pname, String pcode, int price) { 
        this.pname = pname; 
        this.pcode = pcode; 
        this.price = price; 
    } 
 
    public Product() {} 
 
    public void setPname(String pname) { 
        this.pname = pname; 
    } 
 
    public String getPname() { 
        return pname; 
    } 
 
    public void setPcode(String pcode) { 
        this.pcode = pcode; 
    } 
 
    public String getPcode() { 
        return pcode; 
    } 
 
    public int getPrice() { 
        return price; 
    } 
 
    public void display() { 
        System.out.println("Product Code: " + this.pcode); 
        System.out.println("Product Name: " + this.pname); 
        System.out.println("Product Price: " + this.price); 
    } 
} 
 
public class main { 
    public static void main(String args[]) { 
        Scanner prd = new Scanner(System.in); 
 
        // Create arrays to store product names, codes, and prices 
        String[][] pnc = new String[5][2]; 
        int[] price = new int[5]; 
        int min = Integer.MAX_VALUE;  // Initialize min with the largest possible value 
        int minIndex = -1;  // To keep track of the product with the minimum price 
 
        // Input product details 
        System.out.println("Enter the details of 5 products"); 
        System.out.println("Enter Product Name, Product Code, Product Price"); 
        for (int i = 0; i < 5; i++) { 
 
            System.out.println("Details of Product " + (i+1) + " : "); 
            System.out.print("Product Name: "); 
            pnc[i][0] = prd.nextLine(); 
            System.out.print("Product Code: "); 
            pnc[i][1] = prd.nextLine(); 
            System.out.print("Product Price: "); 
            price[i] = prd.nextInt(); 
            prd.nextLine(); // Consume the newline 
 
            // Track the product with the minimum price 
            if (price[i] < min) { 
                min = price[i]; 
                minIndex = i; 
            } 
        } 
 
        // Create product objects 
        Product[] products = new Product[5]; 
        for (int i = 0; i < 5; i++) { 
            products[i] = new Product(pnc[i][0], pnc[i][1], price[i]); 
        } 
 
        // Display product details 
        System.out.println("\nProduct details:"); 
        for (int i = 0; i < 5; i++) { 
            System.out.println("Product No. " + (i + 1)); 
            products[i].display(); 
        } 
 
        // Display the product with minimum price 
        System.out.println("\nProduct with minimum price:"); 
        products[minIndex].display(); 
    } 
} 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

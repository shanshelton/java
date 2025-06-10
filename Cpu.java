import java.util.Scanner; 
 
class Cpu { 
    int price; 
 
    Cpu(int p) { 
        this.price = p; 
    } 
 
    class Processor { 
        int cores; 
        String manufacture; 
 
        Processor(int n, String m) { 
            this.cores = n; 
            this.manufacture = m; 
        } 
 
        void display() { 
            System.out.println("No of Cores : " + this.cores); 
            System.out.println("Processor Manufacturer : " + this.manufacture); 
        } 
    } 
 
    static class Ram { 
        int memory; 
        String manufacture; 
 
        Ram(int n, String m) { 
            this.memory = n; 
            this.manufacture = m; 
        } 
 
        void display() { 
            System.out.println("Memory Size : " + this.memory); 
            System.out.println("Memory Manufacturer : " + this.manufacture); 
        } 
    } 
 
    void display() { 
        System.out.println("Price of CPU : " + this.price); 
    } 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        // Input for CPU price 
        System.out.print("Enter the price of the CPU: "); 
        int cpuPrice = scanner.nextInt(); 
        scanner.nextLine();  // Consume the newline character 
 
        Cpu intel = new Cpu(cpuPrice); 
 
        // Input for Processor 
        System.out.print("Enter the number of cores in the processor: "); 
        int cores = scanner.nextInt(); 
        scanner.nextLine();  // Consume the newline character 
 
        System.out.print("Enter the manufacturer of the processor: "); 
        String processorManufacture = scanner.nextLine(); 
 
        Cpu.Processor i_processor = intel.new Processor(cores, processorManufacture); 
 
        // Input for RAM 
        System.out.print("Enter the memory size of the RAM: "); 
        int memory = scanner.nextInt(); 
        scanner.nextLine();  // Consume the newline character 
 
        System.out.print("Enter the manufacturer of the RAM: "); 
        String ramManufacture = scanner.nextLine(); 
 
        Cpu.Ram i_ram = new Ram(memory, ramManufacture); 
 
        // Display the information 
        intel.display(); 
        i_processor.display(); 
        i_ram.display(); 
 
        scanner.close(); 
} 
}
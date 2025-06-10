import java.io.*;

public class RecursiveDirectory {
    public static void main(String[] args) {
        File folder = new File("C:\\arunima"); // change path as needed
        System.out.println("***");
        System.out.println("Files from main directory: " + folder.getPath());
        System.out.println("***");
        recursivePrint(folder);
    }

    public static void recursivePrint(File f) {
        File[] files = f.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getName());
                    recursivePrint(file); // 🔁 Recursively go inside
                } else {
                    System.out.println("File     : " + file.getName());
                }
            }
        }
    }
}
import java.util.Scanner;
import java.util.Arrays;
public class Sorting {
public static void main(String[] args) {
int count = 0;
String temp;
Scanner s = new Scanner(System.in);
System.out.println("ENTER NO. OF STRINGS TO BE SORTED:");
count = s.nextInt();
s.nextLine();
String[] str_list = new String[count];
System.out.println("ENTER YOUR STRINGS:");
for (int i = 0; i < count; i++) {
str_list[i] = s.nextLine();
}
System.out.println("CHOOSE 1 OR 2 FROM THE MENU BELOW:");
System.out.println("1. INBUILT SORT()");
System.out.println("2. USER_DEFINED_SORTING_LOGIC()");
int choice = s.nextInt();
switch (choice) {
case 1:
Arrays.sort(str_list);
System.out.println(Arrays.toString(str_list));
break;
case 2:
for (int i = 0; i < count; i++) {
for (int j = i + 1; j < count; j++) {
if (str_list[i].compareTo(str_list[j]) > 0) {
temp = str_list[i];
str_list[i] = str_list[j];
str_list[j] = temp;
} } }
System.out.println(Arrays.toString(str_list));
break;
default:
System.out.println("Invalid choice. Please choose 1 or 2.");
break;
}
s.close();
}
}


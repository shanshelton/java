import java.util.Scanner;
class UserNameException extends Exception {
    public UserNameException(String msg) {
        super(msg);
    }    }
class PasswordException extends Exception {
    public PasswordException(String msg) {
        super(msg);
    }   }
public class User {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String userName, password;
        System.out.println("Enter User Name:");
        userName = s.nextLine();
        System.out.println("Enter the Password:");
        password = s.nextLine();
        int length = userName.length();
        try {
            if (length < 6)
                throw new UserNameException("Username must be at least 6 characters.");
            else if (!password.equals("hello"))
                throw new PasswordException("Incorrect password.");
            else
                System.out.println("Login successful.");
        } catch (UserNameException u) {
            u.printStackTrace();
        } catch (PasswordException p) {
            p.printStackTrace();
        } finally {
            System.out.println("Finally block is executed.");
        }
        s.close();
    }
}

package class12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Store username, password and confirm password from a user and check following requirements:

        Username and Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
        Password should be minimum 8 characters, if less → message=”Password is too short”.
        Password cannot contain username if so, → message=”Password cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.

        Only after all requirements met → message “Your username and password has been created”
        You do not have permission to send messages in this channel.

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your username");
        String username=scan.next();
        System.out.println("Enter your password");
        String password=scan.next();
        System.out.println("Confirm your password");
        String confirmpassword=scan.next();

        if (username.isBlank() && password.isBlank()){
            System.out.println("Username or Password cannot be empty");
        } else if (password.length()<8) {
            System.out.println("Password is too short");
        } else if (password.contains(username)) {
            System.out.println("Password cannot contain username");
        } else if (!password.equals(confirmpassword)) {
            System.out.println("Passwords do not match");
        }else {
            System.out.println("Your username and password has been created");
        }


    }
}

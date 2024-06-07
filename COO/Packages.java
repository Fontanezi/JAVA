import java.util.Scanner;
// Using .* will import the whole package, not a single class from it.
public class Packages {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter username");

            String userName = myObj.nextLine();
            System.out.println("Username is: " + userName);

            // javac PackageName.java
            // javac -d . PackageName.java
        }
    }
}

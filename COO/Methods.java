public class Methods {
    static void myMethod() {
        System.out.println("I am a method!");
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access Denied!");
        } else {
            System.out.println("Welcome!");
        }
    }

    // Method overload 
    
    static int overload(int x) {
        x = 5;
        return x;
    }

    static double overload(double x) {
        x = 5;
        return x;
    }

    public static void main(String[] args) {
        myMethod();
        checkAge(18);
    }
}

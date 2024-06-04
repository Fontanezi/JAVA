public class Classes {
    int x = 5;

    // Static methods: Can be accessed without creating an object of the class.
    // Public methods: Can't be accessed without creating an object of the class.

    public static void main(String[] args) {
        Classes newclass = new Classes();
        Fileclass newclass2 = new Fileclass();
        System.out.println(newclass.x);
        System.out.println(newclass2.y);
    }
}

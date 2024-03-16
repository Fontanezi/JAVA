class Person {
    String name; /*
                  * Create a class using the keyword "class", and add your attributes and
                  * methods.
                  */
    int age;

    public void introduction() {
        System.out.println("Hello, my name is " + this.name + ", I am " + this.age + "years old.");
    }
}

class ClassAndObjects {
    public static void main(String[] args) {
        Person p1 = new Person(); // Create an object based on a class. Use this syntax. Different from C.
        Person p2 = new Person();
        p1.name = "João";
        p2.name = "Maria";
        p1.age = 19;
        p2.age = 19;
        p1.introduction();
        p2.introduction();
    }
}

// Static methods can be used without creating objects.
// Public methods need objects to work.

public class Inheritance {
    class Vehicle {
        protected String brand = "Ford"; // Vehicle attribute

        public void honk() { // Vehicle method
            System.out.println("Tuut, tuut!");
        }
    }

    class Car extends Vehicle {
        private String modelName = "Mustang"; // Car attribute
    }

    /*
     * Polymorphism is when you create multiple subclasses from one parent class.
     * Example: Pig, Dog, Horse from the Animal
     * superclass.
     */
}

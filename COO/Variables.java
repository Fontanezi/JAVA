public class Variables {
    public static void main(String[] args) {
        byte num3 = 1;
        short num5 = 2;
        int num1 = 3;
        float num2 = 2.3f;
        double num4 = 2.333333d;
        String name = "USP";
        char letter = 'A';
        boolean state = true;

        // final keyword works as "const"
        // NON-PRIMITIVE TYPES: Strings, Arrays, Classes, Interfaces

        int numtype = (short) 1;
        double numtype2 = 1;
        System.out.println(num1 + " Is an int.");
        System.out.println(num2 + " Is a float.");
        System.out.println(num3 + " Is a byte.");
        System.out.println(num4 + " Is a double.");
        System.out.println(num5 + " Is a short.");
        System.out.println(name + " Is an String.");
        System.out.println(letter + " Is an char.");
        System.out.println(state + " Is an boolean value.");
        System.out.println(numtype + " Is a lower cast short");
        System.out.println(numtype2 + " Is a upper cast double");
    }
}

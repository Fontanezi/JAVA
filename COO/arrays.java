class Arrays {
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5 }; // Declaring Arrays
        System.out.println(numbers[0]); // Printing array element
        numbers[0] = 5; // Changing array element
        System.out.println(numbers.length); // Printing array length

        int numbers2[][] = { { 1, 2, 3 }, { 4, 5, 6 } }; // Multidimensional array

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

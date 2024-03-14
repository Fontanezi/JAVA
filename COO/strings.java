class strings {
    public static void main(String[] args) {
        String greeting = "Hello!";
        // Strings are objects, so they have their own methods!

        System.out.println("The lenght of the string is: " + greeting.length());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.indexOf("o"));
        
        // + and concat() can be used to concatenete strings.
        // Backslashes can help us write special characters, like \', \", \\.
        // We also have \n, \r, \t, \b, \f.
    }
}

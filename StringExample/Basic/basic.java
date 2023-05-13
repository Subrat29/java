class Basics {

    public static void main(String s[] ) {

        // Method 1: By Pass character array and it convert into string
        char ch[] = { 'a', 'b', 'c', 'd' };
        String s1 = new String(ch);
        System.out.println(s1);

        // Method 2: By Pass string
        String s2 = new String("apple");
        System.out.println(s2);

        // Method 3: Direct
        String s3 = "Orange";
        System.out.println(s3);



        // Operations on string

        // concatenation:
        System.out.println(s1 + s2);

        // some imp thing

        // 1
        System.out.println("Iet" + 3 + 6 + (3 + 8));
        System.out.println("My Result = " + 3 + (5*3));

        // 2
        class Alfa {
            // int data = 0;
        }
        Alfa obj = new Alfa();
        System.out.println(obj);

        

        // Predefined methods of string class
        String s4 = "ABCDE";
        System.out.println(s4.charAt(0));
        System.out.println(s4.charAt(4));
        // System.out.println(s4.charAt(5));     Output: Error

        // length() -> function
        for (int i = 0; i < s4.length(); i++) {
            System.out.println(s4.charAt(0));
        }


        // length -> 
        //Print array of string by commmand arguments
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        //Input: java Basics one two three four five

        //Print only first char of string
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].charAt(0));
        }

    }

    // may be vs code error show kre but ye bilkul theek h, run through terminal
}

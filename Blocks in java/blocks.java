//link: https://www.scientecheasy.com/2020/06/instance-block-in-java.html/#:~:text=What%20is%20Block%20in%20Java,of%20one%20or%20more%20statements.

class blocks {

    static void methodwithInnerblock() { // Outer block starts here with opening braces.

        int x = 20;
        System.out.println("Outer block start me");
        System.out.println(x);

        { // Inner or local block starts here with next opening braces.

            x = 30;
            System.out.println("Inner block 1");
            System.out.println(x);

        } // Inner block ends here.

        {
            x = 4;
            System.out.println("Inner block 2");
            System.out.println(x);

        }

        System.out.println("Outer block end me");
        System.out.println(x);

    } // Outer block ends here.

    public static void main(String[] args) {

        // Method1 : call fn by creating obj
        // blocks b = new blocks();
        // b.methodwithInnerblock();

        // Method2: call by add static fn ke aage
        methodwithInnerblock();

    }
}


class Test {

    // Declare Zero parameter constructor.
    Test() {
        System.out.println("2) Then Constructor chlta h");
    }

    // Declaration of an Instance block.
    {
        System.out.println("1) Phle Block Chlta h ");
    }

    public static void main(String[] args) {

        // First approach: Create the object of the class.
        // Test t = new Test(); // named object because object contains reference variable.

        // Second approach:
        new Test(); // nameless object. It is frequently used to reduce the length of the code.
    }
}
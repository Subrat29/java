public class t1 {
    public static void main(String s[]) {
        try {
            System.out.println("To see demo:");
            System.out.println("Write on command line :");
            System.out.println("java Ex5 show\n");

            if (s[0].equals("show")) {
                System.out.println("Creating and throwing object");
                System.out.println("of Arithmetic Exception Class\n");

                throw new ArithmeticException();
            }
        }

        catch (ArithmeticException e) {
            System.out.println("Object is received");
            System.out.println("in catch block\n");
        }

        finally {
            System.out.println("Finally block");
        }

    }
}

//what i conclude: agr exception nhi h to bhi throw se hm exception bhej skte h catch ko

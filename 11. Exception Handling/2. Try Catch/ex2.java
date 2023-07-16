public class ex2 {
    public static void main(String s[]) {

        try {
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = a / b;
            System.out.println(c);
        }

        catch (ArithmeticException e) {
            System.out.println("THis exception occurs bc any number divide zero then g phaad\n");
            System.out.println(e);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index h ka\n");
            System.out.println(e);
        }

        catch (Exception e) {
            System.out.println("Something else babe");
        }

        finally{
            System.out.println("Aree hack hago system band kro reeeeee");
        }
    }
}

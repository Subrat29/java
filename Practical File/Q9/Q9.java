//own exception class
class AgeException extends Exception {
    public String toString() {
        return "Above age exception";
    }
}

class Employee extends AgeException {
    String name;
    int age;

    public static void main(String[] args) {

        Employee e = new Employee();
        e.name = args[0];
        e.age = Integer.parseInt(args[1]);

        try {
            if (e.age > 60) {
                throw new AgeException();
            }

        } catch (AgeException ae) {
            System.out.println(ae);
        } finally {
            System.out.println("Name : " + e.name);
            System.out.println("Age : " + e.age);
        }
    }
}
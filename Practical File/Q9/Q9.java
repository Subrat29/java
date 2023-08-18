class AgeException {
}

class Employee extends AgeException {

    String name;
    int age;

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = args[0];
        e.age = Integer.parseInt(args[1]);

        System.out.println("Name : " + e.name);
        System.out.println("Age : " + e.age);
    }
}
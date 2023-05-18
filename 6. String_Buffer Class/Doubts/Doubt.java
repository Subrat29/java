package Doubts;
// Doubts : i create a string buffer object with capacity and now i want to insert some data in string buffer then how can i do this? This is my code:
// Soln : use append(); predefined method


class doubts {

    public static void main(String[] args) {

        StringBuffer obj = new StringBuffer(5);

        System.out.println("obj line 10 : " + obj);
        System.out.println("Length : " + obj.length() + "  Capacity : " + obj.capacity());

        obj.append("Hello World");
        
        System.out.println("\nobj line 17 : " + obj);
        System.out.println("Length : " + obj.length() + "  Capacity : " + obj.capacity());

        System.out.println(obj.toString()); // Output: Hello World
    }
}

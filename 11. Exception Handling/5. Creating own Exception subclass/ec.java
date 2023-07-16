// class MyExp extends Throwable {  -> give error resolve if use (Throwable e)

class MyExp extends Exception {
    public String toString() {
        return "Nabaalik";
    }
}

public class ec {

    void vote(int Age, String Name) {
        try {
            if (Age > 18) {
                System.out.println("Try block");
                System.out.print("Baalik\n");
            } else {
                throw new MyExp();
            }
        } catch (Exception e) {
            System.out.println("Catch block");
            System.out.println(e);
        }

        finally {
            System.out.println("\nFinally block");
            System.out.println("Name : " + Name + "\nAge : " + Age);
        }
    }

    public static void main(String[] s) {

        String Name = s[0];
        int Age = Integer.parseInt(s[1]);

        ec obj = new ec();
        obj.vote(Age, Name);
    }

}

// class MyExp extends Exception {
//     int agg;

//     MyExp(int ag) {
//         agg = ag;
//     }

//     public String toString() {
//         return "Underage Exp:" + agg;
//     }
// }

// class Ex5 {
//     void vote(int a) {

//         try {
//             if (a > 17)
//                 System.out.println("vote successfully");
//             else
//                 throw (new MyExp(a));
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }

//     public static void main(String s[]) {
//         Ex5 obj = new Ex5();
//         String name = s[0];
//         int age = Integer.parseInt(s[1]);
//         obj.vote(age);
//         System.out.println(name + ":" + age);
//     }

// }

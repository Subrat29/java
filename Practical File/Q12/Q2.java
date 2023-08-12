public class Q2 {

    void isPresent(String s, int flag) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                flag++;
            }
        }

        if (flag == 0) {
            System.out.println("a is not present in string");
        } else {
            System.out.println("a is present " + flag + " times in string");
        }
    }

    public static void main(String[] args) {
        Q2 q = new Q2();

        String s = args[0];
        int flag = 0;
        q.isPresent(s, flag);

    }
}

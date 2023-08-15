public class Q3 {
    String deleteVowels(String s) {

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                s = s.substring(0, i) + s.substring(i + 1);
                i--;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Q3 q = new Q3();

        String s = "Hello, have a good day";
        System.out.println(q.deleteVowels(s));

    }
}

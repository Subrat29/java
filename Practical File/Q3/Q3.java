public class Q3 {
    String deleteVowels(String s) {
        // String modify;
        int indextoRemove;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                indextoRemove = i;
                String modify = s.substring(0, indextoRemove) + s.substring(indextoRemove + 1);

                System.out.println(modify);

            }
        }
        return modify;
    }

    public static void main(String[] args) {
        Q3 q = new Q3();

        String s = "Hello, have a good day";
        System.out.println(q.deleteVowels(s));

    }
}

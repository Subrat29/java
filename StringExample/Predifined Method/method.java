class PredefineFunction {

    public static void main(String[] args) {

        String s1 = new String("Banana");
        String s2 = "Orange";

        // 1) charAt()
        System.out.println("charAt(): " + s1.charAt(0));

        // 2) length()
        System.out.println("length(): " + s1.length());

        // 3) getchars()
        char ch[] = new char[10];
        s2.getChars(1, 4, ch, 4);

        System.out.println("getChars(): ");
        for (int i = 0; i < ch.length; i++)
            System.out.print(ch[i]+ "_");

    }
}
class PredefinedMethod {

    public static void main(String[] args) {

        String s1 = new String("Banana");
        String s2 = "Orange";

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
    

        // 1) charAt()
        System.out.println("\ncharAt(): " + s1.charAt(0));


        // 2) length()
        System.out.println("\nlength(): " + s1.length());


        // 3) getchars()
        char ch[] = new char[10];
        s2.getChars(1, 4, ch, 4);


        System.out.println("\ngetChars(): ");
        System.out.println(s2);
        for (int i = 0; i < ch.length; i++)
            System.out.println(ch[i] + "_");


        // 4) equals();
        String s3 = "IET";
        boolean ans = s3.equals("iet");
        System.out.println("IET == iet : " + ans);


        // 5) equalsIgnoreCase();
        ans = s3.equalsIgnoreCase("iet");
        System.out.println("IET == iet : " + ans);

        
        // 6) by relational operators
        String s4 = "One";
        String s5 = "One";
        System.out.println("s4 == s5 : " + (s4 == s5));

        String s6 = new String("One");
        System.out.println("s5 == s6 : " + (s5 == s6));


        // 7) startsWith();
        String s7 = "My name is soumya";
        boolean x = s7.startsWith("My na");
        System.out.println("startswith() : "+x);

        // 8) endWith();
        System.out.println("endwith() : "+s7.endsWith("ya"));


        //9) toUppercase()
        System.out.println("anku".toUpperCase());


        //10) toLowercase();
        System.out.println("ANki".toLowerCase());

//------------------------------------------------------------------------------------------------------------------------------------------------------

    //These methods are modifying methods because it creates a new copy of that object

        //11) trim();
        String s8 = "    it not eliminate middle space    ";
        s8 = s8.trim();
        System.out.println("Trim : "+s8);


        //12) substring();
        String s9 = "ABCDE";
        s9 = s9.substring(3);
        System.out.println("Substring(int) : "+s9);


        //13) substring(int, int);
        String s10 = "ABCDEFGHIK";
        s10 = s10.substring(2, 6);
        System.out.println("Substring(int, int) : "+ s10);
  

        //14) concat(string);
        String s11 = "ABCDE";
        s11 = s11.concat("heybro");
        System.out.println("Concatenation : "+s11);


        
    }
}
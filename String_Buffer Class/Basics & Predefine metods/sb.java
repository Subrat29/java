class Sb
{

public static void main(String[] args) {
    
    StringBuffer s1 = new StringBuffer("\nHello subrat  ");
    System.out.println(s1);

    //Methods of string buffer class

    //1) length(); -> remember that it count spaces also
    int l = s1.length();
    System.out.println("Length : " + l);


    //2) capacity();
    int c = s1.capacity();
    System.out.println("Capacity : " + c);


    //3) ensureCapacity();
    StringBuffer obj = new StringBuffer("Abcdef");
    System.out.println("\nLength : " + obj.length() + "  Capacity : " + obj.capacity());

    obj.ensureCapacity(20);
    System.out.println("ensureCapacity = 20\n" + "Length : " + obj.length() + "  Capacity : " + obj.capacity());

    obj.ensureCapacity(30);
    System.out.println("ensureCapacity = 30\n" + "Length : " + obj.length() + "  Capacity : " + obj.capacity());


    //4) setlength();
    StringBuffer obj1 = new StringBuffer("ABCDE");
    System.out.println("\nBefore setLength \nLength : " + obj1.length());

    obj1.setLength(7);
    System.out.println("After setLength = 7 \nLength : " + obj1.length());


    //5) charAt();
    StringBuffer sb1 = new StringBuffer("ABCDE");
    System.out.println("\n" + sb1.charAt(3));


    //6) setCharAt(int , char);
    sb1.setCharAt(3, 'r');
    System.out.println(sb1);


    //7) getChars(int, int, ch[], int);
    char ch[] = new char[10];
    sb1.getChars(0, 4, ch, 5);
    System.out.println(ch);

    for(int i=0; i<ch.length; i++)
    {
        System.out.print(ch[i] + ":");
    }


    //8) delete(char)
    System.out.println("\n\nBefore delete : " + sb1);
    sb1.deleteCharAt(3);
    System.out.println("After delete : " + sb1);


    //9) delete(int, int)
    System.out.println("\nBefore delete : " + sb1);
    sb1.delete(0,2);
    System.out.println("After delete : " + sb1);


    //10) append()
    StringBuffer sb2 = new StringBuffer("ABCDE");

    //append(string)
    System.out.println("\nBefore append : " + sb2);
    sb2.append("AddSomething");
    System.out.println("After append : " + sb2);

    //append(int)
    System.out.println("\nBefore append : " + sb2);
    sb2.append(123);
    System.out.println("After append : " + sb2);

    //append(obj)
    System.out.println("\nBefore append : " + sb2);
    sb2.append(sb1);
    System.out.println("After append : " + sb2);


    //11) insert();
    StringBuffer sb3 = new StringBuffer("Subrat");

    //insert(int , string);
    System.out.println("\nBefore insert : " + sb3);
    sb3.insert(2, "STRING");
    System.out.println("After insert : " + sb3);

    //insert(int , char);
    System.out.println("\nBefore insert : " + sb3);
    sb3.insert(1, 'b');
    System.out.println("After insert : " + sb3);

    //insert(int , obj);
    System.out.println("\nBefore insert : " + sb3);
    sb3.insert(4, "OBJ");
    System.out.println("After insert : " + sb3);


    //12) reverse();
    StringBuffer sb4 = new StringBuffer("Subrat");

    System.out.println("\nBefore reverse : " + sb4);
    System.out.println("After reverse : " + sb4.reverse());


    //13) substring();
    System.out.println("\nSubstring : " + sb4.substring(2, 5));


    //14) replace();
    StringBuffer sb5 = new StringBuffer("Subrat");

    System.out.println("\nBefore replace : " + sb5);
    sb5.replace(2, 4, "lol");
    System.out.println("After reverse : " + sb5);











}
}
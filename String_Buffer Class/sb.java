class Sb
{

public static void main(String[] args) {
    
    StringBuffer s1 = new StringBuffer("Hello subrat  ");
    System.out.println(s1);

    //Methods of string buffer class

    //1) length(); -> remember that it count spaces also
    int l = s1.length();
    System.out.println("Length : " + l);


    //2) capacity();
    int c = s1.capacity();
    System.out.println("Capacity : " + c);



}
}
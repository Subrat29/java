class Parent
{
    int data;
    
    //constructor
    Parent()
    {
        data = 22;
        System.out.println("Default constructor of Parent");
    }

    void show()
    {
        System.out.println("Data : " + data);
    }
}

class child extends Parent
{
    child()
    {
        System.out.println("Default constructor of child");
    }

    public static void main(String[] args) {
        child c = new child();
        c.show();
    }
}
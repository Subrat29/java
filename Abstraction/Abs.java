abstract class Alfa
{
    abstract void show();

    void display()
    {
        System.out.println("Alfa Display");
    }
}

class beta extends Alfa
{
    //The type beta must implement the inherited abstract method Alfa.show()
    void show()
    {
        System.out.println("Show");
    }
}

class Main
{
    public static void main(String[] args) {
        beta obj = new beta();
        obj.show();
        obj.display();

        //Cannot instantiate the type Alfa or no obj creation in abstract class
        // Alfa a = new Alfa();

    }
}

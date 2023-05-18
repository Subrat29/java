interface Alpha {
    int x = 5;

    void show();
}

class Beta implements Alpha {

    public void show() {
        System.out.println("Alfa Interface ka show fn");
    }

    void dispalyInt()
    {
        // The final field Alpha.x cannot be assigned
        // x = 4;

        System.out.println(x);
    }
}

class Main
{
    public static void main(String[] args) {
        
        Beta b = new Beta();
        b.show();

        b.dispalyInt();

        // Alpha is abstract; cannot be instantiated
        // Alpha ref = new Alpha();

        // But reference can
        Alpha ref;
        ref = b;
        ref.show();
    }
}

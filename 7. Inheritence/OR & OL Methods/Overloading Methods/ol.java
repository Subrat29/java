class Ol {

    void show() {
        System.out.println("1st definition");
    }

    void show(int p) {
        System.out.println("2nd definition");
    }

    public static void main(String[] args) {

        Ol obj = new Ol();
        obj.show();
        obj.show(0);

    }
}
// import iet.*;
//Above is not working on user defined package but work on java package
import iet.Alpha;
import iet.Beta;

public class P
{
    public static void main(String[] args) {
        Alpha a = new Alpha();
        a.show();

        Beta b = new Beta();
        b.show();
    }
} 


// javac -d . Alpha.java Beta.java P.java

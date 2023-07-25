package mypack;

import pack.*;
import pack.Alpha;

class M extends Alpha {
    public static void main(String args[]) {
        M obj = new M();
        obj.show();

        // error: show() has protected access in Alpha a.show();
        // Alpha a = new Alpha();
        // a.show();
    }
}


// javac -d . Alpha.java M.java
// java mypack.M
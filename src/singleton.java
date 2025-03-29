class ABC {
    private static ABC obj = null; // Singleton instance

    private ABC() {} // Private constructor to prevent instantiation

    public static ABC getInstance() { // Corrected method signature
        if (obj == null)
            obj = new ABC();
        return obj;
    }

    void display() {
        System.out.println("I am display");
    }
}

public class singleton {
    public static void main(String args[]) {
        ABC o = ABC.getInstance(); // Corrected object creation here it only one time to create the object 
        o.display();
    }
}

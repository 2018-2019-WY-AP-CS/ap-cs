import junit.runner.Version;
        
public class Adder
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Adder
     */
    public Adder(int x)
    {
        this.x = x;
    }

    public int add(int y) {
        return x+y;
    }
    public static void junit()
    {
        System.out.println("JUnit version is: " + Version.id());    
    }
}

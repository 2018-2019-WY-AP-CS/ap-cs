
/**
 * Tests the <code>ZenoAdder</code>.
 */
public class ZenoAdderRunner
{
    public static void main(String[] args)
    {
        ZenoAdder a = new ZenoAdder(5.2);
        a.hut();
        System.out.println(a.report());  // 5.2 + 1/1 = 6.2
        a.hut();
        System.out.println(a.report());  // 6.2 + 1/2 = 6.7
        a.hut();
        a.hut();
        System.out.println(a.report());  // 6.7 + 1/3 + 1/4 = 7.28333...
    }   
}

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddTester
{
    
    Adder a;
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        a = new Adder(3);
    }

    @Test 
    public void test_add() 
    {
        assertEquals(8, a.add(5));
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test_automatic()
    {
        Adder adder1 = new Adder(7);
        assertEquals(14, adder1.add(7));
        assertEquals(20, adder1.add(13));
    }
}


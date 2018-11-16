import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.Color;

/**
 * This class runs a world that contains DashBugs.
 */
public class DashBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        int steps = 4;
        int cycle = 3;
        
        // Does not compile because the class is not written yet
        Bug c = new DashBug(steps, cycle);
        Bug d = new DashBug();
        
        world.add(new Location(10,3), c);
        world.add(new Location(10,4), d);

        world.show();
    }
}

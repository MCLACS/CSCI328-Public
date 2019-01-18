import java.util.*;
import edu.mcla.cs.rooms.*;

public class Main
{
    public static void main(String[] args)
    {
        Main m = new Main();
        m.go();
    }
    
    public void go()
    {
        IRoom r1 = new Library();
        IRoom r2 = new Store();
        IRoom r3 = new Prison();
        r1.setWest(r2);
        r2.setEast(r1);
        r2.setNorth(r3);
        r3.setSouth(r2);
        
        IRoom room = r1;
        Scanner in = new Scanner(System.in);
        while (true)
        {
            System.out.println(room.description());
            System.out.println("What direction do you want to travel? (n, s, e, w)");
            String dir = in.nextLine();
            if (dir.equalsIgnoreCase("n") && room.north() != null)
                room = room.north();
            else if (dir.equalsIgnoreCase("s") && room.south() != null)
                room = room.south();
            else if (dir.equalsIgnoreCase("e") && room.east() != null)
                room = room.east();
            else if (dir.equalsIgnoreCase("w") && room.west() != null)
                room = room.west();
        }    
    }
}
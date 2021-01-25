import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Main m = new Main();
        m.go();
    }
    
    private void go()
    {
        List<Stadium> parks = new ArrayList<Stadium>();
        
        parks.add(new Stadium("PNC Park", "Pittsburgh", 38362));
        parks.add(new Stadium("Citizens Bank Park", "Philadelphia", 43035));
        parks.add(new Stadium("Coors Field", "Denver", 50398));
        parks.add(new Stadium("AT&T Park", "San Francisco", 41915));
        parks.add(new Stadium("Citi Field", "New York", 41922));
        
        Collections.sort(parks, Stadium.ByName.getInstance());
        System.out.println(parks);

        Collections.sort(parks, Stadium.ByCapacity.getInstance());
        System.out.println(parks);

    }
}
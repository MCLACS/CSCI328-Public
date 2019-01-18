package edu.mcla.cs.rooms;

public class Prison extends AbstractRoom
{
    public Prison()
    {
        super();
    }

    @Override
    public String description()
    {
        return
        "You enter a dark and dirty prison.  All around you see prison cells " + 
        "and there is a strong smell of death and decay.  " + 
        nearbyRooms();
    }
}
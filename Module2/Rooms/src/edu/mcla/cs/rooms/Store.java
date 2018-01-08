package edu.mcla.cs.rooms;

public class Store extends AbstractRoom
{
    public Store()
    {
        super();
    }

    @Override
    public String description()
    {
        return
        "You enter a noisy store packed with odd magical items.  " +
        nearbyRooms();
    }
}
package edu.mcla.cs.rooms;

public class Library extends AbstractRoom
{
    public Library()
    {
        super();
    }

    @Override
    public String description()
    {
        return
        "You enter a well lit library.  There are hundreds of books on " + 
        "the shelves and classical music playing in the background.  " +
        nearbyRooms();
    }
}
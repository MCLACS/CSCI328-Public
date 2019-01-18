package edu.mcla.cs.rooms;

public interface IRoom
{
    public IRoom north();
    public IRoom south();
    public IRoom east();
    public IRoom west();
    public void setNorth(IRoom r); 
    public void setSouth(IRoom r); 
    public void setEast(IRoom r);
    public void setWest(IRoom r);
    public String nearbyRooms();
    public String description();     
}
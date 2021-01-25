package edu.mcla.cs.rooms;

public abstract class AbstractRoom implements IRoom
{
    private IRoom m_north;
    private IRoom m_south;
    private IRoom m_east;
    private IRoom m_west;
    
    public AbstractRoom() {}
    public IRoom north() { return m_north; }
    public IRoom south()  { return m_south; }
    public IRoom east()  { return m_east; }
    public IRoom west()  { return m_west; }
    
    public void setNorth(IRoom r) 
    { m_north = r;}
    
    public void setSouth(IRoom r) 
    { m_south = r;}
    
    public void setEast(IRoom r) 
    { m_east = r;}
    
    public void setWest(IRoom r) 
    { m_west = r;}
    
    public String nearbyRooms()
    {
        if (m_north == null && m_south == null && 
            m_east == null && m_west == null)
        {
            return "There is no way out!";            
        }
        else
        {
            String ret = "You see doors in the following direction(s): %s%s%s%s";
            return String.format(ret, 
                m_north != null ? " north" : "", 
                m_south != null ? " south" : "", 
                m_east != null ? " east" : "", 
                m_west != null ? " west" : "");
        }
    }
    
    public abstract String description();     
}
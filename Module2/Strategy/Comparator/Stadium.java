import java.util.*;

public class Stadium
{
    private String m_name;
    private String m_city;
    private int m_capacity;
    
    public Stadium(String name, String city, int capacity)
    {
        m_name = name;
        m_city = city;
        m_capacity = capacity;
    }
    
    public String getName()
    { return m_name; }
    
    public String getCity()
    { return m_city; }
    
    public int getCapacity()
    { return m_capacity; }
    
    @Override
    public String toString()
    { return String.format("%s located in %s (%s)", getName(), getCity(), getCapacity()); }
    
    static class ByName implements Comparator<Stadium>
    {
        private static ByName m_instance;
        public static ByName getInstance()
        { 
            if (m_instance == null)
                m_instance = new ByName();
            return m_instance;
        }
        private ByName() {}
        
        @Override
        public int compare(Stadium s1, Stadium s2)
        { return s1.getName().compareTo(s2.getName()); }
    }
    
    static class ByCapacity implements Comparator<Stadium>
    {
        private static ByCapacity m_instance;
        public static ByCapacity getInstance()
        { 
            if (m_instance == null)
                m_instance = new ByCapacity();
            return m_instance;
        }
        private ByCapacity() {}
        
        @Override
        public int compare(Stadium s1, Stadium s2)
        { 
            if (s1.getCapacity() > s2.getCapacity())
                return 1;
            else if (s1.getCapacity() < s2.getCapacity())
                return -1;
            else 
                return 0;
        }
    }    
    
}
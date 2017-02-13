
import java.util.*;

public class RandomSingleton
{
    // ---------------------------------------------
    // These three things are always required when
    // creating a singleton:
    // ---------------------------------------------
    private static RandomSingleton m_instance;
    public static RandomSingleton getInstance()
    {
        if (m_instance == null)
            m_instance = new RandomSingleton();
        return m_instance;
    }
    private RandomSingleton() {};
    // ---------------------------------------------
    
    private Random m_rand = new Random();
    
    public Random getRand()
    { return m_rand; }
}
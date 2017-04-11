import java.io.*;
import java.util.*;
public class MessageFactory
{
    private static MessageFactory m_instance;
    public static MessageFactory getInstance()
    {
        if (m_instance == null)
            m_instance = new MessageFactory();
        return m_instance;
    }
    
    public IMessage createMessage()
    {   
        IMessage m = null;
        try 
        {
            String name = "";
            Scanner f = new Scanner(new File("Behavior.txt"));
            if (f.hasNextLine())
                name = f.nextLine().trim();
                
            Class c = Class.forName(name);  
            m = (IMessage) c.newInstance();  
        }
        catch (Exception e)
        {
            throw new Error("Unable to create Message instance");
        }
        return m;
    }
}
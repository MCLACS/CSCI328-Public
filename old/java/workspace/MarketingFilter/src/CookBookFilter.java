import java.util.ArrayList;
import java.util.List;


public class CookBookFilter implements IMarketFilter
{
    private char[] m_v = {'a', 'e', 'i', 'o', 'u'};
    
    @Override
    public List<Person> filter(List<Person> people)
    {
        List<Person> l = new ArrayList<Person>();
        for (Person p : people)
        {
            double total = 0;
            String full = p.getFirst() + p.getLast();
            for (char c : full.toCharArray())
            {
                for (char v : m_v)
                {
                    if (c == v)
                    {
                        total++;
                        break;
                    }
                }
            }
            
            if (total >= 7)
            {
                l.add(p);
            }
        }
        
        return l;    
    }

}

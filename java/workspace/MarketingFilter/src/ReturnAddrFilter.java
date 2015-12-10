import java.util.ArrayList;
import java.util.List;


public class ReturnAddrFilter implements IMarketFilter
{

    @Override
    public List<Person> filter(List<Person> people)
    {
        List<Person> l = new ArrayList<Person>();
        for (Person p : people)
        {
            if (p.getFirst().length() + p.getLast().length() >= 18)
            {
                l.add(p);
            }
        }
        return l;
    }

}

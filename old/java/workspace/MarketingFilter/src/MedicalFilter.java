import java.util.ArrayList;
import java.util.List;


public class MedicalFilter implements IMarketFilter
{

    @Override
    public List<Person> filter(List<Person> people)
    {
        double total = 0;
        double ave = 0;
        for (Person p : people)
        {
            total += p.getAge();
        }
        ave = total / people.size();

        List<Person> l = new ArrayList<Person>();
        for (Person p : people)
        {
            if (p.getAge() >= ave+30)
            {
                l.add(p);
            }
        }
        
        return l;
    }

}

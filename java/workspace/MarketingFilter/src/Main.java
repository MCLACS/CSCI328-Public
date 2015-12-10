import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    private List<Person> m_people = new ArrayList<Person>();
    
    public static void main(String[] args) throws IOException
    {
        Main m = new Main();
        m.go();
    }

    public void go() throws IOException
    {
        readPeople("names.txt");
        
        IMarketFilter report = new MedicalFilter();
        List<Person> l = report.filter(m_people);
        System.out.println(l.size());
        
        report = new CookBookFilter();
        l = report.filter(m_people);
        System.out.println(l.size());

        report = new ReturnAddrFilter();
        l = report.filter(m_people);
        System.out.println(l.size());
    }

    public void readPeople(String filename) throws IOException
    {
        BufferedReader in = null;
        try
        {
            in = new BufferedReader(new FileReader(filename));
            String line = in.readLine();
            while (line != null)
            {
                String tokens[] = line.split(",");
                if (tokens.length == 4)
                {
                    Person Person = 
                            new Person(tokens[0].trim(), tokens[1].trim(), 
                                    tokens[2].trim(), Integer.parseInt(tokens[3].trim()));
                    m_people.add(Person);
                }
                line = in.readLine();
            }
        }
        finally
        {
            if (in != null)
                in.close();
        }
    }    
}

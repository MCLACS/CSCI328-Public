import java.util.ArrayList;
import java.util.List;

public class CompositeAlg implements IStatAlg
{
    private List<IStatAlg> m_algorithms = new ArrayList<IStatAlg>();
    
    @Override
    public List<Double> process(List<Double> data)
    {
        for (IStatAlg alg : m_algorithms)
        {
            data = alg.process(data);
        }
        return data;
    }
    
    public void addAlg(IStatAlg alg)
    {
        m_algorithms.add(alg);
    }

}

package edu.mcla.cs.statalg;

import java.util.ArrayList;
import java.util.List;

public class MultiplyByTwo implements IStatAlg
{

    @Override
    public List<Double> process(List<Double> data)
    {
        List<Double> list = new ArrayList<Double>();
        for (double d : data)
        {
            list.add(d*2);
        }
        return list;
    }

}

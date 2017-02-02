package edu.mcla.cs.statalg;

import java.util.Arrays;
import java.util.List;

public class Test
{

    public static void main(String[] args)
    {
        Test tester = new Test();
        tester.test();
    }

    public void test()
    {
       Double[] ary = {new Double(10), new Double(15), new Double(20)};
       List<Double> l = Arrays.asList(ary);
       
       Average a = new Average();
       assert(a.process(l).get(0) == 15);
       
       Sum s = new Sum();
       assert(s.process(l).get(0) == 45);
       
       MultiplyByTwo m = new MultiplyByTwo();
       assert(m.process(l).get(0) == 20);
       assert(m.process(l).get(1) == 30);
       assert(m.process(l).get(2) == 40);
       
       CompositeAlg c = new CompositeAlg();
       c.addAlg(m);
       c.addAlg(a);
       assert(c.process(l).get(0) == 30);
    }
}

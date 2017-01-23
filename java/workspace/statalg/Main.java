import java.util.Arrays;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        Main tester = new Main();
        tester.test();
    }

    public void test()
    {
       Double[] ary = {new Double(10), new Double(15), new Double(20)};
       List<Double> l = Arrays.asList(ary);

       Average a = new Average();
       System.out.println(a.process(l).get(0)); // should be 15;

       Sum s = new Sum();
       System.out.println(s.process(l).get(0)); // should be 45

       MultiplyByTwo m = new MultiplyByTwo();
       System.out.println(m.process(l).get(0)); // should be 20
       System.out.println(m.process(l).get(1)); // should be 30
       System.out.println(m.process(l).get(2)); // should be 40

       CompositeAlg c = new CompositeAlg();
       c.addAlg(m);
       c.addAlg(a);
       System.out.println(c.process(l).get(0)); // should be 30
    }
}

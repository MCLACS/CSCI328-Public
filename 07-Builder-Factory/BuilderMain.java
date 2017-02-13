public class BuilderMain
{
    public static void main(String[] args)
    {
    	IBuilder builder1 = new Builder1();
    	builder1.makePotatoHead().draw();
    	    	
    	IBuilder builder2 = new Builder2();
    	builder2.makePotatoHead().draw();
    }
}

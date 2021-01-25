public class Main
{
    public static void main(String[] args)
    {
        IBodyPartFactory factory = new SadHeadFactory();
        MrPotatoHead fred = new MrPotatoHead(22, 12, 
                factory.createHead(),
                factory.createEyes(), 
                factory.createNose(), 
                factory.createMouth());
        fred.draw();
        
    	IBuilder builder1 = new Builder1();
    	builder1.makePotatoHead().draw();
    	    	
    	IBuilder builder2 = new Builder2();
    	builder2.makePotatoHead().draw();
    }
}

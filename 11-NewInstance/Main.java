public class Main
{
    public static void main(String args[])
    {
        new Main().go();
    }
    
    public void go()
    {
        IMessage m = MessageFactory.getInstance().createMessage();
        m.saySomething();
    }
}

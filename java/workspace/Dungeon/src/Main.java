
public class Main
{

	public static void main(String[] args)
	{
		System.out.println("Welcome to the Dungeon!");

		IGameObject dungeon = Builder.getInstance().createDungeon();
		enterRoom(dungeon);
	}

	public static void enterRoom(IGameObject room)
	{
		room.getDescription();	
	}
}

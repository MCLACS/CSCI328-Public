
public class Main 
{

	public static void main(String[] args) 
	{
		ToDoList list = new ToDoList();
		list.addHighPriorityItem("Eat");
		list.addHighPriorityItem("Sleep");
		list.addHighPriorityItem("Drink");

		list.addMedPriorityItem("Homework");
		list.addMedPriorityItem("Shower");
		list.addMedPriorityItem("Goto Class");
		
		list.addLowPriorityItem("Play Games");
		list.addLowPriorityItem("Read");
		list.addLowPriorityItem("Watch TV");
	
		System.out.println(list);
	}
	

}

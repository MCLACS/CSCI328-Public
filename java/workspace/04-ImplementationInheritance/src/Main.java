
public class Main 
{
	public static void main(String[] args)
	{
		Person p1 = new Person();
		System.out.println(p1);

		Person p2 = new Person("Tim", "Smith");
		System.out.println(p2);

		Student s1 = new Student();
		System.out.println(s1);

		Student s2 = new Student("Sally", "Jones", "A1234567");
		System.out.println(s2);
	}

}

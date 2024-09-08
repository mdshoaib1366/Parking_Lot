package sat_April.ques1;

public class User extends Person{

	public User(String name) {
		super(name);
		
	}

	public void createPost(String name)
	{
			System.out.println(super.getName()+" created a post: "+name);
	}
	
	
}

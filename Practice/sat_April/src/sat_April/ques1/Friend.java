package sat_April.ques1;

public class Friend extends Person{

	public Friend(String name) {
		super(name);
		
	}

	public void sendMessage(User user)
	{
		System.out.println(user.getName()+" sent a message to "+super.getName()+": Hi, Alice! How are you?");
	}
}

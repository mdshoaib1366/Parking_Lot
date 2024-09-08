package sat_April.ques1;

public class SocialNetwork {

	public static void main(String[] args) {
		User user1 = new User("David");
		Friend f = new Friend("Charlie");
		
		user1.createPost("hello world!");
		User user2 = new User("bob");
		user2.createPost("Java programming is fun!");
		f.sendMessage(user1);
		

	}

}

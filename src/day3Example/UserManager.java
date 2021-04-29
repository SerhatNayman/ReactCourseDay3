package day3Example;

public class UserManager {
	
	
	public void add(User user)
	{
		System.out.println(user.id + " Kaydedildi.");
		System.out.println(user.firstName + " Kaydedildi.");
		System.out.println(user.lastName + " Kaydedildi.");
		System.out.println(user.email + " Kaydedildi.");
		
	}
	
	public void user(User[] users)
	{
		
		for (User user : users) {
			add(user);
		}
	}
	

}

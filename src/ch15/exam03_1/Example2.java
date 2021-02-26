package ch15.exam03_1;

import java.util.HashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		
		Set<User> set = new HashSet<>();
		
		User user1 = new User("Winter","한겨울");
		User user2 = new User("Winter","한겨울");
		set.add(user1);
		set.add(user2);
		System.out.println(user1.hashCode() == user2.hashCode());	//재정의
		System.out.println(user1.equals(user2));					//재정의
		System.out.println(set.size());

	}

}

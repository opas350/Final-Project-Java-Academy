package com.opas350.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserStub {

	private static Map<Long, User> usersl = new HashMap<Long, User >();
	private static Long idIndex = 3L;
	
	// Initial Hobbies
	static {
		User user1 = new User(1L, "opas350", "hobby1", "hobby2", "hobby3", "hobby4", "hello!");
		usersl.put(1L, user1);
		User user2 = new User(2L, "user2", "hobby1-2", "hobby2-2", "hobby3-2", "hobby4-2", "hello!-2");
		usersl.put(2L, user2);
		User user3 = new User(3L, "user3", "hobby1-3", "hobby2-3", "hobby3-3", "hobby4-3", "hello!-3");
		usersl.put(3L, user3);
	}
	
	public static List<User> list() {
		return new ArrayList<User>(usersl.values());
	}
	
	public static User create(User user) {
		idIndex += idIndex;
		user.setId(idIndex);
		usersl.put(idIndex, user);
		return user;
	}
	
	public static User get(Long id) {
		return usersl.get(id);
	}
	
	public static User update(Long id, User user) {
		usersl.put(id, user);
		return user;
	}
	
	public static User delete(Long id) {
		return usersl.remove(id);
	}
}

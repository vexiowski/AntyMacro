package net.vexio.antymacro.managers;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
	public static List<User> users = new ArrayList<>();

	public static void addUser(User u) {
		users.add(u);
	}

	public static void removeUser(User u) {
		users.remove(u);
	}

	public static User getUser(String name) {
		User toret = null;

		for (User u : users) {
			if (u.getName().equalsIgnoreCase(name)) {
				toret = u;
			}
		}

		return toret;
	}
}
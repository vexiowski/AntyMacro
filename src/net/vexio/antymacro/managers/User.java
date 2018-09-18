package net.vexio.antymacro.managers;

import net.vexio.antymacro.managers.UserManager;

public class User {
	private final String 
	name;
	private int cps;
	
	public User(String name) {
		this.name = name;
		this.cps = 0;
		UserManager.users.add(this);
	}

	public String getName() {
		return name;
	}

	public int getCps() {
		return cps;
	}

	public void setCps(int newcps) {
		this.cps = newcps;
	}
}

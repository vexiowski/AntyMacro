package net.vexio.antymacro.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import net.vexio.antymacro.managers.User;
import net.vexio.antymacro.managers.UserManager;

public class JoinQuitListener implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		if (UserManager.getUser(event.getPlayer().getName()) == null) {
			UserManager.addUser(new User(event.getPlayer().getName()));
		}
	}
	@EventHandler
	public void onQuit(PlayerQuitEvent event) {
		UserManager.removeUser(UserManager.getUser(event.getPlayer().getName()));
	}

}

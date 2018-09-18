package net.vexio.antymacro.tasks;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import net.vexio.antymacro.managers.User;
import net.vexio.antymacro.managers.UserManager;

public class ResetTask extends BukkitRunnable {

	@Override
	public void run() {
		for (Player online : Bukkit.getOnlinePlayers()) {
			User u = UserManager.getUser(online.getName());
			u.setCps(0);
		}
	}

}

package net.vexio.antymacro.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import net.vexio.antymacro.Main;
import net.vexio.antymacro.managers.User;
import net.vexio.antymacro.managers.UserManager;

public class ClickListener implements Listener {
	
	@EventHandler
	public void onClick(PlayerInteractEvent event) {
		if (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK) {
			User u = UserManager.getUser(event.getPlayer().getName());
			u.setCps(u.getCps() + 1);
			if (u.getCps() > Main.getPlugin().getConfig().getInt("max_cps")) {
				event.getPlayer().kickPlayer(Main.getPlugin().getConfig().getString("wiadomosc").replace("{N}", "\n").replace("&", "§").replace("{CPS}", Main.getPlugin().getConfig().getString("max_cps")));
			}
		}
	}

}

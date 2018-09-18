package net.vexio.antymacro;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.vexio.antymacro.listeners.ClickListener;
import net.vexio.antymacro.listeners.JoinQuitListener;
import net.vexio.antymacro.tasks.ResetTask;

public class Main extends JavaPlugin {
	
	private static Main plugin;
	
	public static Main getPlugin() {
		return plugin;
	}
	
	public void onEnable() {
		long start = System.currentTimeMillis();
		plugin = this;
		saveDefaultConfig();
		Bukkit.getPluginManager().registerEvents(new JoinQuitListener(), this);
		Bukkit.getPluginManager().registerEvents(new ClickListener(), this);
		new ResetTask().runTaskTimer(this, 20, 20);
		System.out.println("[CM-AntyMacro] Uruchomiono plugin w: " + (System.currentTimeMillis() - start) + "ms!");
	}

}

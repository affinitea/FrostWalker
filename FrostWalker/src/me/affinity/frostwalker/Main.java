 package me.affinity.frostwalker;

import org.bukkit.plugin.java.JavaPlugin;

import me.affinity.frostwalker.listeners.Listeners;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		new Listeners(this);
	}

}

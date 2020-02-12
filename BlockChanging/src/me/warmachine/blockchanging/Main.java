package me.warmachine.blockchanging;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.warmachine.blockchanging.commands.BlockToolCommand;
import me.warmachine.blockchanging.listeners.InventoryListener;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getCommand("blocktool").setExecutor(new BlockToolCommand());
		
		Bukkit.getPluginManager().registerEvents(new InventoryListener(), this);
	}
}

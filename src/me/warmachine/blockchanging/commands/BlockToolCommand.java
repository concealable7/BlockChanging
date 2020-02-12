package me.warmachine.blockchanging.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BlockToolCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
	    ItemStack bt = new ItemStack(Material.BLAZE_ROD);
		ItemMeta btMeta = bt.getItemMeta(); 
		btMeta.setDisplayName(ChatColor.GREEN + "Block Tool");
		
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "The real wand!");
		
		btMeta.setLore(lore);
		bt.setItemMeta(btMeta);
		
		Player player = (Player) sender;
		if (sender instanceof Player) { 
			player.getInventory().addItem(bt);
		} else if (!(sender instanceof Player)) {
			System.out.println("You may not run this command from console.");
		}
		
		return false;
	}

}

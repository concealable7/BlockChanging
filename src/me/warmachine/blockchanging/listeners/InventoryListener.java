package me.warmachine.blockchanging.listeners;

import java.util.HashSet;
import java.util.Set;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InventoryListener implements Listener {
	
	ItemStack bt = new ItemStack(Material.BLAZE_ROD);
	ItemMeta btMeta = bt.getItemMeta();
	HashSet<Material> m = new HashSet<>(); 
	
	@EventHandler
	public void InvEvent(BlockBreakEvent e) {
		
		Player p = (Player) e.getPlayer();
		
		if (p.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Block Tool")) {
			p.getTargetBlock((Set<Material>)null, 1).setType(Material.DIAMOND_BLOCK);
		}
	}
}

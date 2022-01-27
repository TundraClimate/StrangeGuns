package tundraclimate.com.github.storageguns.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

public abstract class SubCommand {
    protected abstract void onCommand(CommandSender sender, Command command,String[] args);
    protected abstract void addGunToPlayer();

    protected ItemStack genItem(String displayName, Material itemType,int ammoSize){
        ItemStack stack = new ItemStack(itemType);
        ItemMeta meta = stack.getItemMeta();
        Objects.requireNonNull(meta).setDisplayName(displayName+ ChatColor.GRAY+"("+ammoSize+"/"+ammoSize+")");
        stack.setItemMeta(meta);
        return stack;
    }
}

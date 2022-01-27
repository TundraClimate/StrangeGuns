package tundraclimate.com.github.storageguns.commands.addGuns;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import tundraclimate.com.github.storageguns.commands.SubCommand;

public class addTNTGun extends SubCommand {
    @Override
    protected void onCommand(CommandSender sender, Command command, String[] args) {
        ItemStack tntGun = genItem(ChatColor.YELLOW+"TNT Gun", Material.GOLDEN_HOE,2);
    }

    @Override
    protected void addGunToPlayer() {
    }
}

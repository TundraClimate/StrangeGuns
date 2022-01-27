package tundraclimate.com.github.strangeguns.commands.addGuns;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import tundraclimate.com.github.strangeguns.CreateGun;
import tundraclimate.com.github.strangeguns.GunsEnum;
import tundraclimate.com.github.strangeguns.commands.SubCommand;

public class addTNTGun extends SubCommand {
    @Override
    protected void onCommand(CommandSender sender, Command command, String[] args) {
        CreateGun createGun = new CreateGun(GunsEnum.TNT_GUN);
        ((Player) sender).getInventory().addItem(createGun.toItemStack());
    }
}

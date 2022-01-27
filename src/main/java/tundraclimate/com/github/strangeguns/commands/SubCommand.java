package tundraclimate.com.github.strangeguns.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public abstract class SubCommand {
    protected abstract void onCommand(CommandSender sender, Command command,String[] args);
}

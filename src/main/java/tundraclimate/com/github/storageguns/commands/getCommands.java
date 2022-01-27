package tundraclimate.com.github.storageguns.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import tundraclimate.com.github.storageguns.StrangeGuns;
import tundraclimate.com.github.storageguns.commands.addGuns.addTNTGun;

import java.util.HashMap;
import java.util.Map;

public class getCommands implements CommandExecutor {
    public getCommands(StrangeGuns guns){
        guns.getCommand("strangegun").setExecutor(this);
    }
    protected static final Map<String ,SubCommand> subCommands = new HashMap<>();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("strangegun")){
            if (!subCommands.containsKey(args[0].toLowerCase())){
                return false;
            }
            subCommands.get(args[0]).onCommand(sender,command,args);
            return true;
        }
        return false;
    }
    public void setSubCommands(){
        subCommands.put("tnt_gun",new addTNTGun());
    }
}

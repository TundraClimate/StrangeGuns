package tundraclimate.com.github.strangeguns.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import tundraclimate.com.github.strangeguns.StrangeGuns;
import tundraclimate.com.github.strangeguns.commands.addGuns.addTNTGun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class getCommands implements CommandExecutor , TabCompleter {
    public getCommands(StrangeGuns guns){
        guns.getCommand("strangegun").setExecutor(this);
        setSubCommands();
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

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1&&args[0].length() == 0) return new ArrayList<>(subCommands.keySet());
        return null;
    }
}

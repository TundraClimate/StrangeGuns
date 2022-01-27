package tundraclimate.com.github.storageguns;

import org.bukkit.plugin.java.JavaPlugin;
import tundraclimate.com.github.storageguns.commands.getCommands;

public final class StrangeGuns extends JavaPlugin {

    @Override
    public void onEnable() {
        new getCommands(this);
    }
}

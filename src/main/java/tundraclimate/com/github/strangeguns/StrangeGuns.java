package tundraclimate.com.github.strangeguns;

import org.bukkit.plugin.java.JavaPlugin;
import tundraclimate.com.github.strangeguns.commands.getCommands;
import tundraclimate.com.github.strangeguns.gunFire.ClickEvent;

import java.util.HashMap;
import java.util.Map;

public final class StrangeGuns extends JavaPlugin {
    public static final Map<GunsEnum ,CreateGun> gunInstanceMap = new HashMap<>();

    @Override
    public void onEnable() {
        new getCommands(this);
        new ClickEvent(this);
    }
}

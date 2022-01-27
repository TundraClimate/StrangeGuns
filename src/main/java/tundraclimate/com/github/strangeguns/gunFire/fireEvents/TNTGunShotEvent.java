package tundraclimate.com.github.strangeguns.gunFire.fireEvents;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.util.Vector;

import java.util.Objects;

public class TNTGunShotEvent {
    public static void shot(Player player) {
        if (player.getInventory().contains(Material.TNT)){
            int tnt = player.getInventory().first(Material.TNT);
            Objects.requireNonNull(player.getInventory().getItem(tnt)).setAmount(Objects.requireNonNull(player.getInventory().getItem(tnt)).getAmount()-1);
            Location eyeLoc = player.getEyeLocation();
            Vector vector = player.getLocation().getDirection().multiply(4);
            Entity entity = player.getWorld().spawnEntity(eyeLoc, EntityType.PRIMED_TNT);
            entity.setVelocity(vector);
            ((TNTPrimed) entity).setFuseTicks(40);
            ((TNTPrimed) entity).setSource(player);
        }
        else {
            Bukkit.broadcastMessage("pofu");
        }
    }
}

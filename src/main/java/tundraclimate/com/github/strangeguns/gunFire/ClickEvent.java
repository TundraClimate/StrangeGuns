package tundraclimate.com.github.strangeguns.gunFire;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import tundraclimate.com.github.strangeguns.StrangeGuns;
import tundraclimate.com.github.strangeguns.gunFire.fireEvents.TNTGunShotEvent;

public class ClickEvent implements Listener {
    public ClickEvent(StrangeGuns strangeGuns){
        strangeGuns.getServer().getPluginManager().registerEvents(this,strangeGuns);
    }
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e){
        ItemStack clickedItem = e.getPlayer().getInventory().getItemInMainHand();
        if (e.getAction() == Action.LEFT_CLICK_AIR) {
            if (clickedItem.getType() == Material.GOLDEN_HOE&&clickedItem.getItemMeta().hasItemFlag(ItemFlag.HIDE_ENCHANTS)) {
                TNTGunShotEvent.shot(e.getPlayer());
            }
        }
    }
}

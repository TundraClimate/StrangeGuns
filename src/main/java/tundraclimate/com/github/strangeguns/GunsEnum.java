package tundraclimate.com.github.strangeguns;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public enum GunsEnum {
    TNT_GUN(ChatColor.YELLOW+"TNT gun", new ItemStack(Material.TNT),new ItemStack(Material.GOLDEN_HOE));

    private final String name;
    private final ItemStack ammoType;
    private final ItemStack gunType;

    GunsEnum(String name, ItemStack ammoType, ItemStack gunType) {
        this.name = name;
        this.ammoType = ammoType;
        this.gunType = gunType;
    }

    public String getName() {
        return name;
    }

    public ItemStack getAmmoType() {
        return ammoType;
    }

    public ItemStack getGunType() {
        return gunType;
    }
}

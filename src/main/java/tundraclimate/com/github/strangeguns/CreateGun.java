package tundraclimate.com.github.strangeguns;

import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

public class CreateGun {
    private final GunsEnum guns;
    private final ItemStack stackOfAmmo;
    private final ItemStack GunItemStack;

    public CreateGun(GunsEnum gunsEnum){
        this.guns = gunsEnum;
        this.stackOfAmmo = gunsEnum.getAmmoType();
        this.GunItemStack = gunsEnum.getGunType();
    }

    public ItemStack getStackOfAmmo() {return stackOfAmmo;}

    public ItemStack getGunItemStack() {return GunItemStack;}

    public ItemStack toItemStack(){
        ItemStack itemStack = new ItemStack(getGunItemStack().getType());
        ItemMeta meta = itemStack.getItemMeta();
        Objects.requireNonNull(meta).setDisplayName(guns.getName());
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itemStack.setItemMeta(meta);
        return itemStack;
    }
}

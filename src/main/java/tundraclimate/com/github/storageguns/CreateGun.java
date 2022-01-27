package tundraclimate.com.github.storageguns;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class CreateGun {
    private final int MaxAmmo;
    private final Material typeOfAmmo;
    private final ItemStack stackOfAmmo;
    private final ItemStack GunItemStack;
    private int remainAmmo;

    public CreateGun(int maxAmmo, Material ammoType, ItemStack gunItemStack){
        this.MaxAmmo = maxAmmo;
        this.typeOfAmmo = ammoType;
        this.stackOfAmmo = new ItemStack(ammoType);
        this.GunItemStack = gunItemStack;
        this.remainAmmo = maxAmmo;
    }
    public CreateGun(int maxAmmo, ItemStack stackOfAmmo, ItemStack gunItemStack){
        this.MaxAmmo = maxAmmo;
        this.typeOfAmmo = stackOfAmmo.getType();
        this.stackOfAmmo = stackOfAmmo;
        this.GunItemStack = gunItemStack;
        this.remainAmmo = maxAmmo;
    }
}

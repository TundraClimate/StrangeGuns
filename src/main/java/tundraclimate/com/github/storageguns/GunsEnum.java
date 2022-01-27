package tundraclimate.com.github.storageguns;


import org.bukkit.Material;

public enum GunsEnum {
    TNT_GUN(2,Material.TNT,Material.GOLDEN_HOE);

    private final int ammoSize;
    private final Material ammoType;
    private final Material gunType;

    GunsEnum(int size,Material ammoType, Material gunType) {
        this.ammoSize = size;
        this.ammoType = ammoType;
        this.gunType = gunType;
    }

    public int getAmmoSize() {
        return ammoSize;
    }

    public Material getAmmoType() {
        return ammoType;
    }

    public Material getGunType() {
        return gunType;
    }
}

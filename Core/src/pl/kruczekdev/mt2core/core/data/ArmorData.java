package pl.kruczekdev.mt2core.core.data;

import org.bukkit.inventory.ItemStack;
import pl.kruczekdev.mt2core.core.types.CharactersType;
import pl.kruczekdev.mt2core.core.types.UpgradesType;

public class ArmorData {
    private String armorName;
    private ItemStack[] armorParts;
    private UpgradesType[] armorUpgrade;
    private Integer[] armorDefense, armorLevel;
    private CharactersType[] armorCharacter;

    public ArmorData(String armorName, ItemStack[] armorParts, UpgradesType[] armorUpgrade, Integer[] armorDefense, Integer[] armorLevel, CharactersType[] armorCharacter) {
        this.armorName = armorName;
        this.armorParts = armorParts;
        this.armorUpgrade = armorUpgrade;
        this.armorDefense = armorDefense;
        this.armorLevel = armorLevel;
        this.armorCharacter = armorCharacter;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public ItemStack[] getArmorParts() {
        return armorParts;
    }

    public void setArmorParts(ItemStack[] armorParts) {
        this.armorParts = armorParts;
    }

    public UpgradesType[] getArmorUpgrade() {
        return armorUpgrade;
    }

    public void setArmorUpgrade(UpgradesType[] armorUpgrade) {
        this.armorUpgrade = armorUpgrade;
    }

    public Integer[] getArmorDefense() {
        return armorDefense;
    }

    public void setArmorDefense(Integer[] armorDefense) {
        this.armorDefense = armorDefense;
    }

    public Integer[] getArmorLevel() {
        return armorLevel;
    }

    public void setArmorLevel(Integer[] armorLevel) {
        this.armorLevel = armorLevel;
    }

    public CharactersType[] getArmorCharacter() {
        return armorCharacter;
    }

    public void setArmorCharacter(CharactersType[] armorCharacter) {
        this.armorCharacter = armorCharacter;
    }

}

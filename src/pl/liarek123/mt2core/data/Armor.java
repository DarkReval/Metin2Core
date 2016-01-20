package pl.liarek123.mt2core.data;

import org.bukkit.inventory.ItemStack;
import pl.liarek123.mt2core.data.armors.Boots;
import pl.liarek123.mt2core.data.armors.Chestplate;
import pl.liarek123.mt2core.data.armors.Helmet;
import pl.liarek123.mt2core.data.armors.Leggings;
import pl.liarek123.mt2core.types.Classes;

public class Armor {
    private String armorName;
    private Integer armorLevel, armorUpgrade;
    private Classes armorClasses;
    private Helmet armorHelmet;
    private Chestplate armorChestplate;
    private Leggings armorLeggings;
    private Boots armorBoots;

    public Armor(String armorName, Integer armorLevel, Integer armorUpgrade, Classes armorClasses, Helmet armorHelmet, Chestplate armorChestplate, Leggings armorLeggings, Boots armorBoots){
        this.armorName = armorName;
        this.armorLevel = armorLevel;
        this.armorClasses = armorClasses;
        this.armorUpgrade = armorUpgrade;
        this.armorHelmet = armorHelmet;
        this.armorChestplate = armorChestplate;
        this.armorLeggings = armorLeggings;
        this.armorBoots = armorBoots;
    }

    public static Armor createArmor(String armorName, Integer armorLevel, Integer armorUpgrade, Classes armorClasses, Helmet armorHelmet, Chestplate armorChestplate, Leggings armorleggings, Boots armorBoots){
        Armor armore = new Armor(armorName, armorLevel, armorUpgrade, armorClasses, armorHelmet, armorChestplate, armorleggings, armorBoots);
        return armore;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public Boots getArmorBoots() {
        return armorBoots;
    }

    public void setArmorBoots(Boots armorBoots) {
        this.armorBoots = armorBoots;
    }

    public Integer getArmorLevel() {
        return armorLevel;
    }

    public void setArmorLevel(Integer armorLevel) {
        this.armorLevel = armorLevel;
    }

    public Integer getArmorUpgrade() {
        return armorUpgrade;
    }

    public void setArmorUpgrade(Integer armorUpgrade) {
        this.armorUpgrade = armorUpgrade;
    }

    public Classes getArmorClasses() {
        return armorClasses;
    }

    public void setArmorClasses(Classes armorClasses) {
        this.armorClasses = armorClasses;
    }

    public Helmet getArmorHelmet() {
        return armorHelmet;
    }

    public void setArmorHelmet(Helmet armorHelmet) {
        this.armorHelmet = armorHelmet;
    }

    public Chestplate getArmorChestplate() {
        return armorChestplate;
    }

    public void setArmorChestplate(Chestplate armorChestplate) {
        this.armorChestplate = armorChestplate;
    }

    public Leggings getArmorLeggings() {
        return armorLeggings;
    }

    public void setArmorLeggings(Leggings armorLeggings) {
        this.armorLeggings = armorLeggings;
    }
}

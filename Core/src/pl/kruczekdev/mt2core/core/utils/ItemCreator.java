package pl.kruczekdev.mt2core.core.utils;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import pl.kruczekdev.mt2core.core.data.ArmorData;
import pl.kruczekdev.mt2core.core.data.Data;
import pl.kruczekdev.mt2core.core.types.CharactersType;
import pl.kruczekdev.mt2core.core.types.UpgradesType;
import java.util.ArrayList;
import java.util.List;

public class ItemCreator {
    public void createArmor(String armorName, String[] name, Color[] color, UpgradesType[] upgradesType, Integer[] level, Integer[] defense, CharactersType[] charactersTypes){
        Material[] materialPart = {Material.LEATHER_HELMET, Material.LEATHER_CHESTPLATE, Material.LEATHER_LEGGINGS, Material.LEATHER_BOOTS};
        List<ItemStack> parts = new ArrayList<ItemStack>();
        for (int m = 0;m < 4;m++){
            ItemStack itemStack = new ItemStack(materialPart[m]);
            LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) itemStack.getItemMeta();
            leatherArmorMeta.setDisplayName(name[m].toString());
            leatherArmorMeta.setColor(color[m]);
            List<String> lore = new ArrayList<String>();
            lore.add("§8Ulepszenie: §c" + upgradesType[m].getUpgradeName());
            lore.add("§8Od poziomu: §c" + level[m]);
            lore.add("§8Obrona: §c" + defense[m]);
            lore.add("§8Klasa: §c" + charactersTypes[m].getNameCharacter());
            leatherArmorMeta.removeItemFlags(ItemFlag.values());
            leatherArmorMeta.setLore(lore);
            itemStack.setItemMeta(leatherArmorMeta);
            parts.add(itemStack);
        }
        ItemStack[] armor = {parts.get(0), parts.get(1), parts.get(2), parts.get(3)};
        Data.armors.put(armorName, new ArmorData(armorName, armor, upgradesType, defense, level, charactersTypes));
    }
}

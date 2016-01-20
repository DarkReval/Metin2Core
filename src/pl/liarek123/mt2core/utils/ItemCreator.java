package pl.liarek123.mt2core.utils;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import pl.liarek123.mt2core.types.Classes;
import java.util.ArrayList;
import java.util.List;

public class ItemCreator {
    public ItemStack createHelmet(String name,  Color color, Integer level, Integer def, Classes classes){
        ItemStack itemStack = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) itemStack.getItemMeta();
        leatherArmorMeta.setColor(color);
        List<String> lore = new ArrayList<String>();
        lore.add("§8Wymagany poziom: " + ChatColor.RED +  level);
        lore.add("§8Punkty obrony: " + ChatColor.RED +  def);
        lore.add("§8Klasa: " + ChatColor.RED + classes.name());
        leatherArmorMeta.setLore(lore);
        leatherArmorMeta.setDisplayName(name);
        itemStack.setItemMeta(leatherArmorMeta);
        return itemStack;
    }

    public ItemStack createChestplate(String name,  Color color, Integer level, Integer def, Classes classes){
        ItemStack itemStack = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) itemStack.getItemMeta();
        leatherArmorMeta.setColor(color);
        List<String> lore = new ArrayList<String>();
        lore.add("§8Wymagany poziom: " + ChatColor.RED +  level);
        lore.add("§8Punkty obrony: " + ChatColor.RED +  def);
        lore.add("§8Klasa: " + ChatColor.RED + classes.name());
        leatherArmorMeta.setLore(lore);
        leatherArmorMeta.setDisplayName(name);
        itemStack.setItemMeta(leatherArmorMeta);
        return itemStack;
    }

    public ItemStack createLeggings(String name,  Color color, Integer level, Integer def, Classes classes){
        ItemStack itemStack = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) itemStack.getItemMeta();
        leatherArmorMeta.setColor(color);
        List<String> lore = new ArrayList<String>();
        lore.add("§8Wymagany poziom: " + ChatColor.RED +  level);
        lore.add("§8Punkty obrony: " + ChatColor.RED +  def);
        lore.add("§8Klasa: " + ChatColor.RED + classes.name());
        leatherArmorMeta.setLore(lore);
        leatherArmorMeta.setDisplayName(name);
        itemStack.setItemMeta(leatherArmorMeta);
        return itemStack;
    }

    public ItemStack createBoots(String name,  Color color, Integer level, Integer def, Classes classes){
        ItemStack itemStack = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) itemStack.getItemMeta();
        leatherArmorMeta.setColor(color);
        List<String> lore = new ArrayList<String>();
        lore.add("§8Wymagany poziom: " + ChatColor.RED +  level);
        lore.add("§8Punkty obrony: " + ChatColor.RED +  def);
        lore.add("§8Klasa: " + ChatColor.RED + classes.name());
        leatherArmorMeta.setLore(lore);
        leatherArmorMeta.setDisplayName(name);
        itemStack.setItemMeta(leatherArmorMeta);
        return itemStack;
    }
}

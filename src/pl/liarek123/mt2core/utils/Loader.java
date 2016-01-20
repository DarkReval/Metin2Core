package pl.liarek123.mt2core.utils;

import org.bukkit.Color;
import pl.liarek123.mt2core.data.Armor;
import pl.liarek123.mt2core.data.armors.Boots;
import pl.liarek123.mt2core.data.armors.Chestplate;
import pl.liarek123.mt2core.data.armors.Helmet;
import pl.liarek123.mt2core.data.armors.Leggings;
import pl.liarek123.mt2core.types.Classes;
import pl.liarek123.mt2core.types.Items;

import java.util.HashMap;
import java.util.Map;

public class Loader {
    public Map<Items, Armor> armors = new HashMap<Items, Armor>();
    public void preLoad(){
        armors.put(Items.NINJA_ARMOR1, Armor.createArmor("§eZwykle Ubranie", 1, 0, Classes.NINJA, Helmet.create(null, 15), Chestplate.create(null, 35), Leggings.create(null, 20), Boots.create(null, 10)));
        armors.put(Items.NINJA_ARMOR2, Armor.createArmor("§eSzlachetne Ubranie", 10, 0, Classes.NINJA, Helmet.create(null, 25), Chestplate.create(null, 65), Leggings.create(null, 40), Boots.create(null, 20)));
        armors.put(Items.NINJA_ARMOR3, Armor.createArmor("§eUbranie Zabojcy", 25, 0, Classes.NINJA, Helmet.create(null, 35), Chestplate.create(null, 95), Leggings.create(null, 60), Boots.create(null, 30)));
        armors.put(Items.NINJA_ARMOR4, Armor.createArmor("§eUbranie Smoka", 45, 0, Classes.NINJA, Helmet.create(null, 45), Chestplate.create(null, 125), Leggings.create(null, 80), Boots.create(null, 40)));
        armors.put(Items.NINJA_ARMOR5, Armor.createArmor("§eUbranie Czarn. Wiatru", 1, 0, Classes.NINJA, Helmet.create(null, 55), Chestplate.create(null, 155), Leggings.create(null, 100), Boots.create(null, 50)));
    }
    public void load() {
        ItemCreator itemCreator = new ItemCreator();
        preLoad();
        armors.get(Items.NINJA_ARMOR1).getArmorHelmet().setHelmetItemstack(itemCreator.createHelmet(armors.get(Items.NINJA_ARMOR1).getArmorName(),
                Color.YELLOW,
                armors.get(Items.NINJA_ARMOR1).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR1).getArmorHelmet().getHelmetDefense(),
                armors.get(Items.NINJA_ARMOR1).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR2).getArmorHelmet().setHelmetItemstack(itemCreator.createHelmet(armors.get(Items.NINJA_ARMOR2).getArmorName(),
                Color.OLIVE,
                armors.get(Items.NINJA_ARMOR2).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR2).getArmorHelmet().getHelmetDefense(),
                armors.get(Items.NINJA_ARMOR2).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR3).getArmorHelmet().setHelmetItemstack(itemCreator.createHelmet(armors.get(Items.NINJA_ARMOR3).getArmorName(),
                Color.GRAY,
                armors.get(Items.NINJA_ARMOR3).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR3).getArmorHelmet().getHelmetDefense(),
                armors.get(Items.NINJA_ARMOR3).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR4).getArmorHelmet().setHelmetItemstack(itemCreator.createHelmet(armors.get(Items.NINJA_ARMOR4).getArmorName(),
                Color.WHITE,
                armors.get(Items.NINJA_ARMOR4).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR4).getArmorHelmet().getHelmetDefense(),
                armors.get(Items.NINJA_ARMOR4).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR5).getArmorHelmet().setHelmetItemstack(itemCreator.createHelmet(armors.get(Items.NINJA_ARMOR5).getArmorName(),
                Color.BLACK,
                armors.get(Items.NINJA_ARMOR5).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR5).getArmorHelmet().getHelmetDefense(),
                armors.get(Items.NINJA_ARMOR5).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR1).getArmorChestplate().setChestplateItemstack(itemCreator.createChestplate(armors.get(Items.NINJA_ARMOR1).getArmorName(),
                Color.YELLOW,
                armors.get(Items.NINJA_ARMOR1).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR1).getArmorChestplate().getChestplateDefense(),
                armors.get(Items.NINJA_ARMOR1).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR2).getArmorChestplate().setChestplateItemstack(itemCreator.createChestplate(armors.get(Items.NINJA_ARMOR2).getArmorName(),
                Color.OLIVE,
                armors.get(Items.NINJA_ARMOR2).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR2).getArmorChestplate().getChestplateDefense(),
                armors.get(Items.NINJA_ARMOR2).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR3).getArmorChestplate().setChestplateItemstack(itemCreator.createChestplate(armors.get(Items.NINJA_ARMOR3).getArmorName(),
                Color.GRAY,
                armors.get(Items.NINJA_ARMOR3).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR3).getArmorChestplate().getChestplateDefense(),
                armors.get(Items.NINJA_ARMOR3).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR4).getArmorChestplate().setChestplateItemstack(itemCreator.createChestplate(armors.get(Items.NINJA_ARMOR4).getArmorName(),
                Color.WHITE,
                armors.get(Items.NINJA_ARMOR4).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR4).getArmorChestplate().getChestplateDefense(),
                armors.get(Items.NINJA_ARMOR4).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR5).getArmorChestplate().setChestplateItemstack(itemCreator.createChestplate(armors.get(Items.NINJA_ARMOR5).getArmorName(),
                Color.BLACK,
                armors.get(Items.NINJA_ARMOR5).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR5).getArmorChestplate().getChestplateDefense(),
                armors.get(Items.NINJA_ARMOR5).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR1).getArmorLeggings().setLeggingsItemstack(itemCreator.createLeggings(armors.get(Items.NINJA_ARMOR1).getArmorName(),
                Color.YELLOW,
                armors.get(Items.NINJA_ARMOR1).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR1).getArmorLeggings().getLeggingsDefense(),
                armors.get(Items.NINJA_ARMOR1).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR2).getArmorLeggings().setLeggingsItemstack(itemCreator.createLeggings(armors.get(Items.NINJA_ARMOR2).getArmorName(),
                Color.OLIVE,
                armors.get(Items.NINJA_ARMOR2).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR2).getArmorLeggings().getLeggingsDefense(),
                armors.get(Items.NINJA_ARMOR2).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR3).getArmorLeggings().setLeggingsItemstack(itemCreator.createLeggings(armors.get(Items.NINJA_ARMOR3).getArmorName(),
                Color.GRAY,
                armors.get(Items.NINJA_ARMOR3).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR3).getArmorLeggings().getLeggingsDefense(),
                armors.get(Items.NINJA_ARMOR3).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR4).getArmorLeggings().setLeggingsItemstack(itemCreator.createLeggings(armors.get(Items.NINJA_ARMOR4).getArmorName(),
                Color.WHITE,
                armors.get(Items.NINJA_ARMOR4).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR4).getArmorLeggings().getLeggingsDefense(),
                armors.get(Items.NINJA_ARMOR4).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR5).getArmorLeggings().setLeggingsItemstack(itemCreator.createLeggings(armors.get(Items.NINJA_ARMOR5).getArmorName(),
                Color.BLACK,
                armors.get(Items.NINJA_ARMOR5).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR5).getArmorLeggings().getLeggingsDefense(),
                armors.get(Items.NINJA_ARMOR5).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR1).getArmorBoots().setBootsItemstack(itemCreator.createBoots(armors.get(Items.NINJA_ARMOR1).getArmorName(),
                Color.YELLOW,
                armors.get(Items.NINJA_ARMOR1).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR1).getArmorBoots().getBootsDefense(),
                armors.get(Items.NINJA_ARMOR1).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR2).getArmorBoots().setBootsItemstack(itemCreator.createBoots(armors.get(Items.NINJA_ARMOR2).getArmorName(),
                Color.OLIVE,
                armors.get(Items.NINJA_ARMOR2).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR2).getArmorBoots().getBootsDefense(),
                armors.get(Items.NINJA_ARMOR2).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR3).getArmorBoots().setBootsItemstack(itemCreator.createBoots(armors.get(Items.NINJA_ARMOR3).getArmorName(),
                Color.GRAY,
                armors.get(Items.NINJA_ARMOR3).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR3).getArmorBoots().getBootsDefense(),
                armors.get(Items.NINJA_ARMOR3).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR4).getArmorBoots().setBootsItemstack(itemCreator.createBoots(armors.get(Items.NINJA_ARMOR4).getArmorName(),
                Color.WHITE,
                armors.get(Items.NINJA_ARMOR4).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR4).getArmorBoots().getBootsDefense(),
                armors.get(Items.NINJA_ARMOR4).getArmorClasses()));
        armors.get(Items.NINJA_ARMOR5).getArmorBoots().setBootsItemstack(itemCreator.createBoots(armors.get(Items.NINJA_ARMOR5).getArmorName(),
                Color.BLACK,
                armors.get(Items.NINJA_ARMOR5).getArmorLevel(),
                armors.get(Items.NINJA_ARMOR5).getArmorBoots().getBootsDefense(),
                armors.get(Items.NINJA_ARMOR5).getArmorClasses()));
    }

}

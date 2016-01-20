package pl.liarek123.mt2core.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.liarek123.mt2core.Core;
import pl.liarek123.mt2core.types.Items;

public class PlayerJoinListener implements Listener {
    Core plugin;
    public PlayerJoinListener(Core plugin){
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR1).getArmorHelmet().getHelmetItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR1).getArmorChestplate().getChestplateItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR1).getArmorLeggings().getLeggingsItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR1).getArmorBoots().getBootsItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR2).getArmorHelmet().getHelmetItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR2).getArmorChestplate().getChestplateItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR2).getArmorLeggings().getLeggingsItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR2).getArmorBoots().getBootsItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR3).getArmorHelmet().getHelmetItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR3).getArmorChestplate().getChestplateItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR3).getArmorLeggings().getLeggingsItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR3).getArmorBoots().getBootsItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR4).getArmorHelmet().getHelmetItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR4).getArmorChestplate().getChestplateItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR4).getArmorLeggings().getLeggingsItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR4).getArmorBoots().getBootsItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR5).getArmorHelmet().getHelmetItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR5).getArmorChestplate().getChestplateItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR5).getArmorLeggings().getLeggingsItemstack());
        p.getInventory().addItem(plugin.loader.armors.get(Items.NINJA_ARMOR5).getArmorBoots().getBootsItemstack());
    }
}

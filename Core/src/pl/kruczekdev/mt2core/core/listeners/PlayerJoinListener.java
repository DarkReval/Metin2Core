package pl.kruczekdev.mt2core.core.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import pl.kruczekdev.mt2core.core.Core;
import pl.kruczekdev.mt2core.core.data.*;
import pl.kruczekdev.mt2core.core.types.CharactersType;
import pl.kruczekdev.mt2core.core.types.KingdomsType;

public class PlayerJoinListener implements Listener {
    Core plugin;
    public PlayerJoinListener(Core plugin){
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        //DEBUG FOR SEE
        Player player = e.getPlayer();
        CharacterData characterData = new CharacterData(1, 0, 300, 1000, 500, 150, 100, 5, 5, 5, 5, CharactersType.WARRIOR);
        GamerData gamerData = new GamerData(player.getName(), player.getUniqueId(), KingdomsType.HOKKAIDO, characterData);
        plugin.data.addGamer(player, gamerData);
        ItemStack[] armorParted = Data.armors.get("1").getArmorParts();
        player.getInventory().addItem(armorParted[0]);
        player.getInventory().addItem(armorParted[1]);
        player.getInventory().addItem(armorParted[2]);
        player.getInventory().addItem(armorParted[3]);
    }
}

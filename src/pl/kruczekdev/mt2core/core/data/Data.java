package pl.kruczekdev.mt2core.core.data;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.entity.Player;
import pl.kruczekdev.mt2core.core.types.CharactersType;
import pl.kruczekdev.mt2core.core.types.UpgradesType;
import pl.kruczekdev.mt2core.core.utils.ItemCreator;

import java.util.HashMap;
import java.util.Map;

public class Data {
    public static Map<String, ArmorData> armors = new HashMap<String, ArmorData>();
    public static Map<String, GamerData> gamers = new HashMap<String, GamerData>();

    public void addGamer(Player player, GamerData gamerData){
        if (!gamers.containsKey(player.getName())){
            gamers.put(player.getName(), gamerData);
        }
    }

    public void removeGamer(Player player){
        if (gamers.containsKey(player.getName())){
            gamers.remove(player.getName());
        }
    }

    public void loadArmors(){
        ItemCreator itemCreator = new ItemCreator();
        String armorName = "1";
        String[] name = {"§4Tradycyjny Helm", "§4Zbroja plyt. Mnisia", "§4Czerwone Spodnie", "§4Skórzane Buty"};
        Color[] color = {Color.RED, Color.RED, Color.RED, Color.RED};
        UpgradesType[] upgradesType = {UpgradesType.NORMAL, UpgradesType.IMPROVED, UpgradesType.ELITE, UpgradesType.LEGENDARY};
        Integer[] level = {1, 1, 1, 1};
        Integer[] defense = {15, 35, 20, 5};
        CharactersType[] charactersTypes = {CharactersType.WARRIOR, CharactersType.WARRIOR, CharactersType.WARRIOR, CharactersType.NINJA};
        itemCreator.createArmor(armorName, name, color, upgradesType, level, defense, charactersTypes);
    }
}

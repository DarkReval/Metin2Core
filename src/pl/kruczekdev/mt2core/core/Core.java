package pl.kruczekdev.mt2core.core;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import pl.kruczekdev.mt2core.core.data.Data;
import pl.kruczekdev.mt2core.core.listeners.PlayerJoinListener;

public class Core extends JavaPlugin{
    public Data data;
    @Override
    public void onEnable(){
        data = new Data();
        new PlayerJoinListener(this);
        data.loadArmors();
    }
    @Override
    public void onDisable(){

    }
}

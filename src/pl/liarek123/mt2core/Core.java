package pl.liarek123.mt2core;

import org.bukkit.plugin.java.JavaPlugin;
import pl.liarek123.mt2core.listeners.PlayerJoinListener;
import pl.liarek123.mt2core.utils.Loader;

public class Core extends JavaPlugin{
    public Loader loader;
    @Override
    public void onEnable(){
        loader = new Loader();
        loader.load();
        new PlayerJoinListener(this);
    }
    @Override
    public void onDisable(){

    }
}

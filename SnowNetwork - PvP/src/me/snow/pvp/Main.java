package me.snow.pvp;

import org.bukkit.Bukkit;
import me.snow.pvp.eventos.*;
import me.snow.pvp.comandos.*;
import me.snow.pvp.jumps.*;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public static String prefix = "§7§l[§b§lSnow§f§lPvP§7§l]";
	public static Plugin plugin;
	  public static Plugin getPlugin()
	  {
	    return plugin;
	  }
	  
	  public void onEnable()
	  {
	    Bukkit.getServer().getConsoleSender().sendMessage(prefix + "Ativado");
	    PluginManager pm = Bukkit.getPluginManager();
	    pm.registerEvents(new Sopa(this), this);
	    pm.registerEvents(new SemChuvaESemFome(this), this);
	    pm.registerEvents(new Diamante(this), this);
	    pm.registerEvents(new Esmeralda(this), this);
	    pm.registerEvents(new Ferro(this), this);
	    pm.registerEvents(new Redstone(this), this);
	    pm.registerEvents(new PlacaDeRecraft(), this);
	    pm.registerEvents(new PlacaDeSopa(), this);
	    pm.registerEvents(new WhiteListEvent(this), this);
	    pm.registerEvents(new BoardScore(), this);
	    getCommand("dev").setExecutor(new Dev(this));
	    getCommand("dono").setExecutor(new Dono(this));
	    getCommand("gm").setExecutor(new GM(this));
	    getCommand("tpvp").setExecutor(new TPvP());
	    getCommand("manutencao").setExecutor(new Manutenção());
	    getCommand("kickall").setExecutor(new KickAll(this));
	    plugin = this;
	    
	  }
	  
	  public void onDisable()
	  {
	    Bukkit.getServer().getConsoleSender().sendMessage(prefix + "Desativado");
    }

	public static Object getInstance() {
		return null;
	}
}
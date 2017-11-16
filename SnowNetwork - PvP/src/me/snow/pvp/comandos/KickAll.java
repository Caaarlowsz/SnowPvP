package me.snow.pvp.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.snow.pvp.Main;

public class KickAll
  implements CommandExecutor
{
  public KickAll(Main main) {}
  
  public boolean onCommand(CommandSender Sender, Command Cmd, String Label, String[] Args)
  {
    if (Label.equalsIgnoreCase("kickall"))
    {
    	for (Player p : Bukkit.getServer().getOnlinePlayers()) {
            if (!p.isOp() && !p.isWhitelisted()) {
                p.kickPlayer("§7§l[§b§lSnow§f§lPvP§7§l]§4§l Manutenção!");
            }
    }
    return true;
    }
	return false;
  }
}

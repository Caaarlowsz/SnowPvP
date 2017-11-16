package me.snow.pvp.comandos;

import me.snow.pvp.Main;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GM
  implements CommandExecutor
{
  public GM(Main main) {}
  
  public boolean onCommand(CommandSender Sender, Command Cmd, String Label, String[] Args)
  {
    if ((Label.equalsIgnoreCase("gm")) && 
      (Sender.hasPermission("snow.admin")))
    {
      Player p = (Player)Sender;
      if (!p.hasPermission("snow.admin")) {
        p.sendMessage("§4Sem Permissao!");
      }
      if (Args[0].toLowerCase().equalsIgnoreCase("1")) {
        p.setGameMode(GameMode.CREATIVE);
      }
      if (Args[0].toLowerCase().equalsIgnoreCase("0")) {
        p.setGameMode(GameMode.SURVIVAL);
      }
    }
    return false;
  }
}

package me.snow.pvp.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.snow.pvp.Main;

public class Dono
  implements CommandExecutor
{
  public Dono(Main main) {}
  
  public boolean onCommand(CommandSender Sender, Command Cmd, String Label, String[] Args)
  {
    if (Label.equalsIgnoreCase("dono"))
    {
      Player p = (Player)Sender;
      
      p.sendMessage("§a§lDono");
      p.sendMessage("§7=================");
      p.sendMessage("§2Nick: §aBiscoitoGamerBR");
      p.sendMessage("");
      p.sendMessage("§a§lDesenvolvedor");
      p.sendMessage("§7=================");
      p.sendMessage("§2Nick: §aFreddyDZN");
    }
    return false;
  }
}

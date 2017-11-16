package me.snow.pvp.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TPvP
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if (cmd.getName().equalsIgnoreCase("tpvp"))
    {
      Player p = (Player)sender;
      if (!p.hasPermission("snow.admin"))
      {
        p.sendMessage(ChatColor.DARK_RED + "Sem Permisao!");
        return true;
      }
      if (args.length == 0)
      {
        p.sendMessage(ChatColor.AQUA + "Use: /tpvp on e /tpvp off");
        return true;
      }
      if (args[0].equalsIgnoreCase("on"))
      {
        Bukkit.broadcastMessage(ChatColor.GREEN + "O PvP Foi Ligado");
        p.getWorld().setPVP(true);
      }
      if (args[0].equalsIgnoreCase("off"))
      {
        Bukkit.broadcastMessage(ChatColor.RED + "O PvP Foi Desligado");
        p.getWorld().setPVP(false);
      }
    }
    return false;
  }
}
package me.snow.pvp.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.minecraft.server.v1_8_R1.MinecraftServer;

public class Manutenção
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if (cmd.getName().equalsIgnoreCase("manutencao"))
    {
      Player p = (Player)sender;
      if (!p.hasPermission("snow.dono"))
      {
        p.sendMessage(ChatColor.DARK_RED + "Sem Permisao!");
        return true;
      }
      if (args.length == 0)
      {
        p.sendMessage(ChatColor.AQUA + "Use: /manutencao on e /manutencao off");
        return true;
      }
      if (args[0].equalsIgnoreCase("on"))
      {
        Bukkit.broadcastMessage(ChatColor.GREEN + "A Manutencao Foi Ligada");
        p.getServer().setWhitelist(true);
        MinecraftServer.getServer().setMotd("§b§lSnow§f§lPvP §7§l>>> §3§lSite Em Breve\n§4§l§nEM MANUTENÇÃO!");
        p.chat("/kickall");
      }
      if (args[0].equalsIgnoreCase("off"))
      {
        Bukkit.broadcastMessage(ChatColor.RED + "A Manutencao Foi Desligada");
        p.getServer().setWhitelist(false);
        MinecraftServer.getServer().setMotd("§b§lSnow§f§lPvP §7§l>>> §3§lSite Em Breve\n§9§l§oMelhor KitPvP Brasileiro!");
      }
  }
	return false;
}
}
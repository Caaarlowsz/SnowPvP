package me.snow.pvp.eventos;

import me.snow.pvp.Main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent.Result;

public class WhiteListEvent
  implements Listener
{
  public WhiteListEvent(Main main) {}
  
  @EventHandler(priority = EventPriority.MONITOR)
  public void onLogin(PlayerLoginEvent event)
  {
      @SuppressWarnings("unused")
	Player p = event.getPlayer();
      if (event.getResult().equals(Result.KICK_WHITELIST))
      {
          event.setKickMessage("§7§l[§b§lSnow§f§lPvP§7§l]§4§l Manutenção!");
          return;
      }
      return;
  }
}
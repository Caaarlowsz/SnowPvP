package me.snow.pvp.eventos;

import me.snow.pvp.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

public class SemChuvaESemFome
  implements Listener
{
  public SemChuvaESemFome(Main main) {}
  
  @EventHandler
  public void onFome(FoodLevelChangeEvent e)
  {
    e.setCancelled(true);
  }
  
  @EventHandler(priority=EventPriority.NORMAL)
  public void onChuva(WeatherChangeEvent e)
  {
    if (e.toWeatherState()) {
      e.setCancelled(true);
    }
  }
}

package me.snow.pvp.eventos;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

import me.snow.pvp.Main;

@SuppressWarnings("deprecation")
public class BoardScore implements Listener

{

	public OfflinePlayer getText(String string) {

		string = string.length() > 16 ? string.substring(0, 16) : string;
		return Bukkit.getOfflinePlayer(string);
	}

	@EventHandler
	public void ScoreBoardMainEvent(PlayerMoveEvent e) {

		Player p = e.getPlayer();
		Scoreboard score = Bukkit.getScoreboardManager().getNewScoreboard();
		Objective obj = score.registerNewObjective("teste", "dummy");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		obj.setDisplayName(Main.prefix);
		obj.getScore(getText("§7Matou: §e" + p.getStatistic(Statistic.PLAYER_KILLS))).setScore(7);
		obj.getScore(getText("§7Morreu: §e" + p.getStatistic(Statistic.DEATHS))).setScore(6);
		obj.getScore(getText("§7Nick: §e" + p.getDisplayName())).setScore(5);
		obj.getScore(getText("§e ")).setScore(4);
		obj.getScore(getText("§7Kit: §eNenhum")).setScore(3);
		obj.getScore(getText("§7Grupo: §eNormal")).setScore(2);
		obj.getScore(getText("§f ")).setScore(1);
		obj.getScore(getText("§e/score")).setScore(0);
		p.setScoreboard(score);
	}
}
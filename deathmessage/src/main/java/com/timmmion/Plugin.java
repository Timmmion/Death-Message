package com.timmmion;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin implements Listener
{
  private static final Logger LOGGER=Logger.getLogger("deathmessage");
  private static String PREFIX = "[Catlorant] ";

  public void onEnable()
  {
    getServer().getPluginManager().registerEvents(this, this);
    LOGGER.info("Deathmessage by Timmmion enabled");
  }

  public void onDisable()
  {
    LOGGER.info("Deathmessage by Timmmion disabled");
  }

  @EventHandler
  public void onDie(PlayerDeathEvent e){
      if(e.getEntity() instanceof Player){
        Location loc = e.getEntity().getLocation();
        e.getEntity().sendMessage(ChatColor.YELLOW + PREFIX + ChatColor.GRAY + "PAHAHAHAH xD! You died at X: " + Math.round(loc.getX()) + " Y: " + Math.round(loc.getY()) + " Z: " + Math.round(loc.getZ()));
      }
  }

}

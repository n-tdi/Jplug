package me.joey.jplug;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Jplug extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("[JPlug] Jplug has been enabled!");
        Bukkit.broadcastMessage("hello this is a testing server if you see this you are some how very gay");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("[JPlug] Jplug has been disabled!");
    }
}

package dev.bleepo.anarchyjoinmessagesrewrite;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class AnarchyJoinMessagesRewrite extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.AQUA + "[AnarchyJoinMessages]" + ChatColor.GREEN + " AnarchyJoinMessages has been loaded and enabled!");
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.AQUA + "[AnarchyJoinMessages]" + ChatColor.RED + " AnarchyJoinMessages has been unloaded and disabled!");
    }
}

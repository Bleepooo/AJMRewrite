package dev.bleepo.anarchyjoinmessagesrewrite;

import dev.bleepo.anarchyjoinmessagesrewrite.events.onFirstJoin;
import dev.bleepo.anarchyjoinmessagesrewrite.events.onJoin;
import dev.bleepo.anarchyjoinmessagesrewrite.events.onLeave;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class AnarchyJoinMessagesRewrite extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.AQUA + "[AnarchyJoinMessages]" + ChatColor.GREEN + " AnarchyJoinMessages has been loaded and enabled!");
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new onJoin(this), this);
        getServer().getPluginManager().registerEvents(new onFirstJoin(this), this);
        getServer().getPluginManager().registerEvents(new onLeave(this), this);
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.AQUA + "[AnarchyJoinMessages]" + ChatColor.RED + " AnarchyJoinMessages has been unloaded and disabled!");
    }
}

package dev.bleepo.anarchyjoinmessagesrewrite.events;

import dev.bleepo.anarchyjoinmessagesrewrite.AnarchyJoinMessagesRewrite;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onJoin implements Listener {
    private final AnarchyJoinMessagesRewrite plugin;

    public onJoin(AnarchyJoinMessagesRewrite plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    void onPlayerJoin(PlayerJoinEvent e) {
        if(plugin.getConfig().getBoolean("joinmessages.sendmessage")) {
            Player player = e.getPlayer();
            String join = plugin.getConfig().getString("joinmessages.message");
            e.setJoinMessage(ChatColor.translateAlternateColorCodes('&', join.replace("{player}", player.getDisplayName())));
        }
    }
}

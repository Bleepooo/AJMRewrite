package dev.bleepo.anarchyjoinmessagesrewrite.events;

import dev.bleepo.anarchyjoinmessagesrewrite.AnarchyJoinMessagesRewrite;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class onLeave implements Listener {
    private final AnarchyJoinMessagesRewrite plugin;

    public onLeave(AnarchyJoinMessagesRewrite plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    void onPlayerLeave(PlayerQuitEvent e) {
        if(plugin.getConfig().getBoolean("leavemessages.sendmessage")) {
            Player player = e.getPlayer();
            String leave = plugin.getConfig().getString("leavemessages.message");
            e.setQuitMessage(ChatColor.translateAlternateColorCodes('&', leave.replace("{player}", player.getDisplayName())));
        }
    }
}

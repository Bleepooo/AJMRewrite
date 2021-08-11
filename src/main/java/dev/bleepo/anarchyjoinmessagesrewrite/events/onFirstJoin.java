package dev.bleepo.anarchyjoinmessagesrewrite.events;

import dev.bleepo.anarchyjoinmessagesrewrite.AnarchyJoinMessagesRewrite;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onFirstJoin implements Listener {
    private final AnarchyJoinMessagesRewrite plugin;

    public onFirstJoin(AnarchyJoinMessagesRewrite plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        if(plugin.getConfig().getBoolean("firstjoin.sendmessage")) {
            Player player = e.getPlayer();
            if(!player.hasPlayedBefore()) {
                String firstjoin = plugin.getConfig().getString("firstjoin.message");
                e.setJoinMessage(ChatColor.translateAlternateColorCodes('&', firstjoin.replace("{player}", player.getDisplayName())));
            }
        }
    }
}

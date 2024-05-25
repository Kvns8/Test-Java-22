package me.kalel.testjava22;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.Material;

public final class Test22 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // startup logic
        System.out.println("Plugin successful");

        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerUse(PlayerInteractEvent event) {
        Player p = event.getPlayer();
        if(p.getItemInHand().getType() == Material.STICK) {
            p.sendMessage("Nice stick");
        }
    }

    @Override
    public void onDisable() {

    }
}

package com.create.creativeCore.ForgeEvent;

import net.minecraftforge.eventbus.api.IEventBus;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public interface ForgeVersion {
    public void register(Object target , boolean bool , JavaPlugin plugin, IEventBus eventBus, Listener listener);
}

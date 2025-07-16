package com.create.creativeCore.ForgeEvent.V1165_ForgeEvent;

import com.create.creativeCore.ForgeEvent.ForgeVersion;
import io.izzel.arclight.api.Arclight;
import net.minecraftforge.eventbus.api.IEventBus;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class registerForge implements ForgeVersion {
    //clazz - Arclight注册的类
    //bool - ture就是Arclight核心，false就是CatServer核心
    //plugin - 你的插件主类
    //eventBus - 可以填NMS的Forge.EVENTS_BUS或者Pixelmon.EVENT_BUS
    //listener - Bukkit的监听
    @Override
    public void register(Object target , boolean bool , JavaPlugin plugin , IEventBus eventBus, Listener listener){
        if (bool){
            Arclight.registerForgeEvent(plugin ,eventBus,target);
        }else {
            Bukkit.getPluginManager().registerEvents(listener,plugin);
        }
    }
}

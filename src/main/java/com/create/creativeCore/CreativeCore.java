package com.create.creativeCore;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class CreativeCore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(ChatColor.YELLOW + "★" + ChatColor.WHITE + " =====创世核心=====");
        System.out.println(ChatColor.YELLOW + "★" + ChatColor.WHITE + " =====" + ChatColor.DARK_GREEN + ChatColor.ITALIC +  "制作人员" + ChatColor.WHITE +"=====");
        System.out.println(ChatColor.YELLOW + "✦" + ChatColor.LIGHT_PURPLE + " 插件作者:" + ChatColor.AQUA + " 天玄");
        System.out.println(ChatColor.YELLOW + "✦" + ChatColor.DARK_AQUA + " 联系方式QQ:" + ChatColor.ITALIC + ChatColor.YELLOW + " 1147958693");
        System.out.println(ChatColor.YELLOW + "★" + ChatColor.WHITE + " =====" + ChatColor.DARK_GREEN + ChatColor.ITALIC + "广告" + ChatColor.WHITE +"=====");
        System.out.println(ChatColor.YELLOW + "✦" + ChatColor.GRAY + " 华欣云: 超强VPS，主打稳定，高频，7*24小时在线");
        System.out.println(ChatColor.YELLOW + "✦" + ChatColor.GRAY + " 创世团队: 插件定制，活动定制，副本定制，剧情定制，技术服务，服务端出售");
        System.out.println(ChatColor.YELLOW + "✦" + ChatColor.RED + " 以上服务都可以联系插件作者!!!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

package com.create.creativeCore.BukkitApi;

import org.bukkit.Bukkit;

public class Version {
    public static String getMCVersion() {
        // 示例返回：git-Paper-416 (MC: 1.16.5)
        String full = Bukkit.getVersion();
        java.util.regex.Matcher m = java.util.regex.Pattern.compile("\\(MC: ([^)]+)\\)").matcher(full);
        if (m.find()) {
            return m.group(1); // 直接得到 1.16.5
        }
        // 备用方式
        String bukkitVer = Bukkit.getBukkitVersion(); // 1.16.5-R0.1-SNAPSHOT
        return bukkitVer.split("-")[0];
    }
}

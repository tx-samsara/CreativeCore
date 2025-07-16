package com.create.creativeCore.BukkitApi;

import org.bukkit.craftbukkit.v1_21_R1.inventory.CraftItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemStack {
    //将Minecraft的物品转为Bukkit的物品
    public static org.bukkit.inventory.ItemStack NMSToBukkit(net.minecraft.world.item.ItemStack stack){
        return CraftItemStack.asBukkitCopy(stack);
    }

    //设置Bukkit物品的属性
    public static org.bukkit.inventory.ItemStack setItemMeta(org.bukkit.inventory.ItemStack stack, String name, List<String> lore) {
        ItemMeta meta = stack.getItemMeta();
        if (meta == null) {
            return stack;
        }
        meta.setDisplayName(name);
        meta.setLore(lore);
        stack.setItemMeta(meta);
        return stack;
    }
}

package com.create.creativeCore.CobblemonApi;

import com.cobblemon.mod.common.api.pokemon.PokemonProperties;
import com.cobblemon.mod.common.item.PokemonItem;
import com.cobblemon.mod.common.pokemon.Pokemon;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.craftbukkit.v1_21_R1.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class PokemonStack {
    public static ItemStack ToBukkitStack(Pokemon pokemon){
        net.minecraft.world.item.ItemStack stack = PokemonItem.from(pokemon);
        return CraftItemStack.asBukkitCopy(stack);
    }

    public static ItemStack ToPicture(ItemStack itemStack, Player player) {
        if (itemStack != null) {
            ItemMeta meta = itemStack.getItemMeta();
            OfflinePlayer player1 = Bukkit.getOfflinePlayer(player.getUniqueId());
            if (meta != null) {
                Pokemon pokemon = PokemonProperties.Companion.parse(meta.getDisplayName()).create();
                ItemStack stack = ToBukkitStack(pokemon);
                ItemMeta meta1 = stack.getItemMeta();
                if (meta1 != null) {
                    meta1.setDisplayName(pokemon.getSpecies().getName());
                    List<String> list = meta.getLore();
                    List<String> lore = new ArrayList<>();
                    lore.add(ChatColor.WHITE + "精灵编号：" +meta.getDisplayName());
                    if (list != null) {
                        for (String l : list) {
                            String ch = PlaceholderAPI.setPlaceholders(player1, l);
                            lore.add(ChatColor.translateAlternateColorCodes('&',ch));
                        }
                        meta1.setLore(lore);
                        stack.setItemMeta(meta1);
                        return stack;
                    }
                }
            }
        }
        return null;
    }
}

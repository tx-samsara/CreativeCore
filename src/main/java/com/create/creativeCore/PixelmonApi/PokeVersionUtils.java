package com.create.creativeCore.PixelmonApi;

import com.pixelmonmod.pixelmon.api.storage.PCStorage;
import com.pixelmonmod.pixelmon.storage.PlayerPartyStorage;
import org.bukkit.entity.Player;

public interface PokeVersionUtils {
    public PlayerPartyStorage getParty(Player player);
    public PCStorage getPC(Player player);
}

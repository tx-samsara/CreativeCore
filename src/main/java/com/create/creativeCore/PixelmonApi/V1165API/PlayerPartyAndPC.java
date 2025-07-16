package com.create.creativeCore.PixelmonApi.V1165API;

import com.create.creativeCore.PixelmonApi.PokeVersionUtils;
import com.pixelmonmod.pixelmon.Pixelmon;
import com.pixelmonmod.pixelmon.api.storage.PCStorage;
import com.pixelmonmod.pixelmon.storage.PlayerPartyStorage;
import org.bukkit.entity.Player;

public class PlayerPartyAndPC implements PokeVersionUtils {
    @Override
    public PlayerPartyStorage getParty(Player player){
        return Pixelmon.storageManager.getParty(player.getUniqueId());
    }
    @Override
    public PCStorage getPC(Player player){
        return Pixelmon.storageManager.getPCForPlayer(player.getUniqueId());
    }
}

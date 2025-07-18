package com.create.creativeCore.PixelmonApi.V1122API;

import com.pixelmonmod.pixelmon.Pixelmon;
import com.pixelmonmod.pixelmon.api.storage.PCStorage;
import com.pixelmonmod.pixelmon.storage.PlayerPartyStorage;
import org.bukkit.entity.Player;

public class PlayerPartyAndPC {
    public static PlayerPartyStorage getParty(Player player){
        return Pixelmon.storageManager.getParty(player.getUniqueId());
    }
    public static PCStorage getPC(Player player){
        return Pixelmon.storageManager.getPCForPlayer(player.getUniqueId());
    }
}

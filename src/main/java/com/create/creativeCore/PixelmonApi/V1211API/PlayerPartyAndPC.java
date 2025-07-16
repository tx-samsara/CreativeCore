package com.create.creativeCore.PixelmonApi.V1211API;

import com.pixelmonmod.pixelmon.api.storage.PCStorage;
import com.pixelmonmod.pixelmon.api.storage.PlayerPartyStorage;
import com.pixelmonmod.pixelmon.api.storage.StorageProxy;

import org.bukkit.entity.Player;

public class PlayerPartyAndPC {
    public static PlayerPartyStorage getParty(Player player) {
        return StorageProxy.getParty(player.getUniqueId());
    }

    public static PCStorage getPC(Player player) {
        return StorageProxy.getPCForPlayer(player.getUniqueId());
    }
}

package com.create.creativeCore.CobblemonApi;

import com.cobblemon.mod.common.Cobblemon;
import com.cobblemon.mod.common.api.storage.party.PlayerPartyStore;
import com.cobblemon.mod.common.api.storage.pc.PCStore;
import com.cobblemon.mod.common.pokemon.Pokemon;
import com.cobblemon.mod.common.util.PlayerExtensionsKt;
import net.minecraft.server.level.ServerPlayer;
import org.bukkit.entity.Player;

public class PlayerPokemonBag {
    public static boolean BagIsEmpty(PlayerPartyStore partyStore){
        for (int i = 0 ; i < 6 ; i++){
            Pokemon pokemon = partyStore.get(i);
            if (pokemon == null){
                return true;
            }
        }
        return false;
    }
    public static PCStore getPCStore(Player player){
        ServerPlayer serverPlayer = PlayerExtensionsKt.getPlayer(player.getUniqueId());
        if (serverPlayer == null){
            return null;
        }
        return Cobblemon.INSTANCE.getStorage().getPC(serverPlayer);
    }
    public static PlayerPartyStore getPartyStory(Player player){
        ServerPlayer serverPlayer = PlayerExtensionsKt.getPlayer(player.getUniqueId());
        if (serverPlayer == null){
            return null;
        }
        return Cobblemon.INSTANCE.getStorage().getParty(serverPlayer);
    }

    public static void PokemonToParty(Pokemon pokemon, PlayerPartyStore partyStore, PCStore pcStore){
        if (partyStore.get(0) == null ||partyStore.get(1) == null ||partyStore.get(2) == null ||partyStore.get(3) == null ||partyStore.get(4) == null ||partyStore.get(5) == null){
            partyStore.add(pokemon);
        }else {
            pcStore.add(pokemon);
        }
    }
}

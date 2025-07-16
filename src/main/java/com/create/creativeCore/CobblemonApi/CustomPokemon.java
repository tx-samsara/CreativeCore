package com.create.creativeCore.CobblemonApi;

import com.cobblemon.mod.common.api.Priority;
import com.cobblemon.mod.common.api.abilities.Abilities;
import com.cobblemon.mod.common.api.abilities.Ability;
import com.cobblemon.mod.common.api.abilities.AbilityTemplate;
import com.cobblemon.mod.common.api.pokemon.Natures;
import com.cobblemon.mod.common.api.pokemon.PokemonProperties;
import com.cobblemon.mod.common.api.pokemon.stats.Stats;
import com.cobblemon.mod.common.pokemon.Nature;
import com.cobblemon.mod.common.pokemon.Pokemon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomPokemon {
    public static boolean isChinesePokeName(String str) {
        String regex = "[\u4e00-\u9fa5]";
        return str.matches(".*" + regex + ".*");
    }

    public static Pokemon PatternPokemon(String args){
        if (isChinesePokeName(args)){
            String name = PokemonName.getChineseName(args);
            if (PokemonName.isPokemonName(name)){
                return PokemonProperties.Companion.parse(name).create();
            }else {
                return null;
            }
        } else if (PokemonName.isPokemonName(args)) {
            return PokemonProperties.Companion.parse(args).create();
        }
        return null;
    }


    public static void setCustomPokemon(Pokemon pokemon, String[] args){
        Pattern shiny1 = Pattern.compile("^闪光:(true|false)$");
        boolean shiny2 = false;
        Pattern Hp = Pattern.compile("血量:(.*)");
        int hp = 0;
        Pattern Gj = Pattern.compile("攻击:(.*)");
        int gj = 0;
        Pattern Fy = Pattern.compile("防御:(.*)");
        int fy = 0;
        Pattern Tg = Pattern.compile("特攻:(.*)");
        int tg = 0;
        Pattern Tf = Pattern.compile("特防:(.*)");
        int tf = 0;
        Pattern Sd = Pattern.compile("速度:(.*)");
        int sd = 0;
        Pattern Dj = Pattern.compile("等级:(.*)");
        int dj = 0;
        Pattern Tx = Pattern.compile("体型:(.*)");
        float tx = 0;
        Pattern Xg = Pattern.compile("性格:(.*)");
        String xg = null;
        Pattern Ab = Pattern.compile("特性:(.*)");
        String ab = null;

        for (String sh : args){
            Matcher matcher = shiny1.matcher(sh);
            Matcher matcher1 = Hp.matcher(sh);
            Matcher matcher2 = Gj.matcher(sh);
            Matcher matcher3 = Fy.matcher(sh);
            Matcher matcher4 = Tg.matcher(sh);
            Matcher matcher5 = Tf.matcher(sh);
            Matcher matcher6 = Sd.matcher(sh);
            Matcher matcher7 = Dj.matcher(sh);
            Matcher matcher8 = Tx.matcher(sh);
            Matcher matcher9 = Xg.matcher(sh);
            Matcher matcher10 = Ab.matcher(sh);
            if (matcher.matches()){
                String value = matcher.group(1);
                shiny2 = Boolean.parseBoolean(value);
            }
            if (matcher1.matches()){
                String value = matcher1.group(1);
                hp = Integer.parseInt(value);
            }
            if (matcher2.matches()){
                String value = matcher2.group(1);
                gj = Integer.parseInt(value);
            }
            if (matcher3.matches()){
                String value = matcher3.group(1);
                fy = Integer.parseInt(value);
            }
            if (matcher4.matches()){
                String value = matcher4.group(1);
                tg = Integer.parseInt(value);
            }
            if (matcher5.matches()){
                String value = matcher5.group(1);
                tf = Integer.parseInt(value);
            }
            if (matcher6.matches()){
                String value = matcher6.group(1);
                sd = Integer.parseInt(value);
            }
            if (matcher7.matches()){
                String value = matcher7.group(1);
                dj = Integer.parseInt(value);
            }
            if(matcher8.matches()){
                String value = matcher8.group(1);
                tx = Float.parseFloat(value);
            }
            if (matcher9.matches()){
                String value = matcher9.group(1);
                if (value == null){
                    return;
                }
                xg = value;
            }
            if (matcher10.matches()){
                String value = matcher10.group(1);
                if (value == null){
                    return;
                }
                ab = value;
            }
        }
        pokemon.setShiny(shiny2);
        if (hp != 0 ){
            pokemon.setIV(Stats.HP,hp);
        }
        if (gj != 0){
            pokemon.setIV(Stats.ATTACK,gj);
        }
        if (fy != 0){
            pokemon.setIV(Stats.DEFENCE,fy);
        }
        if (tg != 0){
            pokemon.setIV(Stats.SPECIAL_ATTACK,tg);
        }
        if (tf != 0){
            pokemon.setIV(Stats.SPECIAL_DEFENCE,tf);
        }
        if (sd != 0){
            pokemon.setIV(Stats.SPEED,sd);
        }
        if (dj != 0){
            pokemon.setLevel(dj);
        }
        if (tx != 0){
            pokemon.setScaleModifier(tx);
        }
        if (xg != null){
            if (isChinesePokeName(xg) && Natrue.isNaturesKey(xg)){
                String n = Natrue.getNatureName(xg);
                Nature natures = Natures.INSTANCE.getNature(n.toLowerCase());
                if (natures != null){
                    pokemon.setNature(natures);
                }
            }else if (Natrue.isNatureName(xg)){
                Nature nature = Natures.INSTANCE.getNature(xg.toLowerCase());
                if (nature != null){
                    pokemon.setNature(nature);
                }
            }
        }
        if (ab != null){
            if (isChinesePokeName(ab) && com.create.creativeCore.CobblemonApi.Ability.isAbilityKey(ab)){
                String a = com.create.creativeCore.CobblemonApi.Ability.getAbilityName(ab);
                AbilityTemplate template = Abilities.INSTANCE.get(a);
                if (template == null){
                    return;
                }
                Ability ability = new Ability(template,true, Priority.HIGHEST);
                pokemon.setAbility$common(ability);
            }else if (com.create.creativeCore.CobblemonApi.Ability.isAbilityName(ab)){
                AbilityTemplate template = Abilities.INSTANCE.get(ab);
                if (template == null){
                    return;
                }
                Ability ability = new Ability(template,true, Priority.HIGHEST);
                pokemon.setAbility$common(ability);
            }
        }
    }
}

package com.create.creativeCore.CobblemonApi;

import java.util.*;

public class Natrue {
    public static final Map<String, String> NATURE_MAP = createNatureMap();

    // 创建包含所有英文名的List
    public static final List<String> NATURE_LIST = createEnglishNameList();

    private static Map<String, String> createNatureMap() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("勤奋", "hardy");
        map.put("怕寂寞", "lonely");
        map.put("勇敢", "brave");
        map.put("固执", "adamant");
        map.put("顽皮", "naughty");
        map.put("大胆", "bold");
        map.put("坦率", "docile");
        map.put("悠闲", "relaxed");
        map.put("淘气", "impish");
        map.put("马虎", "lax");
        map.put("胆小", "timid");
        map.put("急躁", "hasty");
        map.put("认真", "serious");
        map.put("爽朗", "jolly");
        map.put("天真", "naive");
        map.put("内敛", "modest");
        map.put("慢吞吞", "mild");
        map.put("冷静", "quiet");
        map.put("害羞", "bashful");
        map.put("浮躁", "rash");
        map.put("温和", "calm");
        map.put("温顺", "gentle");
        map.put("自大", "sassy");
        map.put("慎重", "careful");
        map.put("古怪", "quirky");
        return Collections.unmodifiableMap(map); // 返回不可修改的Map
    }

    private static List<String> createEnglishNameList() {
        return new ArrayList<>(Arrays.asList(
                "hardy", "lonely", "brave", "adamant", "naughty",
                "bold", "docile", "relaxed", "impish", "lax",
                "timid", "hasty", "serious", "jolly", "naive",
                "modest", "mild", "quiet", "bashful", "rash",
                "calm", "gentle", "sassy", "careful", "quirky"
        ));
    }

    public static String getNatureName(String Name){
        return NATURE_MAP.get(Name);
    }

    public static boolean isNaturesKey(String Natures) {
        return NATURE_MAP.containsKey(Natures);
    }//判断是否有这个值

    public static boolean isNatureName(String Name){
        return NATURE_LIST.contains(Name);
    }
}
/*private static final Map<String, String> NATURE_TRANSLATION_MAP = new HashMap<>();
    private static final List<String> Nature = new ArrayList<>();
    static {
        Nature.add("HARDY");
        Nature.add("LONELY");
        Nature.add("BRAVE");
        Nature.add("ADAMANT");
        Nature.add("NAUGHTY");
        Nature.add("BOLD");
        Nature.add("DOCILE");
        Nature.add("RELAXED");
        Nature.add("IMPISH");
        Nature.add("LAX");
        Nature.add("TIMID");
        Nature.add("HASTY");
        Nature.add("SERIOUS");
        Nature.add("JOLLY");
        Nature.add("NAIVE");
        Nature.add("MODEST");
        Nature.add("MILD");
        Nature.add("QUIET");
        Nature.add("BASHFUL");
        Nature.add("RASH");
        Nature.add("CALM");
        Nature.add("GENTLE");
        Nature.add("SASSY");
        Nature.add("CAREFUL");
        Nature.add("QUIRKY");
    }

    static {
        // 初始化中英文对照表
        NATURE_TRANSLATION_MAP.put("勤奋", "HARDY");
        NATURE_TRANSLATION_MAP.put("孤独", "LONELY");
        NATURE_TRANSLATION_MAP.put("勇敢", "BRAVE");
        NATURE_TRANSLATION_MAP.put("固执", "ADAMANT");
        NATURE_TRANSLATION_MAP.put("顽皮", "NAUGHTY");
        NATURE_TRANSLATION_MAP.put("大胆", "BOLD");
        NATURE_TRANSLATION_MAP.put("坦率", "DOCILE");
        NATURE_TRANSLATION_MAP.put("悠闲", "RELAXED");
        NATURE_TRANSLATION_MAP.put("淘气", "IMPISH");
        NATURE_TRANSLATION_MAP.put("乐天", "LAX");
        NATURE_TRANSLATION_MAP.put("胆小", "TIMID");
        NATURE_TRANSLATION_MAP.put("急躁", "HASTY");
        NATURE_TRANSLATION_MAP.put("认真", "SERIOUS");
        NATURE_TRANSLATION_MAP.put("爽朗", "JOLLY");
        NATURE_TRANSLATION_MAP.put("天真", "NAIVE");
        NATURE_TRANSLATION_MAP.put("内敛", "MODEST");
        NATURE_TRANSLATION_MAP.put("慢吞吞", "MILD");
        NATURE_TRANSLATION_MAP.put("冷静", "QUIET");
        NATURE_TRANSLATION_MAP.put("害羞", "BASHFUL");
        NATURE_TRANSLATION_MAP.put("马虎", "RASH");
        NATURE_TRANSLATION_MAP.put("温和", "CALM");
        NATURE_TRANSLATION_MAP.put("温顺", "GENTLE");
        NATURE_TRANSLATION_MAP.put("自大", "SASSY");
        NATURE_TRANSLATION_MAP.put("慎重", "CAREFUL");
        NATURE_TRANSLATION_MAP.put("浮躁", "QUIRKY");
    }

    public static String getNatureName(String Natures) {
        return NATURE_TRANSLATION_MAP.get(Natures);
    }//中文变英文

    public static boolean isNaturesKey(String Natures) {
        return NATURE_TRANSLATION_MAP.containsKey(Natures);
    }//判断是否有这个值

    public static boolean isNaturesValue(String Natures){
        return Nature.contains(Natures);
    }//判断性格中是否有这个值
*/
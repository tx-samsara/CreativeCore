package com.create.creativeCore.CobblemonApi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ability {
    public static final List<String> ABILITIES = Arrays.asList(
                "Noability",
                "Adaptability",
                "Aerilate",
                "Aftermath",
                "Airlock",
                "Analytic",
                "Angerpoint",
                "Angershell",
                "Anticipation",
                "Arenatrap",
                "Armortail",
                "Aromaveil",
                "Asoneglastrier",
                "Asonespectrier",
                "Aurabreak",
                "Baddreams",
                "Ballfetch",
                "Battery",
                "Battlearmor",
                "Battlebond",
                "Beadsofruin",
                "Beastboost",
                "Berserk",
                "Bigpecks",
                "Blaze",
                "Bulletproof",
                "Cheekpouch",
                "Chillingneigh",
                "Chlorophyll",
                "Clearbody",
                "Cloudnine",
                "Colorchange",
                "Comatose",
                "Commander",
                "Competitive",
                "Compoundeyes",
                "Contrary",
                "Corrosion",
                "Costar",
                "Cottondown",
                "Cudchew",
                "Curiousmedicine",
                "Cursedbody",
                "Cutecharm",
                "Damp",
                "Dancer",
                "Darkaura",
                "Dauntlessshield",
                "Dazzling",
                "Defeatist",
                "Defiant",
                "Deltastream",
                "Desolateland",
                "Disguise",
                "Download",
                "Dragonsmaw",
                "Drizzle",
                "Drought",
                "Dryskin",
                "Earlybird",
                "Eartheater",
                "Effectspore",
                "Electricsurge",
                "Electromorphosis",
                "Embodyaspectcornerstone",
                "Embodyaspecthearthflame",
                "Embodyaspectteal",
                "Embodyaspectwellspring",
                "Emergencyexit",
                "Fairyaura",
                "Filter",
                "Flamebody",
                "Flareboost",
                "Flashfire",
                "Flowergift",
                "Flowerveil",
                "Fluffy",
                "Forecast",
                "Forewarn",
                "Friendguard",
                "Frisk",
                "Fullmetalbody",
                "Furcoat",
                "Galewings",
                "Galvanize",
                "Gluttony",
                "Goodasgold",
                "Gooey",
                "Gorillatactics",
                "Grasspelt",
                "Grassysurge",
                "Grimneigh",
                "Guarddog",
                "Gulpmissile",
                "Guts",
                "Hadronengine",
                "Harvest",
                "Healer",
                "Heatproof",
                "Heavymetal",
                "Honeygather",
                "Hospitality",
                "Hugepower",
                "Hungerswitch",
                "Hustle",
                "Hydration",
                "Hypercutter",
                "Icebody",
                "Iceface",
                "Icescales",
                "Illuminate",
                "Illusion",
                "Immunity",
                "Imposter",
                "Infiltrator",
                "Innardsout",
                "Innerfocus",
                "Insomnia",
                "Intimidate",
                "Intrepidsword",
                "Ironbarbs",
                "Ironfist",
                "Justified",
                "Keeneye",
                "Klutz",
                "Leafguard",
                "Levitate",
                "Libero",
                "Lightmetal",
                "Lightningrod",
                "Limber",
                "Lingeringaroma",
                "Liquidooze",
                "Liquidvoice",
                "Longreach",
                "Magicbounce",
                "Magicguard",
                "Magician",
                "Magmaarmor",
                "Magnetpull",
                "Marvelscale",
                "Megalauncher",
                "Merciless",
                "Mimicry",
                "Mindseye",
                "Minus",
                "Mirrorarmor",
                "Mistysurge",
                "Moldbreaker",
                "Moody",
                "Motordrive",
                "Moxie",
                "Multiscale",
                "Multitype",
                "Mummy",
                "Myceliummight",
                "Naturalcure",
                "Neuroforce",
                "Neutralizinggas",
                "Noguard",
                "Normalize",
                "Oblivious",
                "Opportunist",
                "Orichalcumpulse",
                "Overcoat",
                "Overgrow",
                "Owntempo",
                "Parentalbond",
                "Pastelveil",
                "Perishbody",
                "Pickpocket",
                "Pickup",
                "Pixilate",
                "Plus",
                "Poisonheal",
                "Poisonpoint",
                "Poisonpuppeteer",
                "Poisontouch",
                "Powerconstruct",
                "Powerofalchemy",
                "Powerspot",
                "Prankster",
                "Pressure",
                "Primordialsea",
                "Prismarmor",
                "Propellertail",
                "Protean",
                "Protosynthesis",
                "Psychicsurge",
                "Punkrock",
                "Purepower",
                "Purifyingsalt",
                "Quarkdrive",
                "Queenlymajesty",
                "Quickdraw",
                "Quickfeet",
                "Raindish",
                "Rattled",
                "Receiver",
                "Reckless",
                "Refrigerate",
                "Regenerator",
                "Ripen",
                "Rivalry",
                "Rkssystem",
                "Rockhead",
                "Rockypayload",
                "Roughskin",
                "Runaway",
                "Sandforce",
                "Sandrush",
                "Sandspit",
                "Sandstream",
                "Sandveil",
                "Sapsipper",
                "Schooling",
                "Scrappy",
                "Screencleaner",
                "Seedsower",
                "Serenegrace",
                "Shadowshield",
                "Shadowtag",
                "Sharpness",
                "Shedskin",
                "Sheerforce",
                "Shellarmor",
                "Shielddust",
                "Shieldsdown",
                "Simple",
                "Skilllink",
                "Slowstart",
                "Slushrush",
                "Sniper",
                "Snowcloak",
                "Snowwarning",
                "Solarpower",
                "Solidrock",
                "Soulheart",
                "Soundproof",
                "Speedboost",
                "Stakeout",
                "Stall",
                "Stalwart",
                "Stamina",
                "Stancechange",
                "Static",
                "Steadfast",
                "Steamengine",
                "Steelworker",
                "Steelyspirit",
                "Stench",
                "Stickyhold",
                "Stormdrain",
                "Strongjaw",
                "Sturdy",
                "Suctioncups",
                "Superluck",
                "Supersweetsyrup",
                "Supremeoverlord",
                "Surgesurfer",
                "Swarm",
                "Sweetveil",
                "Swiftswim",
                "Symbiosis",
                "Synchronize",
                "Swordofruin",
                "Tabletsofruin",
                "Tangledfeet",
                "Tanglinghair",
                "Technician",
                "Telepathy",
                "Teraformzero",
                "Terashell",
                "Terashift",
                "Teravolt",
                "Thermalexchange",
                "Thickfat",
                "Tintedlens",
                "Torrent",
                "Toughclaws",
                "Toxicboost",
                "Toxicchain",
                "Toxicdebris",
                "Trace",
                "Transistor",
                "Triage",
                "Truant",
                "Turboblaze",
                "Unaware",
                "Unburden",
                "Unnerve",
                "Unseenfist",
                "Vesselofruin",
                "Victorystar",
                "Vitalspirit",
                "Voltabsorb",
                "Wanderingspirit",
                "Waterabsorb",
                "Waterbubble",
                "Watercompaction",
                "Waterveil",
                "Weakarmor",
                "Wellbakedbody",
                "Whitesmoke",
                "Wimpout",
                "Windpower",
                "Windrider",
                "Wonderguard",
                "Wonderskin",
                "Zenmode",
                "Zerotohero",
                "Mountaineer",
                "Rebound",
                "Persistent"
        );
    public static final Map<String, String> ABILITY_MAP = new HashMap<>();
    static {
        ABILITY_MAP.put("无特性", "Noability");
        ABILITY_MAP.put("适应力", "Adaptability");
        ABILITY_MAP.put("飞行皮肤", "Aerilate");
        ABILITY_MAP.put("引爆", "Aftermath");
        ABILITY_MAP.put("气闸", "Airlock");
        ABILITY_MAP.put("分析", "Analytic");
        ABILITY_MAP.put("愤怒穴位", "Angerpoint");
        ABILITY_MAP.put("愤怒甲壳", "Angershell");
        ABILITY_MAP.put("危险预知", "Anticipation");
        ABILITY_MAP.put("沙穴", "Arenatrap");
        ABILITY_MAP.put("防弹护具", "Armortail");
        ABILITY_MAP.put("芳香幕", "Aromaveil");
        ABILITY_MAP.put("人马一体（雪暴马）", "Asoneglastrier");
        ABILITY_MAP.put("人马一体（灵幽马）", "Asonespectrier");
        ABILITY_MAP.put("气场破坏", "Aurabreak");
        ABILITY_MAP.put("梦魇", "Baddreams");
        ABILITY_MAP.put("捡球", "Ballfetch");
        ABILITY_MAP.put("蓄电池", "Battery");
        ABILITY_MAP.put("战斗盔甲", "Battlearmor");
        ABILITY_MAP.put("牵绊变身", "Battlebond");
        ABILITY_MAP.put("灾祸之玉", "Beadsofruin");
        ABILITY_MAP.put("异兽提升", "Beastboost");
        ABILITY_MAP.put("怒火冲天", "Berserk");
        ABILITY_MAP.put("健壮胸肌", "Bigpecks");
        ABILITY_MAP.put("猛火", "Blaze");
        ABILITY_MAP.put("防弹", "Bulletproof");
        ABILITY_MAP.put("颊囊", "Cheekpouch");
        ABILITY_MAP.put("苍白嘶鸣", "Chillingneigh");
        ABILITY_MAP.put("叶绿素", "Chlorophyll");
        ABILITY_MAP.put("恒净之躯", "Clearbody");
        ABILITY_MAP.put("无关天气", "Cloudnine");
        ABILITY_MAP.put("变色", "Colorchange");
        ABILITY_MAP.put("绝对睡眠", "Comatose");
        ABILITY_MAP.put("发号施令", "Commander");
        ABILITY_MAP.put("好胜", "Competitive");
        ABILITY_MAP.put("复眼", "Compoundeyes");
        ABILITY_MAP.put("唱反调", "Contrary");
        ABILITY_MAP.put("腐蚀", "Corrosion");
        ABILITY_MAP.put("同台共演", "Costar");
        ABILITY_MAP.put("棉絮", "Cottondown");
        ABILITY_MAP.put("反刍", "Cudchew");
        ABILITY_MAP.put("新鲜疗法", "Curiousmedicine");
        ABILITY_MAP.put("诅咒之躯", "Cursedbody");
        ABILITY_MAP.put("迷人之躯", "Cutecharm");
        ABILITY_MAP.put("湿气", "Damp");
        ABILITY_MAP.put("舞者", "Dancer");
        ABILITY_MAP.put("暗黑气场", "Darkaura");
        ABILITY_MAP.put("不挠之盾", "Dauntlessshield");
        ABILITY_MAP.put("鲜艳之躯", "Dazzling");
        ABILITY_MAP.put("软弱", "Defeatist");
        ABILITY_MAP.put("不服输", "Defiant");
        ABILITY_MAP.put("德尔塔气流", "Deltastream");
        ABILITY_MAP.put("终结之地", "Desolateland");
        ABILITY_MAP.put("画皮", "Disguise");
        ABILITY_MAP.put("下载", "Download");
        ABILITY_MAP.put("龙颚", "Dragonsmaw");
        ABILITY_MAP.put("降雨", "Drizzle");
        ABILITY_MAP.put("日照", "Drought");
        ABILITY_MAP.put("干燥皮肤", "Dryskin");
        ABILITY_MAP.put("早起", "Earlybird");
        ABILITY_MAP.put("食土", "Eartheater");
        ABILITY_MAP.put("孢子", "Effectspore");
        ABILITY_MAP.put("电气场地", "Electricsurge");
        ABILITY_MAP.put("蓄电plus", "Electromorphosis");
        ABILITY_MAP.put("化身形态（基石）", "Embodyaspectcornerstone");
        ABILITY_MAP.put("化身形态（炉火）", "Embodyaspecthearthflame");
        ABILITY_MAP.put("化身形态（青蓝）", "Embodyaspectteal");
        ABILITY_MAP.put("化身形态（涌泉）", "Embodyaspectwellspring");
        ABILITY_MAP.put("危险回避", "Emergencyexit");
        ABILITY_MAP.put("妖精气场", "Fairyaura");
        ABILITY_MAP.put("过滤", "Filter");
        ABILITY_MAP.put("火焰之躯", "Flamebody");
        ABILITY_MAP.put("受热激升", "Flareboost");
        ABILITY_MAP.put("引火", "Flashfire");
        ABILITY_MAP.put("花之礼", "Flowergift");
        ABILITY_MAP.put("花幕", "Flowerveil");
        ABILITY_MAP.put("毛茸茸", "Fluffy");
        ABILITY_MAP.put("阴晴不定", "Forecast");
        ABILITY_MAP.put("预知梦", "Forewarn");
        ABILITY_MAP.put("友情防守", "Friendguard");
        ABILITY_MAP.put("察觉", "Frisk");
        ABILITY_MAP.put("金属防护", "Fullmetalbody");
        ABILITY_MAP.put("毛皮大衣", "Furcoat");
        ABILITY_MAP.put("疾风之翼", "Galewings");
        ABILITY_MAP.put("电气皮肤", "Galvanize");
        ABILITY_MAP.put("贪吃鬼", "Gluttony");
        ABILITY_MAP.put("黄金之躯", "Goodasgold");
        ABILITY_MAP.put("黏滑", "Gooey");
        ABILITY_MAP.put("一猩一意", "Gorillatactics");
        ABILITY_MAP.put("草之毛皮", "Grasspelt");
        ABILITY_MAP.put("青草场地", "Grassysurge");
        ABILITY_MAP.put("漆黑嘶鸣", "Grimneigh");
        ABILITY_MAP.put("看门犬", "Guarddog");
        ABILITY_MAP.put("一口导弹", "Gulpmissile");
        ABILITY_MAP.put("毅力", "Guts");
        ABILITY_MAP.put("强子引擎", "Hadronengine");
        ABILITY_MAP.put("收获", "Harvest");
        ABILITY_MAP.put("治愈之心plus", "Healer");
        ABILITY_MAP.put("耐热", "Heatproof");
        ABILITY_MAP.put("重金属", "Heavymetal");
        ABILITY_MAP.put("采蜜", "Honeygather");
        ABILITY_MAP.put("款待", "Hospitality");
        ABILITY_MAP.put("大力士", "Hugepower");
        ABILITY_MAP.put("饱了又饿", "Hungerswitch");
        ABILITY_MAP.put("活力", "Hustle");
        ABILITY_MAP.put("湿润之躯", "Hydration");
        ABILITY_MAP.put("怪力钳", "Hypercutter");
        ABILITY_MAP.put("冰冻之躯", "Icebody");
        ABILITY_MAP.put("结冻头", "Iceface");
        ABILITY_MAP.put("冰鳞粉", "Icescales");
        ABILITY_MAP.put("发光", "Illuminate");
        ABILITY_MAP.put("幻觉", "Illusion");
        ABILITY_MAP.put("免疫", "Immunity");
        ABILITY_MAP.put("变身者", "Imposter");
        ABILITY_MAP.put("穿透", "Infiltrator");
        ABILITY_MAP.put("飞出的内在物", "Innardsout");
        ABILITY_MAP.put("精神力", "Innerfocus");
        ABILITY_MAP.put("不眠", "Insomnia");
        ABILITY_MAP.put("威吓", "Intimidate");
        ABILITY_MAP.put("不挠之剑", "Intrepidsword");
        ABILITY_MAP.put("铁刺", "Ironbarbs");
        ABILITY_MAP.put("铁拳", "Ironfist");
        ABILITY_MAP.put("正义之心", "Justified");
        ABILITY_MAP.put("锐利目光", "Keeneye");
        ABILITY_MAP.put("笨拙", "Klutz");
        ABILITY_MAP.put("叶子防守", "Leafguard");
        ABILITY_MAP.put("漂浮", "Levitate");
        ABILITY_MAP.put("自由者", "Libero");
        ABILITY_MAP.put("轻金属", "Lightmetal");
        ABILITY_MAP.put("避雷针", "Lightningrod");
        ABILITY_MAP.put("柔软", "Limber");
        ABILITY_MAP.put("甩不掉的气味", "Lingeringaroma");
        ABILITY_MAP.put("污泥浆", "Liquidooze");
        ABILITY_MAP.put("湿响之音", "Liquidvoice");
        ABILITY_MAP.put("远隔", "Longreach");
        ABILITY_MAP.put("魔法镜", "Magicbounce");
        ABILITY_MAP.put("魔法防守", "Magicguard");
        ABILITY_MAP.put("魔术师", "Magician");
        ABILITY_MAP.put("熔岩铠甲", "Magmaarmor");
        ABILITY_MAP.put("磁力", "Magnetpull");
        ABILITY_MAP.put("神奇鳞片", "Marvelscale");
        ABILITY_MAP.put("超级发射器", "Megalauncher");
        ABILITY_MAP.put("硬爪plus", "Merciless");
        ABILITY_MAP.put("拟态", "Mimicry");
        ABILITY_MAP.put("心眼", "Mindseye");
        ABILITY_MAP.put("负电", "Minus");
        ABILITY_MAP.put("镜甲", "Mirrorarmor");
        ABILITY_MAP.put("薄雾场地", "Mistysurge");
        ABILITY_MAP.put("破格", "Moldbreaker");
        ABILITY_MAP.put("心情不定", "Moody");
        ABILITY_MAP.put("电气引擎", "Motordrive");
        ABILITY_MAP.put("自信过度", "Moxie");
        ABILITY_MAP.put("多重鳞片", "Multiscale");
        ABILITY_MAP.put("多元属性", "Multitype");
        ABILITY_MAP.put("木乃伊", "Mummy");
        ABILITY_MAP.put("菌丝之力", "Myceliummight");
        ABILITY_MAP.put("自然回复", "Naturalcure");
        ABILITY_MAP.put("脑核之力", "Neuroforce");
        ABILITY_MAP.put("化学变化气体", "Neutralizinggas");
        ABILITY_MAP.put("无防守", "Noguard");
        ABILITY_MAP.put("一般皮肤", "Normalize");
        ABILITY_MAP.put("迟钝", "Oblivious");
        ABILITY_MAP.put("乘机", "Opportunist");
        ABILITY_MAP.put("古代活性plus", "Orichalcumpulse");
        ABILITY_MAP.put("防尘plus", "Overcoat");
        ABILITY_MAP.put("茂盛", "Overgrow");
        ABILITY_MAP.put("我行我素", "Owntempo");
        ABILITY_MAP.put("亲子爱", "Parentalbond");
        ABILITY_MAP.put("粉彩护幕", "Pastelveil");
        ABILITY_MAP.put("灭亡之躯", "Perishbody");
        ABILITY_MAP.put("顺手牵羊", "Pickpocket");
        ABILITY_MAP.put("捡拾", "Pickup");
        ABILITY_MAP.put("妖精皮肤", "Pixilate");
        ABILITY_MAP.put("正电", "Plus");
        ABILITY_MAP.put("毒疗", "Poisonheal");
        ABILITY_MAP.put("毒刺", "Poisonpoint");
        ABILITY_MAP.put("毒傀儡", "Poisonpuppeteer");
        ABILITY_MAP.put("毒手", "Poisontouch");
        ABILITY_MAP.put("群聚变形", "Powerconstruct");
        ABILITY_MAP.put("化学之力", "Powerofalchemy");
        ABILITY_MAP.put("能量点", "Powerspot");
        ABILITY_MAP.put("恶作剧之心", "Prankster");
        ABILITY_MAP.put("压迫感", "Pressure");
        ABILITY_MAP.put("始源之海", "Primordialsea");
        ABILITY_MAP.put("棱镜装甲", "Prismarmor");
        ABILITY_MAP.put("螺旋尾鳍", "Propellertail");
        ABILITY_MAP.put("变幻自如", "Protean");
        ABILITY_MAP.put("古代活性", "Protosynthesis");
        ABILITY_MAP.put("精神场地", "Psychicsurge");
        ABILITY_MAP.put("庞克摇滚", "Punkrock");
        ABILITY_MAP.put("瑜伽之力", "Purepower");
        ABILITY_MAP.put("洁净之盐", "Purifyingsalt");
        ABILITY_MAP.put("夸克充能", "Quarkdrive");
        ABILITY_MAP.put("女王的威严", "Queenlymajesty");
        ABILITY_MAP.put("快速射击", "Quickdraw");
        ABILITY_MAP.put("飞毛腿", "Quickfeet");
        ABILITY_MAP.put("雨盘", "Raindish");
        ABILITY_MAP.put("胆怯", "Rattled");
        ABILITY_MAP.put("接球手", "Receiver");
        ABILITY_MAP.put("舍身", "Reckless");
        ABILITY_MAP.put("冰冻皮肤", "Refrigerate");
        ABILITY_MAP.put("再生力", "Regenerator");
        ABILITY_MAP.put("熟成", "Ripen");
        ABILITY_MAP.put("斗争心", "Rivalry");
        ABILITY_MAP.put("AR系统", "Rkssystem");
        ABILITY_MAP.put("坚硬脑袋", "Rockhead");
        ABILITY_MAP.put("岩石发射器", "Rockypayload");
        ABILITY_MAP.put("粗糙皮肤", "Roughskin");
        ABILITY_MAP.put("逃足", "Runaway");
        ABILITY_MAP.put("沙之力", "Sandforce");
        ABILITY_MAP.put("拨沙", "Sandrush");
        ABILITY_MAP.put("吐沙", "Sandspit");
        ABILITY_MAP.put("扬沙", "Sandstream");
        ABILITY_MAP.put("沙隐", "Sandveil");
        ABILITY_MAP.put("食草", "Sapsipper");
        ABILITY_MAP.put("鱼群", "Schooling");
        ABILITY_MAP.put("胆量", "Scrappy");
        ABILITY_MAP.put("除障", "Screencleaner");
        ABILITY_MAP.put("掉出种子", "Seedsower");
        ABILITY_MAP.put("天恩", "Serenegrace");
        ABILITY_MAP.put("阴影守护", "Shadowshield");
        ABILITY_MAP.put("踩影", "Shadowtag");
        ABILITY_MAP.put("锋锐", "Sharpness");
        ABILITY_MAP.put("蜕皮", "Shedskin");
        ABILITY_MAP.put("强行", "Sheerforce");
        ABILITY_MAP.put("硬壳盔甲", "Shellarmor");
        ABILITY_MAP.put("防尘", "Shielddust");
        ABILITY_MAP.put("界限盾壳", "Shieldsdown");
        ABILITY_MAP.put("纯朴plus", "Simple");
        ABILITY_MAP.put("连续攻击", "Skilllink");
        ABILITY_MAP.put("慢启动", "Slowstart");
        ABILITY_MAP.put("拨雪", "Slushrush");
        ABILITY_MAP.put("狙击手", "Sniper");
        ABILITY_MAP.put("雪隐", "Snowcloak");
        ABILITY_MAP.put("降雪", "Snowwarning");
        ABILITY_MAP.put("太阳之力", "Solarpower");
        ABILITY_MAP.put("坚硬岩石", "Solidrock");
        ABILITY_MAP.put("魂心", "Soulheart");
        ABILITY_MAP.put("隔音", "Soundproof");
        ABILITY_MAP.put("加速", "Speedboost");
        ABILITY_MAP.put("蹲守", "Stakeout");
        ABILITY_MAP.put("慢出", "Stall");
        ABILITY_MAP.put("坚毅", "Stalwart");
        ABILITY_MAP.put("持久力", "Stamina");
        ABILITY_MAP.put("战斗切换", "Stancechange");
        ABILITY_MAP.put("静电", "Static");
        ABILITY_MAP.put("不屈之心", "Steadfast");
        ABILITY_MAP.put("蒸汽机", "Steamengine");
        ABILITY_MAP.put("钢之意志plus", "Steelworker");
        ABILITY_MAP.put("钢之意志", "Steelyspirit");
        ABILITY_MAP.put("恶臭", "Stench");
        ABILITY_MAP.put("黏着", "Stickyhold");
        ABILITY_MAP.put("引水", "Stormdrain");
        ABILITY_MAP.put("强壮之颚", "Strongjaw");
        ABILITY_MAP.put("结实", "Sturdy");
        ABILITY_MAP.put("吸盘", "Suctioncups");
        ABILITY_MAP.put("超幸运", "Superluck");
        ABILITY_MAP.put("甘露蜜", "Supersweetsyrup");
        ABILITY_MAP.put("大将", "Supremeoverlord");
        ABILITY_MAP.put("冲浪之尾", "Surgesurfer");
        ABILITY_MAP.put("虫之预感", "Swarm");
        ABILITY_MAP.put("甜幕", "Sweetveil");
        ABILITY_MAP.put("悠游自如", "Swiftswim");
        ABILITY_MAP.put("共生", "Symbiosis");
        ABILITY_MAP.put("同步", "Synchronize");
        ABILITY_MAP.put("灾祸之剑", "Swordofruin");
        ABILITY_MAP.put("灾祸之简", "Tabletsofruin");
        ABILITY_MAP.put("蹒跚", "Tangledfeet");
        ABILITY_MAP.put("卷发", "Tanglinghair");
        ABILITY_MAP.put("技术高手", "Technician");
        ABILITY_MAP.put("心灵感应", "Telepathy");
        ABILITY_MAP.put("归零化境", "Teraformzero");
        ABILITY_MAP.put("太晶甲壳", "Terashell");
        ABILITY_MAP.put("太晶变形", "Terashift");
        ABILITY_MAP.put("兆级电压", "Teravolt");
        ABILITY_MAP.put("热交换", "Thermalexchange");
        ABILITY_MAP.put("厚脂肪", "Thickfat");
        ABILITY_MAP.put("有色眼镜", "Tintedlens");
        ABILITY_MAP.put("激流", "Torrent");
        ABILITY_MAP.put("硬爪", "Toughclaws");
        ABILITY_MAP.put("中毒激升", "Toxicboost");
        ABILITY_MAP.put("剧毒锁链", "Toxicchain");
        ABILITY_MAP.put("毒满地", "Toxicdebris");
        ABILITY_MAP.put("复制", "Trace");
        ABILITY_MAP.put("电晶体", "Transistor");
        ABILITY_MAP.put("治愈之心", "Triage");
        ABILITY_MAP.put("懒惰", "Truant");
        ABILITY_MAP.put("涡轮火焰", "Turboblaze");
        ABILITY_MAP.put("纯朴", "Unaware");
        ABILITY_MAP.put("轻装", "Unburden");
        ABILITY_MAP.put("紧张感", "Unnerve");
        ABILITY_MAP.put("无形拳", "Unseenfist");
        ABILITY_MAP.put("灾祸之壶", "Vesselofruin");
        ABILITY_MAP.put("胜利之星", "Victorystar");
        ABILITY_MAP.put("干劲", "Vitalspirit");
        ABILITY_MAP.put("蓄电", "Voltabsorb");
        ABILITY_MAP.put("游魂", "Wanderingspirit");
        ABILITY_MAP.put("储水", "Waterabsorb");
        ABILITY_MAP.put("水泡", "Waterbubble");
        ABILITY_MAP.put("遇水凝固", "Watercompaction");
        ABILITY_MAP.put("水幕", "Waterveil");
        ABILITY_MAP.put("碎裂铠甲", "Weakarmor");
        ABILITY_MAP.put("焦香之躯", "Wellbakedbody");
        ABILITY_MAP.put("白色烟雾", "Whitesmoke");
        ABILITY_MAP.put("怯懦", "Wimpout");
        ABILITY_MAP.put("风力发电", "Windpower");
        ABILITY_MAP.put("乘风", "Windrider");
        ABILITY_MAP.put("神奇守护", "Wonderguard");
        ABILITY_MAP.put("奇迹皮肤", "Wonderskin");
        ABILITY_MAP.put("达摩模式", "Zenmode");
        ABILITY_MAP.put("全能变身", "Zerotohero");
        ABILITY_MAP.put("登山客", "Mountaineer");
        ABILITY_MAP.put("反弹", "Rebound");
        ABILITY_MAP.put("持久", "Persistent");
    }
    public static String getAbilityName(String ChineseName){
        return ABILITY_MAP.get(ChineseName);
    }

    public static boolean isAbilityKey(String ChineseName){
        return ABILITY_MAP.containsKey(ChineseName);
    }

    public static boolean isAbilityName(String Name){
        return ABILITIES.contains(Name);
    }
}

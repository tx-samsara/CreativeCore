package com.create.creativeCore.CobblemonApi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PokemonName {
        private static Map<String, String> pokemonMap = new HashMap<>();
        static {
            pokemonMap.put("小拳石", "Geodude");
            pokemonMap.put("代拉基翁", "Terrakion");
            pokemonMap.put("长翅鸥", "Wingull");
            pokemonMap.put("甲壳茧", "Silcoon");
            pokemonMap.put("超力王", "Hariyama");
            pokemonMap.put("阿勃梭鲁", "Absol");
            pokemonMap.put("光电伞蜥", "Heliolisk");
            pokemonMap.put("盐石宝", "Nacli");
            pokemonMap.put("玛瑙水母", "Tentacool");
            pokemonMap.put("超梦", "Mewtwo");
            pokemonMap.put("聒噪鸟", "Chatot");
            pokemonMap.put("沙螺蟒", "Sandaconda");
            pokemonMap.put("吼叫尾", "Scream tail");
            pokemonMap.put("轻飘飘", "Frillish");
            pokemonMap.put("美丽花", "Bellossom");
            pokemonMap.put("哎呀球菇", "Foongus");
            pokemonMap.put("索罗亚", "Zorua");
            pokemonMap.put("过动猿", "Vigoroth");
            pokemonMap.put("原野水母", "Toedscool");
            pokemonMap.put("闪焰王牌", "Cinderace");
            pokemonMap.put("普隆隆姆", "Revavroom");
            pokemonMap.put("螺钉地鼠", "Drilbur");
            pokemonMap.put("泥偶小人", "Golett");
            pokemonMap.put("喵喵", "Meowth");
            pokemonMap.put("石居蟹", "Dwebble");
            pokemonMap.put("电击兽", "Electabuzz");
            pokemonMap.put("修建老匠", "Conkeldurr");
            pokemonMap.put("玛狃拉", "Weavile");
            pokemonMap.put("姆克儿", "Starly");
            pokemonMap.put("嘟嘟利", "Dodrio");
            pokemonMap.put("哈力栗", "Chespin");
            pokemonMap.put("胖胖哈力", "Quilladin");
            pokemonMap.put("变隐龙", "Kecleon");
            pokemonMap.put("蜈蚣王", "Scolipede");
            pokemonMap.put("诅咒娃娃", "Banette");
            pokemonMap.put("刺尾虫", "Wurmple");
            pokemonMap.put("热辣娃", "Capsakid");
            pokemonMap.put("随风球", "Drifblim");
            pokemonMap.put("土地云", "Landorus");
            pokemonMap.put("冻脊龙", "Arctibax");
            pokemonMap.put("土台龟", "Torterra");
            pokemonMap.put("好胜毛蟹", "Crabominable");
            pokemonMap.put("纸御剑", "Kartana");
            pokemonMap.put("蜂女王", "Vespiquen");
            pokemonMap.put("榛果球", "Pineco");
            pokemonMap.put("小火龙", "Charmander");
            pokemonMap.put("花舞鸟", "Oricorio");
            pokemonMap.put("哈约克", "Herdier");
            pokemonMap.put("保姆曼波", "Alomomola");
            pokemonMap.put("齿轮儿", "Klink");
            pokemonMap.put("首席天鹅", "Swanna");
            pokemonMap.put("化石翼龙", "Aerodactyl");
            pokemonMap.put("派拉斯特", "Parasect");
            pokemonMap.put("流氓鳄", "Krookodile");
            pokemonMap.put("心鳞宝", "Jangmo-o");
            pokemonMap.put("颤弦蝾螈", "Toxtricity");
            pokemonMap.put("尼多后", "Nidoqueen");
            pokemonMap.put("熊宝宝", "Teddiursa");
            pokemonMap.put("哥德小姐", "Gothitelle");
            pokemonMap.put("大奶罐", "Miltank");
            pokemonMap.put("坚果哑铃", "Ferrothorn");
            pokemonMap.put("双首暴龙", "Zweilous");
            pokemonMap.put("双弹瓦斯", "Weezing");
            pokemonMap.put("斯魔茶", "Shroodle");
            pokemonMap.put("魔灵珊瑚", "Cursola");
            pokemonMap.put("飘飘球", "Drifloon");
            pokemonMap.put("臭鼬噗", "Stunky");
            pokemonMap.put("下石鸟", "Flittle");
            pokemonMap.put("三首恶龙", "Hydreigon");
            pokemonMap.put("青铜钟", "Bronzong");
            pokemonMap.put("龙虾小兵", "Corphish");
            pokemonMap.put("铁螯龙虾", "Crawdaunt");
            pokemonMap.put("搬运小匠", "Timburr");
            pokemonMap.put("尾立", "Sentret");
            pokemonMap.put("吞食兽", "Swalot");
            pokemonMap.put("小灰怪", "Elgyem");
            pokemonMap.put("闪电鸟", "Zapdos");
            pokemonMap.put("伪螳草", "Fomantis");
            pokemonMap.put("白海狮", "Dewgong");
            pokemonMap.put("劈斧螳螂", "Kleavor");
            pokemonMap.put("龟足巨铠", "Barbaracle");
            pokemonMap.put("向日种子", "Sunkern");
            pokemonMap.put("啃果虫", "Applin");
            pokemonMap.put("泡芙舔", "Slurpuff");
            pokemonMap.put("水跃鱼", "Mudkip");
            pokemonMap.put("鸭嘴火兽", "Magmar");
            pokemonMap.put("超坏星", "Overqwil");
            pokemonMap.put("绿毛虫", "Caterpie");
            pokemonMap.put("大葱鸭", "Farfetch'd");
            pokemonMap.put("灯罩夜菇", "Shiinotic");
            pokemonMap.put("圈圈熊", "Ursaring");
            pokemonMap.put("七夕青鸟", "Altaria");
            pokemonMap.put("哥德宝宝", "Gothita");
            pokemonMap.put("好啦鱿", "Inkay");
            pokemonMap.put("来电汪", "Yamper");
            pokemonMap.put("盐石垒", "Naclstack");
            pokemonMap.put("胡地", "Alakazam");
            pokemonMap.put("爱心鱼", "Luvdisc");
            pokemonMap.put("树枕尾熊", "Komala");
            pokemonMap.put("毽子草", "Skiploom");
            pokemonMap.put("熔蚁兽", "Heatmor");
            pokemonMap.put("利牙鱼", "Carvanha");
            pokemonMap.put("象征鸟", "Sigilyph");
            pokemonMap.put("魔尼尼", "Mime jr.");
            pokemonMap.put("戟脊龙", "Baxcalibur");
            pokemonMap.put("露奈雅拉", "Lunala");
            pokemonMap.put("土王", "Clodsire");
            pokemonMap.put("皮可西", "Clefable");
            pokemonMap.put("乌贼王", "Malamar");
            pokemonMap.put("含羞苞", "Budew");
            pokemonMap.put("黑暗鸦", "Murkrow");
            pokemonMap.put("焚焰蚣", "Centiskorch");
            pokemonMap.put("火暴兽", "Typhlosion");
            pokemonMap.put("鲤鱼王", "Magikarp");
            pokemonMap.put("嘎啦嘎啦", "Marowak");
            pokemonMap.put("毽子草", "Hoppip");
            pokemonMap.put("泥泥鳅", "Barboach");
            pokemonMap.put("苍响", "Zacian");
            pokemonMap.put("多刺菊石兽", "Omastar");
            pokemonMap.put("向日花怪", "Sunflora");
            pokemonMap.put("雪妖女", "Froslass");
            pokemonMap.put("霓虹鱼", "Lumineon");
            pokemonMap.put("火斑喵", "Litten");
            pokemonMap.put("魔幻假面喵", "Meowscarada");
            pokemonMap.put("投掷猴", "Passimian");
            pokemonMap.put("太乐巴戈斯", "Terapagos");
            pokemonMap.put("败露球菇", "Amoonguss");
            pokemonMap.put("蘑蘑菇", "Shroomish");
            pokemonMap.put("粉蝶蛹", "Spewpa");
            pokemonMap.put("夜巡灵", "Duskull");
            pokemonMap.put("眷恋云", "Enamorus");
            pokemonMap.put("风妖精", "Eldegoss");
            pokemonMap.put("鬃岩狼人", "Lycanroc");
            pokemonMap.put("冰伊布", "Glaceon");
            pokemonMap.put("胆小虫", "Wimpod");
            pokemonMap.put("晶光花", "Glimmora");
            pokemonMap.put("大食花", "Victreebel");
            pokemonMap.put("巨钳蟹", "Kingler");
            pokemonMap.put("雷吉艾斯", "Regice");
            pokemonMap.put("盾甲茧", "Cascoon");
            pokemonMap.put("镰刀盔", "Kabutops");
            pokemonMap.put("沙河马", "Hippopotas");
            pokemonMap.put("大王燕", "Swellow");
            pokemonMap.put("雷吉艾勒奇", "Regieleki");
            pokemonMap.put("烧火蚣", "Sizzlipede");
            pokemonMap.put("冰宝", "Bergmite");
            pokemonMap.put("电萤虫", "Volbeat");
            pokemonMap.put("噗隆隆", "Varoom");
            pokemonMap.put("保姆虫", "Leavanny");
            pokemonMap.put("萌虻", "Cutiefly");
            pokemonMap.put("百变怪", "Ditto");
            pokemonMap.put("老翁龙", "Drampa");
            pokemonMap.put("黏美龙", "Goodra");
            pokemonMap.put("猛恶菇", "Brute bonnet");
            pokemonMap.put("轰鸣月", "Roaring moon");
            pokemonMap.put("火红不倒翁", "Darumaka");
            pokemonMap.put("大舌贝", "Shellder");
            pokemonMap.put("小球飞鱼", "Mantyke");
            pokemonMap.put("涂标客", "Grafaiai");
            pokemonMap.put("毛头小鹰", "Rufflet");
            pokemonMap.put("稚山雀", "Rookidee");
            pokemonMap.put("小电蜥", "Helioptile");
            pokemonMap.put("迷你龙", "Dratini");
            pokemonMap.put("蝶结萌虻", "Ribombee");
            pokemonMap.put("卡璞・鸣鸣", "Tapu koko");
            pokemonMap.put("请假王", "Slaking");
            pokemonMap.put("咬咬龟", "Chewtle");
            pokemonMap.put("帝牙卢卡", "Dialga");
            pokemonMap.put("顽皮雷弹", "Electrode");
            pokemonMap.put("顽皮熊猫", "Pancham");
            pokemonMap.put("银伴战兽", "Silvally");
            pokemonMap.put("象牙猪", "Mamoswine");
            pokemonMap.put("灰尘山", "Garbodor");
            pokemonMap.put("四颚针龙", "Naganadel");
            pokemonMap.put("高傲雉鸡", "Unfezant");
            pokemonMap.put("大尾立", "Furret");
            pokemonMap.put("灯火幽灵", "Lampent");
            pokemonMap.put("圆法师", "Kricketot");
            pokemonMap.put("梦幻", "Mew");
            pokemonMap.put("长毛猪", "Piloswine");
            pokemonMap.put("果然翁", "Wobbuffet");
            pokemonMap.put("雄伟牙", "Great tusk");
            pokemonMap.put("章鱼桶", "Octillery");
            pokemonMap.put("泥驴仔", "Mudbray");
            pokemonMap.put("菊石兽", "Omanyte");
            pokemonMap.put("猛火猴", "Monferno");
            pokemonMap.put("毒贝比", "Poipole");
            pokemonMap.put("幕下力士", "Makuhita");
            pokemonMap.put("布鲁", "Snubbull");
            pokemonMap.put("双卵细胞球", "Duosion");
            pokemonMap.put("熔岩蜗牛", "Magcargo");
            pokemonMap.put("人造细胞卵", "Reuniclus");
            pokemonMap.put("滴蛛", "Dewpider");
            pokemonMap.put("西狮海壬", "Primarina");
            pokemonMap.put("烈焰猴", "Infernape");
            pokemonMap.put("探探鼠", "Patrat");
            pokemonMap.put("凤王", "Ho-oh");
            pokemonMap.put("胖丁", "Jigglypuff");
            pokemonMap.put("铁哑铃", "Beldum");
            pokemonMap.put("拉鲁拉丝", "Ralts");
            pokemonMap.put("波普海豚", "Finizen");
            pokemonMap.put("阿柏蛇", "Ekans");
            pokemonMap.put("多多冰", "Vanillish");
            pokemonMap.put("梦妖", "Misdreavus");
            pokemonMap.put("玛力露", "Marill");
            pokemonMap.put("向尾喵", "Skitty");
            pokemonMap.put("铁火辉夜", "Celesteela");
            pokemonMap.put("梦歌仙人掌", "Cacturne");
            pokemonMap.put("懒人獭", "Slakoth");
            pokemonMap.put("土狼犬", "Poochyena");
            pokemonMap.put("帕奇利兹", "Pachirisu");
            pokemonMap.put("吼爆弹", "Loudred");
            pokemonMap.put("角金鱼", "Seaking");
            pokemonMap.put("菊草叶", "Chikorita");
            pokemonMap.put("踏冰人偶", "Mr. rime");
            pokemonMap.put("护城龙", "Bastiodon");
            pokemonMap.put("偷儿狐", "Nickit");
            pokemonMap.put("胖可丁", "Wigglytuff");
            pokemonMap.put("咩利羊", "Mareep");
            pokemonMap.put("芳香精", "Aromatisse");
            pokemonMap.put("毒电婴", "Toxel");
            pokemonMap.put("时拉比", "Celebi");
            pokemonMap.put("蚊香君", "Poliwhirl");
            pokemonMap.put("荧光鱼", "Finneon");
            pokemonMap.put("朽木妖", "Trevenant");
            pokemonMap.put("铁炮鱼", "Remoraid");
            pokemonMap.put("迷你冰", "Vanillite");
            pokemonMap.put("滚滚蝙蝠", "Woobat");
            pokemonMap.put("啪嚓海胆", "Pincurchin");
            pokemonMap.put("头盖龙", "Cranidos");
            pokemonMap.put("露力丽", "Azurill");
            pokemonMap.put("雷吉奇卡斯", "Regigigas");
            pokemonMap.put("巨锻匠", "Tinkaton");
            pokemonMap.put("小木灵", "Phantump");
            pokemonMap.put("海魔狮", "Sealeo");
            pokemonMap.put("喷嚏熊", "Cubchoo");
            pokemonMap.put("臭臭花", "Gloom");
            pokemonMap.put("毒粉蛾", "Dustox");
            pokemonMap.put("绵绵泡芙", "Swirlix");
            pokemonMap.put("大颚蚁", "Trapinch");
            pokemonMap.put("来悲粗茶", "Sinistcha");
            pokemonMap.put("盆才怪", "Bonsly");
            pokemonMap.put("雪绒蛾", "Frosmoth");
            pokemonMap.put("猫鼬斩", "Zangoose");
            pokemonMap.put("盐石巨灵", "Garganacl");
            pokemonMap.put("阿柏怪", "Arbok");
            pokemonMap.put("古简蜗", "Wo-chien");
            pokemonMap.put("宝贝龙", "Bagon");
            pokemonMap.put("炎兔儿", "Scorbunny");
            pokemonMap.put("海兔兽", "Gastrodon");
            pokemonMap.put("音箱蟀", "Kricketune");
            pokemonMap.put("铁臂枪虾", "Clauncher");
            pokemonMap.put("厄诡椪", "Ogerpon");
            pokemonMap.put("顿甲", "Donphan");
            pokemonMap.put("铜镜怪", "Bronzor");
            pokemonMap.put("土龙弟弟", "Dunsparce");
            pokemonMap.put("班基拉斯", "Tyranitar");
            pokemonMap.put("火箭雀", "Fletchinder");
            pokemonMap.put("卡璞・哞哞", "Tapu bulu");
            pokemonMap.put("跳跳猪", "Spoink");
            pokemonMap.put("音波龙", "Noibat");
            pokemonMap.put("宝宝暴龙", "Tyrunt");
            pokemonMap.put("蜥蜴王", "Sceptile");
            pokemonMap.put("地鼠", "Diglett");
            pokemonMap.put("杰尼龟", "Squirtle");
            pokemonMap.put("芭瓢虫", "Ledyba");
            pokemonMap.put("波皇子", "Prinplup");
            pokemonMap.put("负电拍拍", "Minun");
            pokemonMap.put("烈空坐", "Rayquaza");
            pokemonMap.put("藤藤蛇", "Snivy");
            pokemonMap.put("盾甲龙", "Shieldon");
            pokemonMap.put("胡帕", "Hoopa");
            pokemonMap.put("敏捷虫", "Accelgor");
            pokemonMap.put("好胜蟹", "Crabrawler");
            pokemonMap.put("大舌头", "Lickitung");
            pokemonMap.put("小海狮", "Seel");
            pokemonMap.put("奇鲁莉安", "Kirlia");
            pokemonMap.put("古剑豹", "Chien-pao");
            pokemonMap.put("卡拉卡拉", "Cubone");
            pokemonMap.put("丰蜜龙", "Appletun");
            pokemonMap.put("怒鹦哥", "Squawkabilly");
            pokemonMap.put("尼多朗", "Nidoran-m");
            pokemonMap.put("飞天螳螂", "Scyther");
            pokemonMap.put("利欧路", "Riolu");
            pokemonMap.put("死神板", "Runerigus");
            pokemonMap.put("费洛美螂", "Fezandipiti");
            pokemonMap.put("尼多兰", "Nidoran-f");
            pokemonMap.put("橡实果", "Seedot");
            pokemonMap.put("爬地翅", "Slither wing");
            pokemonMap.put("太古羽虫", "Anorith");
            pokemonMap.put("派拉斯", "Paras");
            pokemonMap.put("草苗龟", "Turtwig");
            pokemonMap.put("拳海参", "Pyukumuku");
            pokemonMap.put("捣蛋小妖", "Impidimp");
            pokemonMap.put("地幔岩", "Boldore");
            pokemonMap.put("炽焰咆哮虎", "Incineroar");
            pokemonMap.put("谜拟丘", "Mimikyu");
            pokemonMap.put("三合一磁怪", "Magneton");
            pokemonMap.put("哭哭面具", "Yamask");
            pokemonMap.put("甲壳龙", "Shelgon");
            pokemonMap.put("月亮伊布", "Umbreon");
            pokemonMap.put("玛夏多", "Marshadow");
            pokemonMap.put("蔓藤怪", "Tangela");
            pokemonMap.put("够赞狗", "Okidogi");
            pokemonMap.put("火稚鸡", "Torchic");
            pokemonMap.put("混混鳄", "Krokorok");
            pokemonMap.put("爆香猴", "Simisear");
            pokemonMap.put("刺梭鱼", "Arrokuda");
            pokemonMap.put("沙铃仙人掌", "Maractus");
            pokemonMap.put("凯西", "Abra");
            pokemonMap.put("铁脖颈", "Iron_jugulis");
            pokemonMap.put("裙儿小姐", "Lilligant");
            pokemonMap.put("波士可多拉", "Aggron");
            pokemonMap.put("斑斑马", "Blitzle");
            pokemonMap.put("结草儿", "Burmy");
            pokemonMap.put("电肚蛙", "Bellibolt");
            pokemonMap.put("浮潜鼬", "Floatzel");
            pokemonMap.put("青藤蛇", "Servine");
            pokemonMap.put("坐骑山羊", "Gogoat");
            pokemonMap.put("科斯莫姆", "Cosmoem");
            pokemonMap.put("暖暖猪", "Tepig");
            pokemonMap.put("超音波幼虫", "Vibrava");
            pokemonMap.put("鸭宝宝", "Ducklett");
            pokemonMap.put("武道熊师", "Urshifu");
            pokemonMap.put("丑丑鱼", "Feebas");
            pokemonMap.put("火炎狮", "Pyroar");
            pokemonMap.put("虫宝包", "Sewaddle");
            pokemonMap.put("金属怪", "Metang");
            pokemonMap.put("铁面忍者", "Ninjask");
            pokemonMap.put("风妖精", "Whimsicott");
            pokemonMap.put("哥德小童", "Gothorita");
            pokemonMap.put("尼多王", "Nidoking");
            pokemonMap.put("烛光灵", "Litwick");
            pokemonMap.put("电蜘蛛", "Galvantula");
            pokemonMap.put("水伊布", "Vaporeon");
            pokemonMap.put("诡角鹿", "Wyrdeer");
            pokemonMap.put("费洛美螂", "Buzzwole");
            pokemonMap.put("虫甲圣", "Orthworm");
            pokemonMap.put("睡睡菇", "Morelull");
            pokemonMap.put("光蝌仔", "Tadbulb");
            pokemonMap.put("直冲熊", "Linoone");
            pokemonMap.put("土居忍士", "Nincada");
            pokemonMap.put("粉香香", "Spritzee");
            pokemonMap.put("变涩蜥", "Drizzile");
            pokemonMap.put("吃吼霸", "Dondozo");
            pokemonMap.put("海豹球", "Spheal");
            pokemonMap.put("钢铠鸦", "Corviknight");
            pokemonMap.put("脱壳忍者", "Shedinja");
            pokemonMap.put("呆呆兽", "Slowpoke");
            pokemonMap.put("黏黏宝", "Goomy");
            pokemonMap.put("铁骨土人", "Gurdurr");
            pokemonMap.put("波尔凯尼恩", "Volcanion");
            pokemonMap.put("骑士蜗牛", "Escavalier");
            pokemonMap.put("小锻匠", "Tinkatink");
            pokemonMap.put("臭泥", "Grimer");
            pokemonMap.put("盖盖虫", "Karrablast");
            pokemonMap.put("霏欧纳", "Phione");
            pokemonMap.put("千面避役", "Inteleon");
            pokemonMap.put("路卡利欧", "Lucario");
            pokemonMap.put("球球海狮", "Popplio");
            pokemonMap.put("卡蒂狗", "Growlithe");
            pokemonMap.put("火神蛾", "Volcarona");
            pokemonMap.put("雷电斑马", "Zebstrika");
            pokemonMap.put("远古巨蜓", "Yanmega");
            pokemonMap.put("布莉姆温", "Hatterene");
            pokemonMap.put("甜甜萤", "Illumise");
            pokemonMap.put("勒克猫", "Luxio");
            pokemonMap.put("东施喵", "Purugly");
            pokemonMap.put("黑眼鳄", "Sandile");
            pokemonMap.put("基格尔德", "Zygarde");
            pokemonMap.put("灯笼鱼", "Chinchou");
            pokemonMap.put("谢米", "Shaymin");
            pokemonMap.put("黑夜魔灵", "Dusknoir");
            pokemonMap.put("狂欢浪舞鸭", "Quaquaval");
            pokemonMap.put("毒刺水母", "Tentacruel");
            pokemonMap.put("鸭嘴炎兽", "Magmortar");
            pokemonMap.put("死神棺", "Cofagrigus");
            pokemonMap.put("百合根娃娃", "Petilil");
            pokemonMap.put("喵头目", "Perrserker");
            pokemonMap.put("穿着熊", "Bewear");
            pokemonMap.put("角金鱼", "Goldeen");
            pokemonMap.put("狙射树枭", "Decidueye");
            pokemonMap.put("炎热喵", "Torracat");
            pokemonMap.put("落雷兽", "Electrike");
            pokemonMap.put("雷伊布", "Jolteon");
            pokemonMap.put("心蝙蝠", "Swoobat");
            pokemonMap.put("虚吾伊德", "Nihilego");
            pokemonMap.put("洛奇亚", "Lugia");
            pokemonMap.put("无畏小子", "Tyrogue");
            pokemonMap.put("椰蛋树", "Exeggutor");
            pokemonMap.put("下石鸟", "Bombirdier");
            pokemonMap.put("皮卡丘", "Pikachu");
            pokemonMap.put("巨炭山", "Coalossal");
            pokemonMap.put("怖思壶", "Polteageist");
            pokemonMap.put("独剑鞘", "Honedge");
            pokemonMap.put("雪童子", "Snorunt");
            pokemonMap.put("暴雪王", "Snover");
            pokemonMap.put("壶壶", "Shuckle");
            pokemonMap.put("斯魔茶", "Munkidori");
            pokemonMap.put("姆克鹰", "Staraptor");
            pokemonMap.put("水水獭", "Oshawott");
            pokemonMap.put("幼基拉斯", "Larvitar");
            pokemonMap.put("大狼犬", "Mightyena");
            pokemonMap.put("不良蛙", "Croagunk");
            pokemonMap.put("铝钢桥龙", "Archaludon");
            pokemonMap.put("腕力", "Machop");
            pokemonMap.put("沙包蛇", "Silicobra");
            pokemonMap.put("晃晃斑", "Spinda");
            pokemonMap.put("强颚鸡母虫", "Grubbin");
            pokemonMap.put("小仙奶", "Milcery");
            pokemonMap.put("原盖海龟", "Tirtouga");
            pokemonMap.put("双尾怪手", "Ambipom");
            pokemonMap.put("袋兽", "Kangaskhan");
            pokemonMap.put("麻花犬", "Dachsbun");
            pokemonMap.put("长尾火狐", "Braixen");
            pokemonMap.put("口呆花", "Weepinbell");
            pokemonMap.put("妙蛙草", "Ivysaur");
            pokemonMap.put("朝北鼻", "Nosepass");
            pokemonMap.put("赤面龙", "Druddigon");
            pokemonMap.put("独角虫", "Weedle");
            pokemonMap.put("费洛美螂", "Pheromosa");
            pokemonMap.put("石丸子", "Roggenrola");
            pokemonMap.put("霹雳电球", "Voltorb");
            pokemonMap.put("卡璞・蝶蝶", "Tapu lele");
            pokemonMap.put("鬼斯通", "Haunter");
            pokemonMap.put("魔墙人偶", "Mr. mime");
            pokemonMap.put("冰雪龙", "Amaura");
            pokemonMap.put("呱呱泡蛙", "Froakie");
            pokemonMap.put("妙蛙种子", "Bulbasaur");
            pokemonMap.put("嘟嘟", "Doduo");
            pokemonMap.put("龙卷云", "Tornadus");
            pokemonMap.put("阿利多斯", "Ariados");
            pokemonMap.put("叶伊布", "Leafeon");
            pokemonMap.put("大舌舔", "Lickilicky");
            pokemonMap.put("森林蜥蜴", "Grovyle");
            pokemonMap.put("夜盗火蜥", "Salandit");
            pokemonMap.put("梦梦蚀", "Musharna");
            pokemonMap.put("快拳郎", "Hitmonchan");
            pokemonMap.put("多龙巴鲁托", "Dragapult");
            pokemonMap.put("妙喵", "Espurr");
            pokemonMap.put("钥圈儿", "Klefki");
            pokemonMap.put("铁壳蛹", "Kakuna");
            pokemonMap.put("长毛狗", "Stoutland");
            pokemonMap.put("臭臭泥", "Muk");
            pokemonMap.put("毒藻龙", "Skrelp");
            pokemonMap.put("小鸭嘴龙", "Magby");
            pokemonMap.put("波克基斯", "Togekiss");
            pokemonMap.put("拳拳蛸", "Clobbopus");
            pokemonMap.put("尖牙笼", "Carnivine");
            pokemonMap.put("骨纹巨声鳄", "Skeledirge");
            pokemonMap.put("拉达", "Raticate");
            pokemonMap.put("虫甲圣", "Rabsca");
            pokemonMap.put("由克希", "Uxie");
            pokemonMap.put("一家鼠", "Maushold");
            pokemonMap.put("圆丝蛛", "Spinarak");
            pokemonMap.put("坦克臭鼬", "Skuntank");
            pokemonMap.put("秃鹰娜", "Mandibuzz");
            pokemonMap.put("帝牙海狮", "Walrein");
            pokemonMap.put("始祖大鸟", "Archeops");
            pokemonMap.put("龙王蝎", "Drapion");
            pokemonMap.put("猫老大", "Persian");
            pokemonMap.put("贪心栗鼠", "Greedent");
            pokemonMap.put("大钢蛇", "Steelix");
            pokemonMap.put("庞岩怪", "Gigalith");
            pokemonMap.put("滴蛛霸", "Araquanid");
            pokemonMap.put("大岩蛇", "Onix");
            pokemonMap.put("童偶熊", "Stufful");
            pokemonMap.put("晶光芽", "Glimmet");
            pokemonMap.put("火焰鸡", "Blaziken");
            pokemonMap.put("火焰鸟", "Moltres");
            pokemonMap.put("怪力", "Machamp");
            pokemonMap.put("沙漠蜻蜓", "Flygon");
            pokemonMap.put("牙牙", "Axew");
            pokemonMap.put("甜竹竹", "Bounsweet");
            pokemonMap.put("属性：空", "Type: null");
            pokemonMap.put("海豚侠", "Palafin");
            pokemonMap.put("几何雪花", "Cryogonal");
            pokemonMap.put("天然鸟", "Xatu");
            pokemonMap.put("幸福蛋", "Blissey");
            pokemonMap.put("电海燕", "Kilowattrel");
            pokemonMap.put("萨戮德", "Zarude");
            pokemonMap.put("雷吉洛克", "Regirock");
            pokemonMap.put("念力土偶", "Claydol");
            pokemonMap.put("三海地鼠", "Wugtrio");
            pokemonMap.put("水箭龟", "Blastoise");
            pokemonMap.put("毒蔷薇", "Roselia");
            pokemonMap.put("佛烈托斯", "Forretress");
            pokemonMap.put("黑鲁加", "Houndoom");
            pokemonMap.put("泥偶巨人", "Golurk");
            pokemonMap.put("酷豹", "Liepard");
            pokemonMap.put("烈腿蝗", "Lokix");
            pokemonMap.put("穿山王", "Sandslash");
            pokemonMap.put("沼王", "Quagsire");
            pokemonMap.put("功夫鼬", "Mienfoo");
            pokemonMap.put("毽子棉", "Jumpluff");
            pokemonMap.put("勇士雄鹰", "Braviary");
            pokemonMap.put("宝包茧", "Swadloon");
            pokemonMap.put("焰后蜥", "Salazzle");
            pokemonMap.put("蜜勒顿", "Pecharunt");
            pokemonMap.put("木棉球", "Cottonee");
            pokemonMap.put("九尾", "Ninetales");
            pokemonMap.put("宝宝丁", "Igglybuff");
            pokemonMap.put("喷火龙", "Charizard");
            pokemonMap.put("走鲸", "Walking wake");
            pokemonMap.put("毒骷蛙", "Toxicroak");
            pokemonMap.put("仙子伊布", "Sylveon");
            pokemonMap.put("列阵兵", "Falinks");
            pokemonMap.put("梦妖魔", "Mismagius");
            pokemonMap.put("电电虫", "Joltik");
            pokemonMap.put("摇篮百合", "Cradily");
            pokemonMap.put("葱游兵", "Sirfetch'd");
            pokemonMap.put("巨蔓藤", "Tangrowth");
            pokemonMap.put("岩殿居蟹", "Crustle");
            pokemonMap.put("锹农炮虫", "Vikavolt");
            pokemonMap.put("君主蛇", "Serperior");
            pokemonMap.put("花椰猿", "Simisage");
            pokemonMap.put("噗噗猪", "Grumpig");
            pokemonMap.put("铁荆棘", "Iron_thorns");
            pokemonMap.put("小拉达", "Rattata");
            pokemonMap.put("具甲武者", "Golisopod");
            pokemonMap.put("触手百合", "Lileep");
            pokemonMap.put("妙蛙花", "Venusaur");
            pokemonMap.put("罗丝雷朵", "Roserade");
            pokemonMap.put("尼多力诺", "Nidorino");
            pokemonMap.put("烈箭鹰", "Talonflame");
            pokemonMap.put("火伊布", "Flareon");
            pokemonMap.put("风速狗", "Arcanine");
            pokemonMap.put("尼多娜", "Nidorina");
            pokemonMap.put("小火焰猴", "Chimchar");
            pokemonMap.put("暴鲤龙", "Gyarados");
            pokemonMap.put("双剑鞘", "Doublade");
            pokemonMap.put("凯路迪欧", "Keldeo");
            pokemonMap.put("耿鬼", "Gengar");
            pokemonMap.put("花岩怪", "Spiritomb");
            pokemonMap.put("妖火红狐", "Delphox");
            pokemonMap.put("团珠蛛", "Tarountula");
            pokemonMap.put("苹裹龙", "Flapple");
            pokemonMap.put("拉帝欧斯", "Latios");
            pokemonMap.put("天罩虫", "Dottler");
            pokemonMap.put("比克提尼", "Victini");
            pokemonMap.put("超音蝠", "Zubat");
            pokemonMap.put("战舞郎", "Hitmontop");
            pokemonMap.put("玛力露丽", "Azumarill");
            pokemonMap.put("小小象", "Phanpy");
            pokemonMap.put("墨海马", "Horsea");
            pokemonMap.put("呆火驼", "Numel");
            pokemonMap.put("饭匙蛇", "Seviper");
            pokemonMap.put("长鼻叶", "Nuzleaf");
            pokemonMap.put("智挥猩", "Oranguru");
            pokemonMap.put("火烈鸟", "Flamigo");
            pokemonMap.put("奇麒麟", "Farigiraf");
            pokemonMap.put("钢炮臂虾", "Clawitzer");
            pokemonMap.put("樱花鱼", "Gorebyss");
            pokemonMap.put("铃铛响", "Chingling");
            pokemonMap.put("毛崖蟹", "Klawf");
            pokemonMap.put("喇叭啄鸟", "Trumbeak");
            pokemonMap.put("米立龙", "Tatsugiri");
            pokemonMap.put("火岩鼠", "Quilava");
            pokemonMap.put("海刺龙", "Seadra");
            pokemonMap.put("刺甲贝", "Cloyster");
            pokemonMap.put("吼鲸王", "Wailord");
            pokemonMap.put("索财灵", "Gimmighoul");
            pokemonMap.put("步哨鼠", "Watchog");
            pokemonMap.put("千针鱼", "Qwilfish");
            pokemonMap.put("花漾海狮", "Brionne");
            pokemonMap.put("雷鸟海兽", "Arctozolt");
            pokemonMap.put("喷火驼", "Camerupt");
            pokemonMap.put("南瓜怪人", "Gourgeist");
            pokemonMap.put("新叶喵", "Sprigatito");
            pokemonMap.put("樱花儿", "Cherrim");
            pokemonMap.put("刺龙王", "Kingdra");
            pokemonMap.put("野蛮鲈鱼", "Basculin");
            pokemonMap.put("双斧战龙", "Haxorus");
            pokemonMap.put("飞腿郎", "Hitmonlee");
            pokemonMap.put("茸茸羊", "Flaaffy");
            pokemonMap.put("润水鸭", "Quaxwell");
            pokemonMap.put("多龙奇", "Drakloak");
            pokemonMap.put("超甲狂犀", "Rhyperior");
            pokemonMap.put("裹蜜虫", "Dipplin");
            pokemonMap.put("炭小侍", "Charcadet");
            pokemonMap.put("哈克龙", "Dragonair");
            pokemonMap.put("花蓓蓓", "Flabebe");
            pokemonMap.put("咕妞妞", "Whismur");
            pokemonMap.put("龟脚脚", "Binacle");
            pokemonMap.put("甜冷美后", "Tsareena");
            pokemonMap.put("奥利纽", "Dolliv");
            pokemonMap.put("大针蜂", "Beedrill");
            pokemonMap.put("催眠貘", "Drowzee");
            pokemonMap.put("长尾怪手", "Aipom");
            pokemonMap.put("爆香猴", "Pansear");
            pokemonMap.put("灵幽马", "Spectrier");
            pokemonMap.put("古玉鱼", "Chi-yu");
            pokemonMap.put("单卵细胞球", "Solosis");
            pokemonMap.put("隆隆石", "Graveler");
            pokemonMap.put("电龙", "Ampharos");
            pokemonMap.put("电灯怪", "Lanturn");
            pokemonMap.put("三蜜蜂", "Combee");
            pokemonMap.put("泪眼蜥", "Sobble");
            pokemonMap.put("炎帝", "Entei");
            pokemonMap.put("伊裴尔塔尔", "Yveltal");
            pokemonMap.put("甜舞妮", "Steenee");
            pokemonMap.put("雷吉铎拉戈", "Regidrago");
            pokemonMap.put("南瓜精", "Pumpkaboo");
            pokemonMap.put("斧牙龙", "Fraxure");
            pokemonMap.put("猛雷鼓", "Raging bolt");
            pokemonMap.put("红莲铠骑", "Armarouge");
            pokemonMap.put("三地鼠", "Dugtrio");
            pokemonMap.put("鲶鱼王", "Whiscash");
            pokemonMap.put("恶食大王", "Guzzlord");
            pokemonMap.put("波克比", "Togepi");
            pokemonMap.put("小陨星", "Minior");
            pokemonMap.put("大力鳄", "Feraligatr");
            pokemonMap.put("来悲茶", "Poltchageist");
            pokemonMap.put("超坏星", "Toxapex");
            pokemonMap.put("仆刀将军", "Kingambit");
            pokemonMap.put("电击魔兽", "Electivire");
            pokemonMap.put("乌波", "Wooper");
            pokemonMap.put("大朝北鼻", "Probopass");
            pokemonMap.put("可达鸭", "Psyduck");
            pokemonMap.put("啪咚猴", "Thwackey");
            pokemonMap.put("虫滚泥", "Rellor");
            pokemonMap.put("化石盔", "Kabuto");
            pokemonMap.put("堵拦熊", "Obstagoon");
            pokemonMap.put("獒教父", "Mabosstiff");
            pokemonMap.put("铁武者", "Iron_valiant");
            pokemonMap.put("洛托姆", "Rotom");
            pokemonMap.put("掘掘兔", "Bunnelby");
            pokemonMap.put("墓仔狗", "Greavard");
            pokemonMap.put("戽斗尖梭", "Barraskewda");
            pokemonMap.put("克雷色利亚", "Cresselia");
            pokemonMap.put("自爆磁怪", "Magnezone");
            pokemonMap.put("蚊香蝌蚪", "Poliwag");
            pokemonMap.put("水君", "Suicune");
            pokemonMap.put("磨牙彩皮鱼", "Bruxish");
            pokemonMap.put("天蝎王", "Gliscor");
            pokemonMap.put("爆炸头水牛", "Bouffalant");
            pokemonMap.put("正电拍拍", "Plusle");
            pokemonMap.put("雷电云", "Thundurus");
            pokemonMap.put("巨翅飞鱼", "Mantine");
            pokemonMap.put("打击鬼", "Sawk");
            pokemonMap.put("花椰猴", "Pansage");
            pokemonMap.put("彩粉蝶", "Vivillon");
            pokemonMap.put("鳞甲龙", "Hakamo-o");
            pokemonMap.put("花疗环环", "Comfey");
            pokemonMap.put("蓝鸦", "Corvisquire");
            pokemonMap.put("大牙狸", "Bidoof");
            pokemonMap.put("捷克罗姆", "Zekrom");
            pokemonMap.put("狡诈狐", "Thievul");
            pokemonMap.put("狡猾天狗", "Shiftry");
            pokemonMap.put("一对鼠", "Tandemaus");
            pokemonMap.put("豆蟋蟀", "Nymble");
            pokemonMap.put("沙丘娃", "Sandygast");
            pokemonMap.put("伊布", "Eevee");
            pokemonMap.put("蓝蟾蜍", "Palpitoad");
            pokemonMap.put("腾蹴小将", "Raboot");
            pokemonMap.put("雪吞虫", "Snom");
            pokemonMap.put("弃世猴", "Annihilape");
            pokemonMap.put("勾帕路翁", "Cobalion");
            pokemonMap.put("破空焰", "Gouging fire");
            pokemonMap.put("莱希拉姆", "Reshiram");
            pokemonMap.put("可可多拉", "Aron");
            pokemonMap.put("冰砌鹅", "Eiscue");
            pokemonMap.put("爆焰龟兽", "Turtonator");
            pokemonMap.put("蓝鳄", "Croconaw");
            pokemonMap.put("盔甲鸟", "Skarmory");
            pokemonMap.put("傲骨燕", "Taillow");
            pokemonMap.put("刺球仙人掌", "Cacnea");
            pokemonMap.put("尖牙陆鲨", "Gabite");
            pokemonMap.put("小福蛋", "Happiny");
            pokemonMap.put("魅力喵", "Glameow");
            pokemonMap.put("美录坦", "Meltan");
            pokemonMap.put("八爪武师", "Grapploct");
            pokemonMap.put("波克基古", "Togetic");
            pokemonMap.put("爆音怪", "Exploud");
            pokemonMap.put("风铃铃", "Chimecho");
            pokemonMap.put("种子铁球", "Ferroseed");
            pokemonMap.put("大比鸟", "Pidgeot");
            pokemonMap.put("摩托蜥", "Cyclizar");
            pokemonMap.put("美录梅塔", "Melmetal");
            pokemonMap.put("溶食兽", "Gulpin");
            pokemonMap.put("雨翅蛾", "Masquerain");
            pokemonMap.put("卡璞・鳍鳍", "Tapu fini");
            pokemonMap.put("古鼎鹿", "Ting-lu");
            pokemonMap.put("大尾狸", "Bibarel");
            pokemonMap.put("雷电兽", "Manectric");
            pokemonMap.put("月石", "Lunatone");
            pokemonMap.put("图图犬", "Smeargle");
            pokemonMap.put("盖欧卡", "Kyogre");
            pokemonMap.put("六尾", "Vulpix");
            pokemonMap.put("未知图腾", "Unown");
            pokemonMap.put("帕路奇亚", "Palkia");
            pokemonMap.put("巴大蝶", "Butterfree");
            pokemonMap.put("多丽米亚", "Furfrou");
            pokemonMap.put("皮皮", "Clefairy");
            pokemonMap.put("古月鸟", "Cramorant");
            pokemonMap.put("墓扬犬", "Houndstone");
            pokemonMap.put("钻角犀兽", "Rhydon");
            pokemonMap.put("狃拉", "Sneasel");
            pokemonMap.put("火暴猴", "Primeape");
            pokemonMap.put("大剑鬼", "Samurott");
            pokemonMap.put("垒磊石", "Stakataka");
            pokemonMap.put("雷吉斯奇鲁", "Registeel");
            pokemonMap.put("滑滑小子", "Scraggy");
            pokemonMap.put("藏玛然特", "Zamazenta");
            pokemonMap.put("河马兽", "Hippowdon");
            pokemonMap.put("帝王拿波", "Empoleon");
            pokemonMap.put("可多拉", "Lairon");
            pokemonMap.put("小山猪", "Swinub");
            pokemonMap.put("铁蚁", "Durant");
            pokemonMap.put("小嘴蜗", "Shelmet");
            pokemonMap.put("毕力吉翁", "Virizion");
            pokemonMap.put("花叶蒂", "Floette");
            pokemonMap.put("叉字蝠", "Crobat");
            pokemonMap.put("宝石海星", "Starmie");
            pokemonMap.put("熊徒弟", "Kubfu");
            pokemonMap.put("爱吃豚", "Lechonk");
            pokemonMap.put("莲帽小童", "Lombre");
            pokemonMap.put("大炭车", "Carkol");
            pokemonMap.put("沙铁皮", "Sandy shocks");
            pokemonMap.put("坚盾剑怪", "Aegislash");
            pokemonMap.put("多龙梅西亚", "Dreepy");
            pokemonMap.put("单首龙", "Deino");
            pokemonMap.put("咕咕鸽", "Tranquill");
            pokemonMap.put("布里卡隆", "Chesnaught");
            pokemonMap.put("莲叶童子", "Lotad");
            pokemonMap.put("木守宫", "Treecko");
            pokemonMap.put("呱头蛙", "Frogadier");
            pokemonMap.put("力壮鸡", "Combusken");
            pokemonMap.put("沙奈朵", "Gardevoir");
            pokemonMap.put("雷公", "Raikou");
            pokemonMap.put("鳃鱼龙", "Dracovish");
            pokemonMap.put("古空棘鱼", "Relicanth");
            pokemonMap.put("布鲁皇", "Granbull");
            pokemonMap.put("爱管侍", "Indeedee");
            pokemonMap.put("蜻蜻蜓", "Yanma");
            pokemonMap.put("巴布土拨", "Pawmot");
            pokemonMap.put("钳尾蝎", "Skorupi");
            pokemonMap.put("溜溜糖球", "Surskit");
            pokemonMap.put("幼棉棉", "Gossifleur");
            pokemonMap.put("肋骨海龟", "Carracosta");
            pokemonMap.put("呆火鳄", "Fuecoco");
            pokemonMap.put("催眠魔", "Hypno");
            pokemonMap.put("斯魔茶", "Scovillain");
            pokemonMap.put("小火马", "Ponyta");
            pokemonMap.put("狗仔包", "Fidough");
            pokemonMap.put("霜奶仙", "Alcremie");
            pokemonMap.put("投摔鬼", "Throh");
            pokemonMap.put("巨沼怪", "Swampert");
            pokemonMap.put("太古盔甲", "Armaldo");
            pokemonMap.put("代欧奇希斯", "Deoxys");
            pokemonMap.put("热带龙", "Tropius");
            pokemonMap.put("安瓢虫", "Ledian");
            pokemonMap.put("急冻鸟", "Articuno");
            pokemonMap.put("喇叭芽", "Bellsprout");
            pokemonMap.put("墓仔狗", "Maschiff");
            pokemonMap.put("飘浮泡泡", "Castform");
            pokemonMap.put("铁臂膀", "Iron_hands");
            pokemonMap.put("冻原熊", "Beartic");
            pokemonMap.put("天蝎", "Gligar");
            pokemonMap.put("信使鸟", "Delibird");
            pokemonMap.put("隆隆岩", "Golem");
            pokemonMap.put("呆壳兽", "Slowbro");
            pokemonMap.put("太阳珊瑚", "Corsola");
            pokemonMap.put("布拨", "Pawmi");
            pokemonMap.put("树才怪", "Sudowoodo");
            pokemonMap.put("车轮球", "Whirlipede");
            pokemonMap.put("猫头夜鹰", "Noctowl");
            pokemonMap.put("故勒顿", "Koraidon");
            pokemonMap.put("赫拉克罗斯", "Heracross");
            pokemonMap.put("弱丁鱼", "Wishiwashi");
            pokemonMap.put("齿轮怪", "Klinklang");
            pokemonMap.put("轻身鳕", "Veluza");
            pokemonMap.put("炒炒猪", "Pignite");
            pokemonMap.put("黏美儿", "Sliggoo");
            pokemonMap.put("苍炎刃鬼", "Ceruledge");
            pokemonMap.put("巴布土拨", "Pawmo");
            pokemonMap.put("飘香豚", "Oinkologne");
            pokemonMap.put("重泥挽马", "Mudsdale");
            pokemonMap.put("暴飞龙", "Salamence");
            pokemonMap.put("电海燕", "Wattrel");
            pokemonMap.put("惊角鹿", "Stantler");
            pokemonMap.put("拉帝亚斯", "Latias");
            pokemonMap.put("多边兽Ⅱ", "Porygon2");
            pokemonMap.put("阿尔宙斯", "Arceus");
            pokemonMap.put("乌鸦头头", "Honchkrow");
            pokemonMap.put("玛机雅娜", "Magearna");
            pokemonMap.put("百足蜈蚣", "Venipede");
            pokemonMap.put("樱蓓蓓", "Cherubi");
            pokemonMap.put("艾姆利多", "Mesprit");
            pokemonMap.put("海星星", "Staryu");
            pokemonMap.put("人造细胞卵", "Beheeyem");
            pokemonMap.put("师父鼬", "Mienshao");
            pokemonMap.put("燃烧虫", "Larvesta");
            pokemonMap.put("双倍多多冰", "Vanilluxe");
            pokemonMap.put("砰头小丑", "Blacephalon");
            pokemonMap.put("霸王花", "Vileplume");
            pokemonMap.put("麻麻鳗", "Eelektrik");
            pokemonMap.put("密勒顿", "Miraidon");
            pokemonMap.put("冰雪巨龙", "Aurorus");
            pokemonMap.put("独角犀牛", "Rhyhorn");
            pokemonMap.put("虫电宝", "Charjabug");
            pokemonMap.put("巨金怪", "Metagross");
            pokemonMap.put("卡咪龟", "Wartortle");
            pokemonMap.put("大王铜象", "Copperajah");
            pokemonMap.put("劈斩司令", "Bisharp");
            pokemonMap.put("固拉多", "Groudon");
            pokemonMap.put("来悲茶", "Sinistea");
            pokemonMap.put("艾路雷朵", "Gallade");
            pokemonMap.put("多边兽乙型", "Porygon-z");
            pokemonMap.put("逐电犬", "Boltund");
            pokemonMap.put("无极汰那", "Eternatus");
            pokemonMap.put("鬼斯", "Gastly");
            pokemonMap.put("大竺葵", "Meganium");
            pokemonMap.put("长耳兔", "Lopunny");
            pokemonMap.put("火球鼠", "Cyndaquil");
            pokemonMap.put("驹刀小兵", "Pawniard");
            pokemonMap.put("浩大鲸", "Cetitan");
            pokemonMap.put("轰擂金刚猩", "Rillaboom");
            pokemonMap.put("海豚侠", "Cetoddle");
            pokemonMap.put("铁毒蛾", "Iron_moth");
            pokemonMap.put("小磁怪", "Magnemite");
            pokemonMap.put("炙烫鳄", "Crocalor");
            pokemonMap.put("原野水母", "Toedscruel");
            pokemonMap.put("太阳岩", "Solrock");
            pokemonMap.put("以欧路普", "Orbeetle");
            pokemonMap.put("齿轮组", "Klang");
            pokemonMap.put("彷徨夜灵", "Dusclops");
            pokemonMap.put("青绵鸟", "Swablu");
            pokemonMap.put("卷卷耳", "Buneary");
            pokemonMap.put("胖嘟嘟", "Jellicent");
            pokemonMap.put("超能妙喵", "Meowstic");
            pokemonMap.put("拉普拉斯", "Lapras");
            pokemonMap.put("土龙节节", "Dudunsparce");
            pokemonMap.put("卡比兽", "Snorlax");
            pokemonMap.put("蛋蛋", "Exeggcute");
            pokemonMap.put("走路草", "Oddish");
            pokemonMap.put("皮宝宝", "Cleffa");
            pokemonMap.put("达克莱伊", "Darkrai");
            pokemonMap.put("小锯鳄", "Totodile");
            pokemonMap.put("乐天河童", "Ludicolo");
            pokemonMap.put("斗笠菇", "Breloom");
            pokemonMap.put("雷鸟龙", "Dracozolt");
            pokemonMap.put("巧锻匠", "Tinkatuff");
            pokemonMap.put("冻脊龙", "Frigibax");
            pokemonMap.put("盖诺赛克特", "Genesect");
            pokemonMap.put("肯泰罗", "Tauros");
            pokemonMap.put("沼跃鱼", "Marshtomp");
            pokemonMap.put("蟾蜍王", "Seismitoad");
            pokemonMap.put("波加曼", "Piplup");
            pokemonMap.put("毛辫羊", "Wooloo");
            pokemonMap.put("伦琴猫", "Luxray");
            pokemonMap.put("食梦梦", "Munna");
            pokemonMap.put("音波龙", "Noivern");
            pokemonMap.put("蜜集大蛇", "Hydrapple");
            pokemonMap.put("提布莉姆", "Hattrem");
            pokemonMap.put("摔角鹰人", "Hawlucha");
            pokemonMap.put("迷唇娃", "Smoochum");
            pokemonMap.put("小笃儿", "Pikipek");
            pokemonMap.put("麻麻鳗鱼王", "Eelektross");
            pokemonMap.put("丰蜜龙", "Brambleghast");
            pokemonMap.put("凯罗斯", "Pinsir");
            pokemonMap.put("煤炭龟", "Torkoal");
            pokemonMap.put("咚咚鼠", "Dedenne");
            pokemonMap.put("呆呆王", "Slowking");
            pokemonMap.put("泳圈鼬", "Buizel");
            pokemonMap.put("岩狗狗", "Rockruff");
            pokemonMap.put("小卡比兽", "Munchlax");
            pokemonMap.put("火恐龙", "Charmeleon");
            pokemonMap.put("暴噬龟", "Drednaw");
            pokemonMap.put("猴怪", "Mankey");
            pokemonMap.put("捷拉奥拉", "Zeraora");
            pokemonMap.put("皮丘", "Pichu");
            pokemonMap.put("优雅猫", "Delcatty");
            pokemonMap.put("电束木", "Xurkitree");
            pokemonMap.put("暴雪王", "Abomasnow");
            pokemonMap.put("大狃拉", "Sneasler");
            pokemonMap.put("奥利瓦", "Arboliva");
            pokemonMap.put("雷丘", "Raichu");
            pokemonMap.put("达摩狒狒", "Darmanitan");
            pokemonMap.put("托戈德玛尔", "Togedemaru");
            pokemonMap.put("铁头壳", "Iron_crown");
            pokemonMap.put("小狮狮", "Litleo");
            pokemonMap.put("泥巴鱼", "Stunfisk");
            pokemonMap.put("猎斑鱼", "Huntail");
            pokemonMap.put("圆陆鲨", "Gible");
            pokemonMap.put("炎武王", "Emboar");
            pokemonMap.put("太阳伊布", "Espeon");
            pokemonMap.put("快龙", "Dragonite");
            pokemonMap.put("小约克", "Lillipup");
            pokemonMap.put("勇基拉", "Kadabra");
            pokemonMap.put("怪颚龙", "Tyrantrum");
            pokemonMap.put("索罗亚克", "Zoroark");
            pokemonMap.put("噬沙堡爷", "Palossand");
            pokemonMap.put("索尔迦雷欧", "Solgaleo");
            pokemonMap.put("树林龟", "Grotle");
            pokemonMap.put("索侦虫", "Blipbug");
            pokemonMap.put("烈焰马", "Rapidash");
            pokemonMap.put("铁包袱", "Iron_bundle");
            pokemonMap.put("莫鲁贝可", "Morpeko");
            pokemonMap.put("圆蝌蚪", "Tympole");
            pokemonMap.put("基拉祈", "Jirachi");
            pokemonMap.put("烈雀", "Spearow");
            pokemonMap.put("甲贺忍蛙", "Greninja");
            pokemonMap.put("天然雀", "Natu");
            pokemonMap.put("雪暴马", "Glastrier");
            pokemonMap.put("豪力", "Machoke");
            pokemonMap.put("小炭仔", "Rolycoly");
            pokemonMap.put("无壳海兔", "Shellos");
            pokemonMap.put("勾魂眼", "Sableye");
            pokemonMap.put("投羽枭", "Dartrix");
            pokemonMap.put("蚊香蛙皇", "Politoed");
            pokemonMap.put("水晶灯火灵", "Chandelure");
            pokemonMap.put("蒂安希", "Diancie");
            pokemonMap.put("电飞鼠", "Emolga");
            pokemonMap.put("铳嘴大鸟", "Toucannon");
            pokemonMap.put("鸵鸟", "Espathra");
            pokemonMap.put("破破袋", "Trubbish");
            pokemonMap.put("多边兽", "Porygon");
            pokemonMap.put("蕾冠王", "Calyrex");
            pokemonMap.put("摩鲁蛾", "Venomoth");
            pokemonMap.put("熔岩虫", "Slugma");
            pokemonMap.put("迷布莉姆", "Hatenna");
            pokemonMap.put("粉蝶虫", "Scatterbug");
            pokemonMap.put("奈克洛兹玛", "Necrozma");
            pokemonMap.put("木木枭", "Rowlet");
            pokemonMap.put("战槌龙", "Rampardos");
            pokemonMap.put("铜象", "Cufant");
            pokemonMap.put("小碎钻", "Carbink");
            pokemonMap.put("火狐狸", "Fennekin");
            pokemonMap.put("狩猎凤蝶", "Beautifly");
            pokemonMap.put("蛇纹熊", "Zigzagoon");
            pokemonMap.put("赛富豪", "Gholdengo");
            pokemonMap.put("比比鸟", "Pidgeotto");
            pokemonMap.put("冰鬼护", "Glalie");
            pokemonMap.put("铁甲蛹", "Metapod");
            pokemonMap.put("丰蜜龙", "Bramblin");
            pokemonMap.put("酋雷姆", "Kyurem");
            pokemonMap.put("巨钳螳螂", "Scizor");
            pokemonMap.put("花洁夫人", "Florges");
            pokemonMap.put("小猫怪", "Shinx");
            pokemonMap.put("操陷蛛", "Spidops");
            pokemonMap.put("吉利蛋", "Chansey");
            pokemonMap.put("冷水猴", "Simipour");
            pokemonMap.put("电击怪", "Elekid");
            pokemonMap.put("天秤偶", "Baltoy");
            pokemonMap.put("大嘴雀", "Fearow");
            pokemonMap.put("沙基拉斯", "Pupitar");
            pokemonMap.put("烈咬陆鲨", "Garchomp");
            pokemonMap.put("敲音猴", "Grookey");
            pokemonMap.put("大嘴娃", "Mawile");
            pokemonMap.put("豆豆鸽", "Pidove");
            pokemonMap.put("骑拉帝纳", "Giratina");
            pokemonMap.put("波波", "Pidgey");
            pokemonMap.put("振翼发", "Flutter mane");
            pokemonMap.put("怨影娃娃", "Shuppet");
            pokemonMap.put("龙头地鼠", "Excadrill");
            pokemonMap.put("泡沫栗鼠", "Minccino");
            pokemonMap.put("奇诺栗鼠", "Cinccino");
            pokemonMap.put("铁辙迹", "Iron_treads");
            pokemonMap.put("科斯莫古", "Cosmog");
            pokemonMap.put("双刃丸", "Dewott");
            pokemonMap.put("玛沙那", "Meditite");
            pokemonMap.put("姆克鸟", "Staravia");
            pokemonMap.put("冰岩怪", "Avalugg");
            pokemonMap.put("猫鼬探长", "Gumshoos");
            pokemonMap.put("毛毛角羊", "Dubwool");
            pokemonMap.put("结草贵妇", "Wormadam");
            pokemonMap.put("猫鼬少", "Yungoos");
            pokemonMap.put("吼吼鲸", "Wailmer");
            pokemonMap.put("绅士蛾", "Mothim");
            pokemonMap.put("长毛巨魔", "Grimmsnarl");
            pokemonMap.put("坐骑小羊", "Skiddo");
            pokemonMap.put("巨石丁", "Stonjourner");
            pokemonMap.put("海地鼠", "Wiglett");
            pokemonMap.put("杖尾鳞甲龙", "Kommo-o");
            pokemonMap.put("大嘴蝠", "Golbat");
            pokemonMap.put("诈唬魔", "Morgrem");
            pokemonMap.put("润水鸭", "Quaxly");
            pokemonMap.put("铁磐岩", "Iron_boulder");
            pokemonMap.put("席多蓝恩", "Heatran");
            pokemonMap.put("蚊香泳士", "Poliwrath");
            pokemonMap.put("流氓熊猫", "Pangoro");
            pokemonMap.put("麒麟奇", "Girafarig");
            pokemonMap.put("好坏星", "Mareanie");
            pokemonMap.put("咕咕", "Hoothoot");
            pokemonMap.put("扒手猫", "Purrloin");
            pokemonMap.put("贪心栗鼠", "Skwovet");
            pokemonMap.put("幽尾玄鱼", "Basculegion");
            pokemonMap.put("小箭雀", "Fletchling");
            pokemonMap.put("大钳蟹", "Krabby");
            pokemonMap.put("巨牙鲨", "Sharpedo");
            pokemonMap.put("毛球", "Venonat");
            pokemonMap.put("珍珠贝", "Clamperl");
            pokemonMap.put("瓦斯弹", "Koffing");
            pokemonMap.put("破破舵轮", "Dhelmise");
            pokemonMap.put("兰螳花", "Lurantis");
            pokemonMap.put("恰雷姆", "Medicham");
            pokemonMap.put("毒藻龙", "Dragalge");
            pokemonMap.put("戴鲁比", "Houndour");
            pokemonMap.put("玛纳霏", "Manaphy");
            pokemonMap.put("差不多娃娃", "Audino");
            pokemonMap.put("哲尔尼亚斯", "Xerneas");
            pokemonMap.put("美洛耶塔", "Meloetta");
            pokemonMap.put("萌芽鹿", "Sawsbuck");
            pokemonMap.put("秃鹰丫头", "Vullaby");
            pokemonMap.put("小橄榄", "Smoliv");
            pokemonMap.put("鳃鱼海兽", "Arctovish");
            pokemonMap.put("亚克诺姆", "Azelf");
            pokemonMap.put("迷唇姐", "Jynx");
            pokemonMap.put("穿山鼠", "Sandshrew");
            pokemonMap.put("铁斑叶", "Iron_leaves");
            pokemonMap.put("蒂蕾喵", "Floragato");
            pokemonMap.put("头巾混混", "Scrafty");
            pokemonMap.put("铝钢龙", "Duraludon");
            pokemonMap.put("掘地兔", "Diggersby");
            pokemonMap.put("始祖小鸟", "Archen");
            pokemonMap.put("四季鹿", "Deerling");
            pokemonMap.put("冷水猴", "Panpour");
            pokemonMap.put("月月熊", "Ursaluna");
            pokemonMap.put("小果然", "Wynaut");
            pokemonMap.put("大嘴鸥", "Pelipper");
            pokemonMap.put("哥达鸭", "Golduck");
            pokemonMap.put("月桂叶", "Bayleef");
            pokemonMap.put("麻麻小鱼", "Tynamo");
            pokemonMap.put("美纳斯", "Milotic");
        }
    public static final List<String> POKEMON_NAMES = Arrays.asList(
                "Geodude", "Terrakion", "Wingull", "Silcoon", "Hariyama", "Absol", "Heliolisk", "Nacli", "Tentacool",
                "Mewtwo", "Chatot", "Sandaconda", "Scream tail", "Frillish", "Bellossom", "Foongus", "Zorua",
                "Vigoroth", "Toedscool", "Cinderace", "Revavroom", "Drilbur", "Golett", "Meowth", "Dwebble",
                "Electabuzz", "Conkeldurr", "Weavile", "Starly", "Dodrio", "Chespin", "Quilladin", "Kecleon",
                "Scolipede", "Banette", "Wurmple", "Capsakid", "Drifblim", "Landorus", "Arctibax", "Torterra",
                "Crabominable", "Kartana", "Vespiquen", "Pineco", "Charmander", "Oricorio", "Herdier", "Alomomola",
                "Klink", "Swanna", "Aerodactyl", "Parasect", "Krookodile", "Jangmo-o", "Toxtricity", "Nidoqueen",
                "Teddiursa", "Gothitelle", "Miltank", "Ferrothorn", "Zweilous", "Weezing", "Shroodle", "Cursola",
                "Drifloon", "Stunky", "Flittle", "Hydreigon", "Bronzong", "Corphish", "Crawdaunt", "Timburr",
                "Sentret", "Swalot", "Elgyem", "Zapdos", "Fomantis", "Dewgong", "Kleavor", "Barbaracle", "Sunkern",
                "Applin", "Slurpuff", "Mudkip", "Magmar", "Overqwil", "Caterpie", "Farfetchâ€™d", "Shiinotic",
                "Ursaring", "Altaria", "Gothita", "Inkay", "Yamper", "Naclstack", "Alakazam", "Luvdisc", "Komala",
                "Skiploom", "Heatmor", "Carvanha", "Sigilyph", "Mime jr.", "Baxcalibur", "Lunala", "Clodsire",
                "Clefable", "Malamar", "Budew", "Murkrow", "Centiskorch", "Typhlosion", "Magikarp", "Marowak",
                "Hoppip", "Barboach", "Zacian", "Omastar", "Sunflora", "Froslass", "Lumineon", "Litten",
                "Meowscarada", "Passimian", "Terapagos", "Amoonguss", "Shroomish", "Spewpa", "Duskull", "Enamorus",
                "Eldegoss", "Lycanroc", "Glaceon", "Wimpod", "Glimmora", "Victreebel", "Kingler", "Regice",
                "Cascoon", "Kabutops", "Hippopotas", "Swellow", "Regieleki", "Sizzlipede", "Bergmite", "Volbeat",
                "Varoom", "Leavanny", "Cutiefly", "Ditto", "Drampa", "Goodra", "Brute bonnet", "Roaring moon",
                "Darumaka", "Shellder", "Mantyke", "Grafaiai", "Rufflet", "Rookidee", "Helioptile", "Dratini",
                "Ribombee", "Tapu koko", "Slaking", "Chewtle", "Dialga", "Electrode", "Pancham", "Silvally",
                "Mamoswine", "Garbodor", "Naganadel", "Unfezant", "Furret", "Lampent", "Kricketot", "Mew",
                "Piloswine", "Wobbuffet", "Great tusk", "Octillery", "Mudbray", "Omanyte", "Monferno", "Poipole",
                "Makuhita", "Snubbull", "Duosion", "Magcargo", "Reuniclus", "Dewpider", "Primarina", "Infernape",
                "Patrat", "Ho-oh", "Jigglypuff", "Beldum", "Ralts", "Finizen", "Ekans", "Vanillish", "Misdreavus",
                "Marill", "Skitty", "Celesteela", "Cacturne", "Slakoth", "Poochyena", "Pachirisu", "Loudred",
                "Seaking", "Chikorita", "Mr. rime", "Bastiodon", "Nickit", "Wigglytuff", "Mareep", "Aromatisse",
                "Toxel", "Celebi", "Poliwhirl", "Finneon", "Trevenant", "Remoraid", "Vanillite", "Woobat",
                "Pincurchin", "Cranidos", "Azurill", "Regigigas", "Tinkaton", "Phantump", "Sealeo", "Cubchoo",
                "Gloom", "Dustox", "Swirlix", "Trapinch", "Sinistcha", "Bonsly", "Frosmoth", "Zangoose",
                "Garganacl", "Arbok", "Wo-chien", "Bagon", "Scorbunny", "Gastrodon", "Kricketune", "Clauncher",
                "Ogerpon", "Donphan", "Bronzor", "Dunsparce", "Tyranitar", "Fletchinder", "Tapu bulu", "Spoink",
                "Noibat", "Tyrunt", "Sceptile", "Diglett", "Squirtle", "Ledyba", "Prinplup", "Minun", "Rayquaza",
                "Snivy", "Shieldon", "Hoopa", "Accelgor", "Crabrawler", "Lickitung", "Seel", "Kirlia", "Chien-pao",
                "Cubone", "Appletun", "Squawkabilly", "Nidoran-m", "Scyther", "Riolu", "Runerigus", "Fezandipiti",
                "Nidoran-f", "Seedot", "Slither wing", "Anorith", "Paras", "Turtwig", "Pyukumuku", "Impidimp",
                "Boldore", "Incineroar", "Mimikyu", "Magneton", "Yamask", "Shelgon", "Umbreon", "Marshadow",
                "Tangela", "Okidogi", "Torchic", "Krokorok", "Simisear", "Arrokuda", "Maractus", "Abra",
                "Iron_jugulis", "Lilligant", "Aggron", "Blitzle", "Burmy", "Bellibolt", "Floatzel", "Servine",
                "Gogoat", "Cosmoem", "Tepig", "Vibrava", "Ducklett", "Urshifu", "Feebas", "Pyroar", "Sewaddle",
                "Metang", "Ninjask", "Whimsicott", "Gothorita", "Nidoking", "Litwick", "Galvantula", "Vaporeon",
                "Wyrdeer", "Buzzwole", "Orthworm", "Morelull", "Tadbulb", "Linoone", "Nincada", "Spritzee",
                "Drizzile", "Dondozo", "Spheal", "Corviknight", "Shedinja", "Slowpoke", "Goomy", "Gurdurr",
                "Volcanion", "Escavalier", "Tinkatink", "Grimer", "Karrablast", "Phione", "Inteleon", "Lucario",
                "Popplio", "Growlithe", "Volcarona", "Zebstrika", "Yanmega", "Hatterene", "Illumise", "Luxio",
                "Purugly", "Sandile", "Zygarde", "Chinchou", "Shaymin", "Dusknoir", "Quaquaval", "Tentacruel",
                "Magmortar", "Cofagrigus", "Petilil", "Perrserker", "Bewear", "Goldeen", "Decidueye", "Torracat",
                "Electrike", "Jolteon", "Swoobat", "Nihilego", "Lugia", "Tyrogue", "Exeggutor", "Bombirdier",
                "Pikachu", "Coalossal", "Polteageist", "Honedge", "Snorunt", "Snover", "Shuckle", "Munkidori",
                "Staraptor", "Oshawott", "Larvitar", "Mightyena", "Croagunk", "Archaludon", "Machop", "Silicobra",
                "Spinda", "Grubbin", "Milcery", "Tirtouga", "Ambipom", "Kangaskhan", "Dachsbun", "Braixen",
                "Weepinbell", "Ivysaur", "Nosepass", "Druddigon", "Weedle", "Pheromosa", "Roggenrola", "Voltorb",
                "Tapu lele", "Haunter", "Mr. mime", "Amaura", "Froakie", "Bulbasaur", "Doduo", "Tornadus",
                "Ariados", "Leafeon", "Lickilicky", "Grovyle", "Salandit", "Musharna", "Hitmonchan", "Dragapult",
                "Espurr", "Klefki", "Kakuna", "Stoutland", "Muk", "Skrelp", "Magby", "Togekiss", "Clobbopus",
                "Carnivine", "Skeledirge", "Raticate", "Rabsca", "Uxie", "Maushold", "Spinarak", "Skuntank",
                "Mandibuzz", "Walrein", "Archeops", "Drapion", "Persian", "Greedent", "Steelix", "Gigalith",
                "Araquanid", "Onix", "Stufful", "Glimmet", "Blaziken", "Moltres", "Machamp", "Flygon", "Axew",
                "Bounsweet", "Type: null", "Palafin", "Cryogonal", "Xatu", "Blissey", "Kilowattrel", "Zarude",
                "Regirock", "Claydol", "Wugtrio", "Blastoise", "Roselia", "Forretress", "Houndoom", "Golurk",
                "Liepard", "Lokix", "Sandslash", "Quagsire", "Mienfoo", "Jumpluff", "Braviary", "Swadloon",
                "Salazzle", "Pecharunt", "Cottonee", "Ninetales", "Igglybuff", "Charizard", "Walking wake",
                "Toxicroak", "Sylveon", "Falinks", "Mismagius", "Joltik", "Cradily", "Sirfetchâ€™d", "Tangrowth",
                "Crustle", "Vikavolt", "Serperior", "Simisage", "Grumpig", "Iron_thorns", "Rattata", "Golisopod",
                "Lileep", "Venusaur", "Roserade", "Nidorino", "Talonflame", "Flareon", "Arcanine", "Nidorina",
                "Chimchar", "Gyarados", "Doublade", "Keldeo", "Gengar", "Spiritomb", "Delphox", "Tarountula",
                "Flapple", "Latios", "Dottler", "Victini", "Zubat", "Hitmontop", "Azumarill", "Phanpy", "Horsea",
                "Numel", "Seviper", "Nuzleaf", "Oranguru", "Flamigo", "Farigiraf", "Clawitzer", "Gorebyss",
                "Chingling", "Klawf", "Trumbeak", "Tatsugiri", "Quilava", "Seadra", "Cloyster", "Wailord",
                "Gimmighoul", "Watchog", "Qwilfish", "Brionne", "Arctozolt", "Camerupt", "Gourgeist", "Sprigatito",
                "Cherrim", "Kingdra", "Basculin", "Haxorus", "Hitmonlee", "Flaaffy", "Quaxwell", "Drakloak",
                "Rhyperior", "Dipplin", "Charcadet", "Dragonair", "Flabebe", "Whismur", "Binacle", "Tsareena",
                "Dolliv", "Beedrill", "Drowzee", "Aipom", "Pansear", "Spectrier", "Chi-yu", "Solosis", "Graveler",
                "Ampharos", "Lanturn", "Combee", "Sobble", "Entei", "Yveltal", "Steenee", "Regidrago", "Pumpkaboo",
                "Fraxure", "Raging bolt", "Armarouge", "Dugtrio", "Whiscash", "Guzzlord", "Togepi", "Minior",
                "Feraligatr", "Poltchageist", "Toxapex", "Kingambit", "Electivire", "Wooper", "Probopass", "Psyduck",
                "Thwackey", "Rellor", "Kabuto", "Obstagoon", "Mabosstiff", "Iron_valiant", "Rotom", "Bunnelby",
                "Greavard", "Barraskewda", "Cresselia", "Magnezone", "Poliwag", "Suicune", "Bruxish", "Gliscor",
                "Bouffalant", "Plusle", "Thundurus", "Mantine", "Sawk", "Pansage", "Vivillon", "Hakamo-o", "Comfey",
                "Corvisquire", "Bidoof", "Zekrom", "Thievul", "Shiftry", "Tandemaus", "Nymble", "Sandygast", "Eevee",
                "Palpitoad", "Raboot", "Snom", "Annihilape", "Cobalion", "Gouging fire", "Reshiram", "Aron", "Eiscue",
                "Turtonator", "Croconaw", "Skarmory", "Taillow", "Cacnea", "Gabite", "Happiny", "Glameow", "Meltan",
                "Grapploct", "Togetic", "Exploud", "Chimecho", "Ferroseed", "Pidgeot", "Cyclizar", "Melmetal",
                "Gulpin", "Masquerain", "Tapu fini", "Ting-lu", "Bibarel", "Manectric", "Lunatone", "Smeargle",
                "Kyogre", "Vulpix", "Unown", "Palkia", "Butterfree", "Furfrou", "Clefairy", "Cramorant", "Houndstone",
                "Rhydon", "Sneasel", "Primeape", "Samurott", "Stakataka", "Registeel", "Scraggy", "Zamazenta",
                "Hippowdon", "Empoleon", "Lairon", "Swinub", "Durant", "Shelmet", "Virizion", "Floette", "Crobat",
                "Starmie", "Kubfu", "Lechonk", "Lombre", "Carkol", "Sandy shocks", "Aegislash", "Dreepy", "Deino",
                "Tranquill", "Chesnaught", "Lotad", "Treecko", "Frogadier", "Combusken", "Gardevoir", "Raikou",
                "Dracovish", "Relicanth", "Granbull", "Indeedee", "Yanma", "Pawmot", "Skorupi", "Surskit", "Gossifleur",
                "Carracosta", "Fuecoco", "Hypno", "Scovillain", "Ponyta", "Fidough", "Alcremie", "Throh", "Swampert",
                "Armaldo", "Deoxys", "Tropius", "Ledian", "Articuno", "Bellsprout", "Maschiff", "Castform",
                "Iron_hands", "Beartic", "Gligar", "Delibird", "Golem", "Slowbro", "Corsola", "Pawmi", "Sudowoodo",
                "Whirlipede", "Noctowl", "Koraidon", "Heracross", "Wishiwashi", "Klinklang", "Veluza", "Pignite",
                "Sliggoo", "Ceruledge", "Pawmo", "Oinkologne", "Mudsdale", "Salamence", "Wattrel", "Stantler",
                "Latias", "Porygon2", "Arceus", "Honchkrow", "Magearna", "Venipede", "Cherubi", "Mesprit", "Staryu",
                "Beheeyem", "Mienshao", "Larvesta", "Vanilluxe", "Blacephalon", "Vileplume", "Eelektrik", "Miraidon",
                "Aurorus", "Rhyhorn", "Charjabug", "Metagross", "Wartortle", "Copperajah", "Bisharp", "Groudon",
                "Sinistea", "Gallade", "Porygon-z", "Boltund", "Eternatus", "Gastly", "Meganium", "Lopunny",
                "Cyndaquil", "Pawniard", "Cetitan", "Rillaboom", "Cetoddle", "Iron_moth", "Magnemite", "Crocalor",
                "Toedscruel", "Solrock", "Orbeetle", "Klang", "Dusclops", "Swablu", "Buneary", "Jellicent", "Meowstic",
                "Lapras", "Dudunsparce", "Snorlax", "Exeggcute", "Oddish", "Cleffa", "Darkrai", "Totodile", "Ludicolo",
                "Breloom", "Dracozolt", "Tinkatuff", "Frigibax", "Genesect", "Tauros", "Marshtomp", "Seismitoad",
                "Piplup", "Wooloo", "Luxray", "Munna", "Noivern", "Hydrapple", "Hattrem", "Hawlucha", "Smoochum",
                "Pikipek", "Eelektross", "Brambleghast", "Pinsir", "Torkoal", "Dedenne", "Slowking", "Buizel",
                "Rockruff", "Munchlax", "Charmeleon", "Drednaw", "Mankey", "Zeraora", "Pichu", "Delcatty", "Xurkitree",
                "Abomasnow", "Sneasler", "Arboliva", "Raichu", "Darmanitan", "Togedemaru", "Iron_crown", "Litleo",
                "Stunfisk", "Huntail", "Gible", "Emboar", "Espeon", "Dragonite", "Lillipup", "Kadabra", "Tyrantrum",
                "Zoroark", "Palossand", "Solgaleo", "Grotle", "Blipbug", "Rapidash", "Iron_bundle", "Morpeko",
                "Tympole", "Jirachi", "Spearow", "Greninja", "Natu", "Glastrier", "Machoke", "Rolycoly", "Shellos",
                "Sableye", "Dartrix", "Politoed", "Chandelure", "Diancie", "Emolga", "Toucannon", "Espathra",
                "Trubbish", "Porygon", "Calyrex", "Venomoth", "Slugma", "Hatenna", "Scatterbug", "Necrozma", "Rowlet",
                "Rampardos", "Cufant", "Carbink", "Fennekin", "Beautifly", "Zigzagoon", "Gholdengo", "Pidgeotto",
                "Glalie", "Metapod", "Bramblin", "Kyurem", "Scizor", "Florges", "Shinx", "Spidops", "Chansey",
                "Simipour", "Elekid", "Baltoy", "Fearow", "Pupitar", "Garchomp", "Grookey", "Mawile", "Pidove",
                "Giratina", "Pidgey", "Flutter mane", "Shuppet", "Excadrill", "Minccino", "Cinccino", "Iron_treads",
                "Cosmog", "Dewott", "Meditite", "Staravia", "Avalugg", "Gumshoos", "Dubwool", "Wormadam", "Yungoos",
                "Wailmer", "Mothim", "Grimmsnarl", "Skiddo", "Stonjourner", "Wiglett", "Kommo-o", "Golbat", "Morgrem",
                "Quaxly", "Iron_boulder", "Heatran", "Poliwrath", "Pangoro", "Girafarig", "Mareanie", "Hoothoot",
                "Purrloin", "Skwovet", "Basculegion", "Fletchling", "Krabby", "Sharpedo", "Venonat", "Clamperl",
                "Koffing", "Dhelmise", "Lurantis", "Medicham", "Dragalge", "Houndour", "Manaphy", "Audino", "Xerneas",
                "Meloetta", "Sawsbuck", "Vullaby", "Smoliv", "Arctovish", "Azelf", "Jynx", "Sandshrew", "Iron_leaves",
                "Floragato", "Scrafty", "Duraludon", "Diggersby", "Archen", "Deerling", "Panpour", "Ursaluna", "Wynaut",
                "Pelipper", "Golduck", "Bayleef", "Tynamo", "Milotic"
    );
    public static String getChineseName(String chineseName) {
        return pokemonMap.get(chineseName);
    }//返回英文名

    public static boolean isPokemonName(String name) {
        String formattedName = name.replace(' ', '_');
        return POKEMON_NAMES.contains(formattedName);
    }//判断是否为宝可梦名

}

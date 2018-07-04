package org.ansj.test;

import org.ansj.domain.Term;
import org.ansj.library.AmbiguityLibrary;
import org.ansj.library.DicLibrary;
<<<<<<< HEAD
import org.ansj.recognition.impl.UserDicNatureRecognition;
import org.ansj.splitWord.analysis.ToAnalysis;
=======
import org.ansj.library.SynonymsLibrary;
import org.ansj.splitWord.analysis.DicAnalysis;
import org.ansj.splitWord.analysis.NlpAnalysis;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.ansj.util.MyStaticValue;
>>>>>>> ce4dd92f979b88c76c9fe7d16600fc426c0c6432
import org.junit.Test;
import org.nlpcn.commons.lang.tire.domain.SmartForest;

import java.util.List;


public class TestError {

	@Test
	public void test() throws Exception {
//
//		Forest forest = new Forest();
//
//		Library.insertWord(forest, "苹果果醋\t10\t10");
//		Library.insertWord(forest, "苹果\t10	10");
//		Library.insertWord(forest, "苹果醋	10	10");
//		Library.insertWord(forest, "果醋	10	10");
//
//		DicLibrary.put(DicLibrary.DEFAULT, DicLibrary.DEFAULT, forest);
//
//		Result re = DicAnalysis.parse("发扬光大对方地方看苹果醋");
//		System.out.println(re);
//
//		DicLibrary.insert(DicLibrary.DEFAULT,"中性粒细胞百分数neut%", "clear", 2000);
//		DicLibrary.insert(DicLibrary.DEFAULT,"中性粒细胞百分数neut", "clear", 2000);
//		DicLibrary.insert(DicLibrary.DEFAULT,"neut%", "clear", 2000);
//
//		String str = "2中性粒细胞百分数NEUT%70.2040.00--75.00%";
//		System.out.println(ToAnalysis.parse(str));
//
//		LearnTool tool = new LearnTool();
//		System.out.println(NlpAnalysis.parse("这次回家，我经济南下广州"));
//		System.out.println(NlpAnalysis.parse("从古至今为何经济南强北弱?军事则北强南弱?_百度知道"));
//		System.out.println(NlpAnalysis.parse("确保今年８％的增长速度"));
//		System.out.println(ToAnalysis.parse("美白面膜"));
//
//		DicLibrary.insert(DicLibrary.DEFAULT,"面膜", "n", 1000);
//
//		//		System.out.println(ToAnalysis.parse("美白面膜"));
//		System.out.println("aa");
//		System.out.println(ToAnalysis.parse("999牌 感冒灵颗粒 10g*9包  解热镇痛，用于感冒引起的头痛、发热"));
//
//		List<Term> parse = ToAnalysis.parse("我得了感冒").getTerms();
//		System.out.println(parse);
//
//		System.out.println(IndexAnalysis.parse("主副食品 软件设计"));
//
//		System.out.println(ToAnalysis.parse("工信处女干事每月经过下属科室都要亲口交代24口交换机等技术性器件的安装工作"));
//		System.out.println(ToAnalysis.parse("365日历，日历-万年历"));
//		System.out.println(NlpAnalysis.parse("这次回家，我经济南下广州"));
//		System.out.println(NlpAnalysis.parse("从古至今为何经济南强北弱?军事则北强南弱?_百度知道"));
//		System.out.println(NlpAnalysis.parse("确保今年８％的增长速度"));
//		System.out.println(NlpAnalysis.parse("越体越中意"));
//		System.out.println(NlpAnalysis.parse("在类似：1.三（接汉字数字时），会把这个汉字数字和1.放在一块作为一个数字 "));
//		System.out
//				.println(NlpAnalysis
//						.parse("一、概述正如上一篇博客，程序并没有主动设置PersonService实例的name属性值，而是通过Spring配置文件配置的，这就是说，PersonService实例的属性值并不是程序主动设置的，而是由Spring容器来负责注入的。在依赖注入的模式下，创建被调用者的工作不再由调用者来完成，因此称为控制反转（IoC）。创建被调用者实例的工作通常由Spring容器来完成，然后注入调用者，因此也称为......"));
//		System.out
//				.println(NlpAnalysis
//						.parse("【万维网诞生25周年啦】1989年，《辛普森一家》走上银幕，“哈利波特”出生，伯纳斯-李发明万维网，并在1990年向世界免费公布了代码，把互联网从专业人士和少数狂热分子的数据传输系统转变为普通人的技术。1995年，42%的美国人从未听说过互联网，只有14%的人上过，2014年已达87%http://t.cn/8F1g3Mv"));
//		System.out.println(NlpAnalysis.parse("西伯利亚雅特大教堂位于俄罗斯东西伯利亚地区"));
//		System.out.println(NlpAnalysis.parse("西伯利亚雅特大教堂位于俄罗斯东西伯利亚地区西伯利亚雅特大教堂位于俄罗斯东西伯利亚地区西伯利亚雅特大教堂位于俄罗斯东西伯利亚地区西伯利亚雅特大教堂位于俄罗斯东西伯利亚地区西伯利亚雅特大教堂位于俄罗斯东西伯利亚地区西伯利亚雅特大教堂位于俄罗斯东西伯利亚地区"));
//
//		System.out.println(ToAnalysis.parse("孙红雷暴打记者中国娱乐界如此蛮横"));
//
//		System.out.println(CrfLibrary.get().cohesion("念地"));
//		System.out.println(CrfLibrary.get().cohesion("地藏"));
//
//		// 歧义纠正
//
//		AmbiguityLibrary.insert(AmbiguityLibrary.DEFAULT,"川府办", "n");
//
//		AmbiguityLibrary.insert(AmbiguityLibrary.DEFAULT,"京财企", "nt", "业务", "j");
//
//		System.out.println(NlpAnalysis.parse("驻京办发文出来了"));
//		;
//		System.out.println(NlpAnalysis.parse("据说川府办发的发文很厉害"));
//		;
//		System.out.println(NlpAnalysis.parse("京财企业务繁忙"));
//		MyStaticValue.isNumRecognition = false;
//		System.out.println(ToAnalysis.parse("0.46毫克"));
//		;
//
//
//		System.out.println(ToAnalysis.parse("上海马勒别墅"));
//		System.out.println(ToAnalysis.parse("电话卡+周杰伦摩天轮"));
//		System.out.println(ToAnalysis.parse("陆成恩和孙健是好朋友"));
//		System.out.println(ToAnalysis.parse("热海景区+"));
//
//
//		System.out.println(ToAnalysis.parse("同仁堂 六味地黄丸 30"));
//		System.out.println(ToAnalysis.parse("这样搜索曼秀雷敦肌研的东西也会出现"));
//
//		System.out.println(ToAnalysis.parse("联合国;"));
//
//		System.out.println(ToAnalysis.parse(";"));
//
//		List<String> all = new ArrayList<String>();
//
//		all.add("某地区大地震后救灾工作程序示意图");
//		all.add("大地震后");
//		all.add("10,上城区小营街道大学路,余林,330102196204011513 ,2,13456808992,大学路新村44-122-102,大学路新村44-122-102,Z2015120110302017,Z,2015    -12-25");
//		all.add("某品牌企业在京津冀地区建有饮用瓶装水厂");
//		all.add("黄山16点前日出东北方");
//		all.add("与其它洋流交汇的海域不易形成渔场");
//		all.add("同类景观多出现在");
//		all.add("据说ｗｉｎｄｏｗｓ９５推出前，考虑到低性能电脑安装它的时间很长，微软公司曾向心理学家请教，怎样在安装等待过程中设计出活动的画面才能让用户不致焦躁。");
//		all.add("从古至今为何经济南强北弱?军事则北强南弱?_百度知道");
//		all.add("孙红雷暴打记者中国娱乐界如此蛮横");
//		all.add("发展中国家庭养猪事业");
//		all.add("六味地黄丸软胶囊");
//		all.add("8李建华、洪瑛,水澄花园北苑1幢2单元801室,浙AA09362220,南星街道,2006/11/28");
//		all.add("浙杭上城结1997字第971662号,1997-10-06,,,上城区婚姻登记处,,1997-10-06,,,,李建华,,330102600702121,19600702,,,职员,,直大方伯八叉弄4号104室,,,,王桂花,,330106601004002,19601004,,,职工,,文三路4号217室,,,");
//		all.add("10,上城区小营街道大学路,余林,330102196204011513 ,2,13456808992,大学路新村44-122-102,大学路新村44-122-102,Z2015120110302017,Z,2015-12-25");
//
//		all.add("六味地黄丸");
//		all.add("2015年6月3日");
//		//	    System.out.println(ToAnalysis.parse("你吃过了吗？？没吃"));
//		//	    System.out.println(NlpAnalysis.parse("你吃过了吗？？没吃"));
//
//
//		for (String string : all) {
//			System.out.println(ToAnalysis.parse(string));
//			System.out.println(NlpAnalysis.parse(string));
//			System.out.println(IndexAnalysis.parse(string));
//		}
//
//		System.out.println(DATDictionary.getItem(" "));
//		System.out.println(DATDictionary.getItem("	"));
//
//
//		System.out.println(NlpAnalysis.parse("2015年无锡市突发环境事件"));
//
//		//dic分词诡异的bug，自定义词不起作用，非常诡异！ #398
//		MyStaticValue.isRealName = true;
//		DicLibrary.insert(DicLibrary.DEFAULT, "英雄联盟");
//		DicLibrary.insert(DicLibrary.DEFAULT, "英联");
//		System.out.println(DicAnalysis.parse("英雄联盟"));
//
//
//		System.out.println(ToAnalysis.parse(""));
//		System.out.println(DicAnalysis.parse(""));
//		System.out.println(ToAnalysis.parse("大"));
//		System.out.println(DicAnalysis.parse("大"));
//
//		Forest dict1 = new Forest();
//		Library.insertWord(dict1, new Value("苹果", "userDefine", "1000"));
//		Library.insertWord(dict1, new Value("咖啡", "userDefine", "1000"));
//		System.out.println(DicAnalysis.parse("吃苹果喝咖啡", dict1));
//
//		//#385 ansj_seg5.0.3版本，加载了默认的default.dic后，句子中带“哎咿呀”的，分词时会报错
//		System.out.println(DicAnalysis.parse("哎咿呀"));
//
//		// #386
//		parse = NlpAnalysis.parse("身高170 出生在1990年 人").getTerms();
//
//
//		System.out.println(DicAnalysis.parse("大"));
//		System.out.println(DicAnalysis.parse("“Microsoft”一词由“MICROcomputer（微型计算机）”和“SOFTware（软件）”两部分组成"));
//		System.out.println(DicAnalysis.parse("┏┏┏┏┏玫玫玫玫玫玫12312312玫玫玫玫玫玫玫"));
//		System.out.println(DicAnalysis.parse("┏┏┏┏┏玫玫玫玫玫玫玫玫玫玫玫玫玫"));
//		System.out.println(DicAnalysis.parse("┏┏┏┏┏玫玫玫玫玫玫玫玫玫玫玫玫玫", null));
//		System.out.println(DicAnalysis.parse("┏玫┏红色┏玫红┏色┏玫红色", null));
//
//		System.out.println(ToAnalysis.parse("┏玫红色玫红色玫红色", null));
//
//		//5.1.0版本dic分词加入的词无效 #409
//
//		DicLibrary.insert(DicLibrary.DEFAULT, "琅琊榜", "user", 1000);
//		DicLibrary.insert(DicLibrary.DEFAULT, "玫红色");
//		System.out.println(ToAnalysis.parse("玫红色玫红色玫红色"));
//		System.out.println(DicAnalysis.parse("琅琊榜"));
//
//		DicLibrary.insert(DicLibrary.DEFAULT, "动漫游戏", "n", 10000);
//		System.out.println(IndexAnalysis.parse("邓超过生日玩动漫游戏"));
//		System.out.println(ToAnalysis.parse("邓超过生日玩动漫游戏"));
//		DicLibrary.insert(DicLibrary.DEFAULT, "邓超", "nr", 10000);
//		System.out.println(DicAnalysis.parse("邓超过生日玩动漫游戏"));
//
//		System.out.println(DicAnalysis.parse("女装照"));
//
//		String key = "dic_entity";
//		DicLibrary.put(key, key, new Forest());
//		DicLibrary.insert(key, "魅族", "entity", 1000);
//		DicLibrary.insert(key, "骁龙", "entity", 1000);
//		System.out.println(DicAnalysis.parse("魅族", DicLibrary.gets(key)));
//		System.out.println(ToAnalysis.parse("魅族", DicLibrary.gets(key)));
//		System.out.println(DicAnalysis.parse("骁龙", DicLibrary.gets(key)));
//		System.out.println(ToAnalysis.parse("骁龙", DicLibrary.gets(key)));
//
//
//		System.out.println(ToAnalysis.parse("提醒我吃饭"));
//		System.out.println(IndexAnalysis.parse("提醒我吃饭"));

//		DicLibrary.insert(DicLibrary.DEFAULT,"mmol/L","danwei",10000);
//		DicLibrary.insert(DicLibrary.DEFAULT,"/HP","danwei",10000);
//		DicLibrary.insert(DicLibrary.DEFAULT,"mmHg","danwei",10000);
//		DicLibrary.insert(DicLibrary.DEFAULT,"℃","danwei",10000);

//		MyStaticValue.isQuantifierRecognition = false ;

//		DicLibrary.insert(DicLibrary.DEFAULT,"mmol/L".toLowerCase(),"danwei",10000);
//		DicLibrary.insert(DicLibrary.DEFAULT,"/HP".toLowerCase(),"danwei",10000);
//		DicLibrary.insert(DicLibrary.DEFAULT,"mmHg".toLowerCase(),"danwei",10000);
//		DicLibrary.insert(DicLibrary.DEFAULT,"℃".toLowerCase(),"danwei",10000);
//
//
//		Result recognition = ToAnalysis.parse("速度0.2mmol/L, Hg高88mmHg，体温为31.5℃").recognition(new UserDicNatureRecognition());
//		System.out.println(recognition);
//		recognition = DicAnalysis.parse("速度0.2mmol/L, Hg高88mmHg，体温为31.5℃");
//		System.out.println(recognition);

//		DicLibrary.insertOrCreate(DicLibrary.DEFAULT,"高清","pos",100000);
//		DicLibrary.insertOrCreate(DicLibrary.DEFAULT,"真机","describe",100000);
//
//		System.out.println(DicAnalysis.parse("高清真机"));

<<<<<<< HEAD
//		System.out.println(ToAnalysis.parse("在宴会上上了头条"));
//		System.out.println(NlpAnalysis.parse("在宴会上上了头条"));
//		System.out.println(DicAnalysis.parse("在宴会上上了头条"));
//		System.out.println(BaseAnalysis.parse("在宴会上上了头条"));


		DicLibrary.insert(DicLibrary.DEFAULT,"阿司匹林","drug",2000);

		System.out.println(DicLibrary.get().getWord("阿司匹林").getParam(0));

		System.out.println(ToAnalysis.parse("我爱吃阿司匹林").recognition(new UserDicNatureRecognition()));
=======

//		DicLibrary.insertOrCreate(DicLibrary.DEFAULT,"弹幕墙","n",1000);
//
//		System.out.println(DicAnalysis.parse("进来教你弹幕墙制作O(∩_∩)O~_日常_生活_bilibili_哔哩哔哩"));
//		System.out.println(NlpAnalysis.parse("进来教你弹幕墙制作O(∩_∩)O~_日常_生活_bilibili_哔哩哔哩"));
//		System.out.println(ToAnalysis.parse("进来教你弹幕墙制作O(∩_∩)O~_日常_生活_bilibili_哔哩哔哩"));

		AmbiguityLibrary.insert(AmbiguityLibrary.DEFAULT,"查", "a","本省","b");
>>>>>>> ce4dd92f979b88c76c9fe7d16600fc426c0c6432

		System.out.println(NlpAnalysis.parse("查本省内无此人"));
		System.out.println(ToAnalysis.parse("查本省内无此人"));
		System.out.println(DicAnalysis.parse("查本省内无此人"));
		System.out.println(DicAnalysis.parse("发展中国家庭养猪事业"));
		System.out.println(NlpAnalysis.parse("发展中国家庭养猪事业"));
		System.out.println(ToAnalysis.parse("计划建立一个5万公顷面积的航天站"));
		String test = "[科技]速度对比！小米6 大战 三星S8！贵不一定好 这种对比手段特别傻逼～真的。\n" +
				"一点意义也没有～\n" +
				"另外，好好练习你的普通发～";

		for (Term term : NlpAnalysis.parse(test)) {
			System.out.println(term.getName()+" : "+term.getNatureStr());
		}

		SynonymsLibrary.put(SynonymsLibrary.DEFAULT,SynonymsLibrary.DEFAULT,new SmartForest<List<String>>());
		SynonymsLibrary.insert(SynonymsLibrary.DEFAULT, new String[] { "兰多", "兰少" });
	}
}

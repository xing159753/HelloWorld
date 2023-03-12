package com.xing.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 体验正则表达式的威力，给我们文本处理带来了哪些便利
 */
public class Regexp_ {
    public static void main(String[] args) {

        //假定，编写了爬虫，从百度页面得到如下文本
//        String content = "站在阳台上，望着远处的山，太阳艰难的跳过大山，露出脸来。" +
//                "大学生活体验第一天，正式开始，按照计划做完功课已经是中午十一点，" +
//                "没有早餐，此时肚子已经咕噜噜直叫，姐姐煮的方便面，很香，让我惊喜" +
//                "的是碗底还有荷包蛋“因为第一天，送你一个荷包蛋，从明天开始，生活可能就" +
//                "会发生很大变化，在这里不比在家，条件没有你想的那样优越，饭没有在家的好" +
//                "这是必然，水需要自己去烧，衣服需要自己去洗，不能再和家里一样挑食，有什" +
//                "么吃什么，填饱肚子就好。爸妈平时宠你是他们觉得你还是个孩子，不能处理自己的" +
//                "事，姐姐希望你能真正长大，自力更生，因为你明年就要上大学，基本的生活你都不" +
//                "能自理，以后要怎样。在这里，要坚强，不能轻易掉眼泪，没人会心疼你，摔倒" +
//                "需要自己爬起来，大学是这样，步入社会亦是如此，不要让别人觉得你是一个长不大" +
//                "的孩子，是一个懦弱的人，知道吗？”";

//        String content = "</ul>\n" +
//                "<div class=\"separator\"></div>\n" +
//                "<div class=\"wiki-common-headTabBar\">\n" +
//                "<a href=\"https://www.baidu.com/\" nslog=\"normal\" nslog-type=\"10600112\" data-href=\"https://www.baidu.com/s?ie=utf-8&fr=bks0000&wd=\">网页</a>\n" +
//                "<a href=\"http://news.baidu.com/\" nslog=\"normal\" nslog-type=\"10600112\" data-href=\"http://news.baidu.com/ns?tn=news&cl=2&rn=20&ct=1&fr=bks0000&ie=utf-8&word=\">新闻</a>\n" +
//                "<a href=\"https://tieba.baidu.com/\" nslog=\"normal\" nslog-type=\"10600112\" data-href=\"https://tieba.baidu.com/f?ie=utf-8&fr=bks0000&kw=\">贴吧</a>\n" +
//                "<a href=\"https://zhidao.baidu.com/\" nslog=\"normal\" nslog-type=\"10600112\" data-href=\"https://zhidao.baidu.com/search?pn=0&&rn=10&lm=0&fr=bks0000&word=\">知道</a>\n" +
//                "<a href=\"https://pan.baidu.com?from=1027327l\" nslog=\"normal\" nslog-type=\"10600112\" data-href=\"https://pan.baidu.com/disk/home#/search?from=1027327l&key=\">网盘</a>\n" +
//                "<a href=\"http://image.baidu.com/\" nslog=\"normal\" nslog-type=\"10600112\" data-href=\"http://image.baidu.com/search/index?tn=baiduimage&ct=201326592&lm=-1&cl=2&nc=1&ie=utf-8&word=\">图片</a>\n" +
//                "<a href=\"http://v.baidu.com/\" nslog=\"normal\" nslog-type=\"10600112\" data-href=\"https://www.baidu.com/sf/vsearch?pd=video&tn=vsearch&ie=utf-8&rsv_spt=17&wd=\">视频</a>\n" +
//                "<a href=\"http://map.baidu.com/\" nslog=\"normal\" nslog-type=\"10600112\" data-href=\"http://map.baidu.com/m?ie=utf-8&fr=bks0000&word=\">地图</a>\n" +
//                "<a href=\"https://wenku.baidu.com/\" nslog=\"normal\" nslog-type=\"10600112\" data-href=\"https://wenku.baidu.com/search?lm=0&od=0&ie=utf-8&fr=bks0000&word=\">文库</a>\n" +
//                "<b class=\"baike\">百科</b>\n" +
//                "</div>\n" +
//                "</div>\n" +
//                "<div class=\"header\">\n" +
//                "<div class=\"layout\">\n" +
//                "<div class=\"wgt-searchbar wgt-searchbar-new wgt-searchbar-main cmn-clearfix wgt-searchbar-large\">\n" +
//                "<div class=\"logo-container\">\n" +
//                "<a class=\"logo cmn-inline-block\" title=\"到百科首页\" href=\"/#home\">\n" +
//                "<span class=\"cmn-baike-logo\">\n" +
//                "<em class=\"cmn-icon cmn-icons cmn-icons_logo-bai\"></em>\n" +
//                "<em class=\"cmn-icon cmn-icons cmn-icons_logo-du\"></em>\n" +
//                "<em class=\"cmn-icon cmn-icons cmn-icons_logo-baike\"></em>\n" +
//                "</span>\n" +
//                "</a>\n" +
//                "</div>\n" +
//                "<div class=\"search\">\n" +
//                "<div class=\"form\">\n" +
//                "<form id=\"searchForm\" action=\"/search/word\" method=\"GET\" target=\"_self\">\n" +
//                "<input type=\"hidden\" value=\"lemma_search-box\" name=\"fromModule\" id=\"J-fromModule\"/>\n" +
//                "<input type=\"hidden\" value=\"lemma_search-box\" name=\"lemmaId\" id=\"J-lemma-id\"/>\n" +
//                "<span class=\"input-wrap J-input-wrap\">\n" +
//                "<input id=\"query\" nslog=\"normal\" nslog-type=\"10080011\" name=\"word\" type=\"text\" autocomplete=\"off\" autocorrect=\"off\" data-type=\"search-bar\" data-value=\"Java\" />\n" +
//                "<em class=\"cmn-icon cmn-icons cmn-icons_clear input-clear hidden J-input-clear\"></em>\n" +
//                "</span>\n" +
//                "<button id=\"search\" nslog=\"normal\" nslog-type=\"10080008\" type=\"button\" data-type=\"search-inlemma\">进入词条</button>\n" +
//                "<button id=\"searchLemma\" nslog=\"normal\" nslog-type=\"10080009\" type=\"button\">全站搜索</button>\n" +
//                "<a class=\"help J-help\" href=\"/help\" nslog=\"normal\" nslog-type=\"10080010\" target=\"_blank\">帮助</a>\n" +
//                "</form>\n" +
//                "<form id=\"searchLemmaForm\" action=\"/search\" method=\"GET\" target=\"_self\">\n" +
//                "<input id=\"searchLemmaQuery\" name=\"word\" type=\"hidden\" />\n" +
//                "<input name=\"pn\" type=\"hidden\" value=\"0\" />\n" +
//                "<input name=\"rn\" type=\"hidden\" value=\"0\" />\n" +
//                "<input name=\"enc\" type=\"hidden\" value=\"utf8\" />\n" +
//                "</form>\n" +
//                "<ul id=\"suggestion\" class=\"suggestion\" data-type=\"search-bar\">\n" +
//                "<div class=\"sug\"></div>\n" +
//                "<li class=\"extra\">\n" +
//                "<span id=\"clear\" style=\"margin-right:8px;\" data-type=\"search-bar\">清除历史记录</span><span id=\"close\" nslog=\"normal\" nslog-type=\"10080012\" data-type=\"search-bar\">关闭</span>\n" +
//                "</li>\n" +
//                "</ul>\n" +
//                "</div></div>\n" +
//                "</div>\n" +
//                "<div class=\"declare-wrap\" id=\"J-declare-wrap\">\n" +
//                "<div class=\"declare\" id=\"J-declare\">近期有不法分子冒充百度百科官方人员，以删除词条为由威胁并敲诈相关企业。在此严正声明：百度百科是免费编辑平台，绝不存在收费代编服务，请勿上当受骗！<a class=\"declare-details\" target=\"_blank\" href=\"/common/declaration\">详情>></a>\n" +
//                "<div class=\"close-btn\" id=\"J-declare-close\">\n" +
//                "<em class=\"cmn-icon cmn-icons cmn-icons_close\"></em>";
        String content = "私有地址（Private address）属于非注册地址，专门为组织机构内部使用。\n" +
                "以下列出留用的内部私有地址\n" +
                "A类 10.0.0.0--10.255.255.255\n" +
                "B类 172.16.0.0--172.31.255.255\n" +
                "C类 192.168.0.0--192.168.255.255";
        //提取文章中所有的英文单词
        //提取文章中说有的数字
        //提取文章中所有的英文单词和数字
        //提取百度热榜 标题
        //1. 传统方法，使用便利方法，代码量大，效率不高
        //2. 正则表达式技术

        //1. 先创建一个Pattern对象，模式对象，可以理解成就是一个正则表达式对象
                //Pattern pattern = Pattern.compile("[a-zA-Z]+");
        //Pattern pattern = Pattern.compile("[0-9]+");
       // Pattern pattern = Pattern.compile("([0-9]+)|([a-zA-Z]+)");
        //Pattern pattern = Pattern.compile("<a target=\"_blank\" title=\"(\\S*)");
        Pattern pattern = Pattern.compile("\\d+\\.\\d+\\.\\d+\\.\\d+");
        //2. 创建一个匹配器对象
        //理解：就是matcher匹配器按照pattern(模式/样式),到 content 文本中去匹配
        //找到就返回true,否则就返回false
        int no = 0;
        Matcher matcher = pattern.matcher(content);
        //3. 可以开始循环匹配
        while (matcher.find()) {
            //匹配内容，文本，放到 m.group(0)
            //System.out.println("找到： " + matcher.group(0));
            System.out.println("找到：" + (++no) + " " + matcher.group(1));
        }
    }
}

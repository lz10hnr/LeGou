package cn.usian.legou.common;

/**
 * Created by TuLing on 2017/3/10.
 * 存储所有的网络接口地址
 */
public class Urls {

    //服务器地址
    public static final String BASEURL = "http://shopapi.yasite.net/index.php/";
    //图片地址前缀
    public static final String BASEIMGURL = "http://shop.yasite.net/ecshop/";

    //获取首页的分类列表
    public static final String GETCATEGORY = BASEURL + "goodController/getCategory";
    //获取首页的商品列表
    public static final String GOODS = BASEURL + "goodController/getGoodList";
    //获取首页轮播图
    public static final String HOMEBANNER = "http://www.ipanda.com/kehuduan/PAGE14501749764071042/index.json";



}

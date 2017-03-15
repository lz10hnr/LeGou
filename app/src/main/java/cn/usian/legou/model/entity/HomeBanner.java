package cn.usian.legou.model.entity;

import java.util.List;

/**
 * Created by TuLing on 2017/3/15.
 */
public class HomeBanner {


    /**
     * bigImg : [{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2017/3/15/1489541232272_688.jpg","title":"NASA发现的新星系是它吗?","url":"http://webapp.cctv.com/h5/panview_ipanda/U803C856XH.html","id":"TITE1489541235280553","type":"6","stype":"","pid":"","vid":"","order":"1"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/14/2017031412183561563.jpg","title":"《精彩一刻》你是妈妈的掌上明珠","url":"http://live.ipanda.com/2017/03/14/VIDEXfxgeAtxyn8mSQ5GBHpe170314.shtml","id":"TITE1489541214792471","type":"2","stype":"","pid":"7788a913eb3b429baf5844859f507d9c","vid":"","order":"2"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/14/2017031412245314346.jpg","title":"《精彩一刻》竹子为什么不给我？","url":"http://live.ipanda.com/2017/03/14/VIDEIr0fIw0l4x6wzduheRbd170314.shtml","id":"TITE1489541196371405","type":"2","stype":"","pid":"0a275a095b884909b0f686e75f97c173","vid":"","order":"3"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2017/3/15/1489541605862_525.jpg","title":"走近熊猫\u201c奶爸\u201d：成网红 常被游客拦下合影","url":"http://news.ipanda.com/2017/03/14/ARTI9PJo5QCLW0o7KglQWGDz170314.shtml","id":"ARTI9PJo5QCLW0o7KglQWGDz170314","type":"5","stype":"","pid":"","vid":"","order":"4"}]
     * area : {"title":"精彩推荐","image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/6/25/1466833706262_654.jpg","url":"","id":"TITE1466833707511581","listscroll":[{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/14/2017031412183561563.jpg","url":"http://live.ipanda.com/2017/03/14/VIDEXfxgeAtxyn8mSQ5GBHpe170314.shtml","title":"你是妈妈的掌上明珠","videoLength":"","id":"TITE1489471975957566","pid":"7788a913eb3b429baf5844859f507d9c","vid":"","order":"1"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/14/2017031412245314346.jpg","url":"http://live.ipanda.com/2017/03/14/VIDEIr0fIw0l4x6wzduheRbd170314.shtml","title":"竹子为什么不给我？","videoLength":"","id":"TITE1489471965590557","pid":"0a275a095b884909b0f686e75f97c173","vid":"","order":"2"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/14/2017031412213394825.jpg","url":"http://live.ipanda.com/2017/03/14/VIDEQwF2EAKbb1lkIfBIM6TT170314.shtml","title":"这样妈妈就找不到我了","videoLength":"","id":"TITE1489471951842466","pid":"4b82ce2ee84341dd87cfcbd941691421","vid":"","order":"3"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/14/2017031412232676044.jpg","url":"http://live.ipanda.com/2017/03/14/VIDESvOfWmAd6cFdUGmzMnpY170314.shtml","title":"滑梯是我要玩的","videoLength":"","id":"TITE1489471940757499","pid":"e23f936f51ce42da8a0609409a25c378","vid":"","order":"4"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/13/2017031312220996329.jpg","url":"http://live.ipanda.com/2017/03/13/VIDE2DXAuPJ3uCyCq9NEDYN9170313.shtml","title":"崩溃！今天就是星期一了！","videoLength":"","id":"TITE1489383685269592","pid":"aafa755efded41adac0cd46b12ca2683","vid":"","order":"5"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/13/2017031312200022049.jpg","url":"http://live.ipanda.com/2017/03/13/VIDEqZPalJ15hLSFdWEiZFra170313.shtml","title":"你怎么才来！熊家都等你很久了","videoLength":"","id":"TITE1489383670512464","pid":"f38eff881c0649efbb9b1bb484634944","vid":"","order":"6"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/13/2017031312163052059.jpg","url":"http://live.ipanda.com/2017/03/13/VIDEsTYiQ74OQwlvJNSNuIzB170313.shtml","title":"吃饭之前一定要先洗手","videoLength":"","id":"TITE1489383659395560","pid":"52c757ccfe03459db7f143dfed73f6cd","vid":"","order":"7"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/13/2017031312181714355.jpg","url":"http://live.ipanda.com/2017/03/13/VIDEqlJirRf7sKUbRzab1KXH170313.shtml","title":"我的妈妈就是这么调皮","videoLength":"","id":"TITE1489383650204426","pid":"b672f71866754ce2bf4c6173fa20580e","vid":"","order":"8"},{"image":"http://p1.img.cctvpic.com/fmspic/2017/03/12/3195525a9cf44160a059c6bb9c4c2316-20.jpg","url":"http://live.ipanda.com/2017/03/12/VIDEDlpBQsmhDc4NeAaHgYLK170312.shtml","title":"网红一头撞飞熊猫便便","videoLength":"","id":"TITE1489292057373752","pid":"3195525a9cf44160a059c6bb9c4c2316","vid":"","order":"9"},{"image":"http://p5.img.cctvpic.com/fmspic/2017/03/12/f2143188196e4245b94f5fc62b7858ad-21.jpg","url":"http://live.ipanda.com/2017/03/12/VIDEoOasfbPCbfD9k2zNT3AB170312.shtml","title":"\u201c国际顺\u201d拒绝回家 竟然脚踹奶爸","videoLength":"","id":"TITE1489292044148108","pid":"f2143188196e4245b94f5fc62b7858ad","vid":"","order":"10"},{"image":"http://p5.img.cctvpic.com/fmspic/2017/03/12/fe30aef6d40549c9875ca7436cae9188-21.jpg","url":"http://live.ipanda.com/2017/03/12/VIDE5YIcLTWGuKvuWSwPYCDm170312.shtml","title":"快看！超美辣妈众人前出丑","videoLength":"","id":"TITE1489292032796750","pid":"fe30aef6d40549c9875ca7436cae9188","vid":"","order":"11"},{"image":"http://p2.img.cctvpic.com/fmspic/2017/03/12/1db00112b384482a8b1c4cac2bb12cc6-21.jpg","url":"http://live.ipanda.com/2017/03/12/VIDEdd0zYw6ytSpaL6FBoKxy170312.shtml","title":"这件事必须得用脚防着你","videoLength":"","id":"TITE1489292019478745","pid":"1db00112b384482a8b1c4cac2bb12cc6","vid":"","order":"12"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/11/2017031113135988099.jpg","url":"http://live.ipanda.com/2017/03/11/VIDEvOmdFe1EfNKVp6Sh5F52170311.shtml","title":"下来陪我玩","videoLength":"","id":"TITE1489213628957262","pid":"bbf89a62d9334e43a9c48a5f943bd8b5","vid":"","order":"13"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/11/2017031113152820979.jpg","url":"http://live.ipanda.com/2017/03/11/VIDEN3QvySMgWuVaqYtGYhhq170311.shtml","title":"我就是奶妈的\u201c关门弟子\u201d","videoLength":"","id":"TITE1489213668155577","pid":"41248ace1de444c0a6ea28b51c4b75e1","vid":"","order":"14"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/11/2017031113115188011.jpg","url":"http://live.ipanda.com/2017/03/11/VIDEzY0bDRSUm01ii1m4ez0F170311.shtml","title":"趁妈妈出神赶紧溜","videoLength":"","id":"TITE1489213658071295","pid":"c1d25f386b994ff995e17c889326b342","vid":"","order":"15"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/11/2017031113093679628.jpg","url":"http://live.ipanda.com/2017/03/11/VIDEshajeopV9se2fzx3wvQO170311.shtml","title":"滑梯明明不好玩，奶妈又骗熊家","videoLength":"","id":"TITE1489213616395256","pid":"1bad4ab9e25b466295c6ca60cff4dff9","vid":"","order":"16"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/10/2017031013082973424.jpg","url":"http://live.ipanda.com/2017/03/10/VIDErqsnfvIwfg1uuz8yVx1l170310.shtml","title":"究竟是谁在背后推我？","videoLength":"","id":"TITE1489213603490560","pid":"556d521b0a7842ea9006092d050008b0","vid":"","order":"17"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/10/2017031013072035120.jpg","url":"http://live.ipanda.com/2017/03/10/VIDExj2lDnrZYcZjnMKutapn170310.shtml","title":"吃瓜群众表示hin捉急！","videoLength":"","id":"TITE1489213591450558","pid":"f52b3de00bd643ce8bcb05d9357aa364","vid":"","order":"18"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/10/2017031013051444033.jpg","url":"http://live.ipanda.com/2017/03/10/VIDENCPQHRsA0wJ6ItyK1L5M170310.shtml","title":"您的好友\u201c毛笋\u201d向您下了一个战帖","videoLength":"","id":"TITE1489213582400526","pid":"818e74164fad480ca32cb7f18c275450","vid":"","order":"19"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/10/2017031013040093018.jpg","url":"http://live.ipanda.com/2017/03/10/VIDEk4LbF0BsqtjkYlLsK8d9170310.shtml","title":"move your body now！","videoLength":"","id":"TITE1489213572369202","pid":"c9bdbbd586844f0d9ebd66b5f9fd5214","vid":"","order":"20"}],"listh":[],"lists":[],"topiclist":[]}
     * pandaeye : {"title":"熊猫观察","pandaeyelogo":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/27/1453878224122_861.png","items":[{"title":"春色渐起 森林公园进入登山季","bgcolor":"#ff0a5a","brief":"春色","url":"http://panview.ipanda.com/2017/03/15/VIDEYO8gbgAkyrQVtvsL3bW1170315.shtml","id":"TITE1489544102490646","pid":"c9a87566d56941eaa2cf56ce72559006","vid":"","order":"1"},{"title":"美退休老人为鸡织毛衣助其过冬","bgcolor":"#ff0a5a","brief":"趣闻","url":"http://panview.ipanda.com/2017/03/15/VIDEsGFtQLsm7AIF7cuDGgeT170315.shtml","id":"TITE1489543008922919","pid":"5b39f02ec8b44128be8ff5b5d3b12c16","vid":"","order":"2"}],"pandaeyelist":"http://www.ipanda.com/kehuduan/shipinliebieye/xiongmaoguancha/index.json"}
     * pandalive : {"title":"熊猫直播","list":[{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/14/1452765186225_780.jpg","url":"","title":"成都基地高清精切线路","id":"ipanda","vid":"http://www.ipanda.com/kehuduan/PAGE14501769230331752/PAGE1450178789681331211/index.json","order":"1"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/14/1452765209983_511.jpg","url":"","title":"成都直播：熊猫母子园","id":"xiongmao07","vid":"http://www.ipanda.com/kehuduan/PAGE14501769230331752/PAGE1450178789681331211/index.json","order":"2"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/14/1452765227283_786.jpg","url":"","title":"成都直播：熊猫一号别墅","id":"xiongmao09","vid":"http://www.ipanda.com/kehuduan/PAGE14501769230331752/PAGE1450178789681331211/index.json","order":"3"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/22/1453457100537_88.jpg","url":"","title":"卧龙直播：熊猫\u201c泰山\u201d","id":"xiongmao13","vid":"http://www.ipanda.com/kehuduan/PAGE14501769230331752/PAGE145017878968133121/index.json","order":"4"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/14/1452765258608_842.jpg","url":"","title":"卧龙直播：熊猫\u201c戴丽\u201d","id":"xiongmao12","vid":"http://www.ipanda.com/kehuduan/PAGE14501769230331752/PAGE145017878968133121/index.json","order":"5"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/6/1/1464765552815_663.jpg","url":"","title":"雅安基地幼儿园","id":"xiongmao18","vid":"http://www.ipanda.com/kehuduan/PAGE14501769230331752/PAGE145017878968133121/index.json","order":"6"}]}
     * walllive : {"title":"长城直播","list":[{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/22/1453447161326_398.jpg","url":"","title":"八达岭长城南四楼","id":"bgws4","vid":"http://www.ipanda.com/kehuduan/liebiao/badaling/index.json","order":"1"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/22/1453449429822_667.jpg","url":"","title":"八达岭长城北十楼","id":"bgwn10","vid":"http://www.ipanda.com/kehuduan/liebiao/badaling/index.json","order":"2"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/22/1453449966410_700.jpg","url":"","title":"山海关长城镜头一","id":"wgw05","vid":"http://www.ipanda.com/kehuduan/liebiao/shanhaiguan/index.json","order":"3"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/22/1453450730912_656.jpg","url":"","title":"山海关长城镜头二","id":"wgw06","vid":"http://www.ipanda.com/kehuduan/liebiao/shanhaiguan/index.json","order":"4"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/22/1453451106626_148.jpg","url":"","title":"水长城","id":"wgw01","vid":"http://www.ipanda.com/kehuduan/liebiao/PAGEtcPWwRQbFtXAc5XV95lh160119/index.json","order":"5"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/22/1453451567952_933.jpg","url":"","title":"嘉峪关","id":"jyg03","vid":"http://www.ipanda.com/kehuduan/liebiao/PAGEcA8N14784Rzm35Q4Ppx1160119/index.json","order":"6"}]}
     * chinalive : {"title":"直播中国","list":[{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/9/19/1474274866009_775.jpg","url":"","title":"【直播】张家界","id":"zjjmht","vid":"http://livechina.ipanda.com/zhangjiajie/01/index.shtml","order":"1"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/9/19/1474274669741_123.jpg","url":"","title":"【直播】凤凰古城","id":"fhgcdgm","vid":"http://livechina.ipanda.com/fenghuang/01/index.shtml","order":"2"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/5/19/1463646740047_989.jpg","url":"","title":"【直播】中央电视塔","id":"ztd","vid":"http://livechina.ipanda.com/zhongta/02/index.shtml","order":"3"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/5/19/1463646628905_109.jpg","url":"","title":"【直播】悬空寺","id":"hsxksqj","vid":"http://livechina.ipanda.com/hengshan/01/index.shtml","order":"4"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/5/19/1463646593298_50.jpg","url":"","title":"【直播】黄果树","id":"hgsljtgpt","vid":"http://livechina.ipanda.com/huangguoshu/02/index.shtml","order":"5"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/5/19/1463646137373_456.jpg","url":"","title":"【直播】黄龙","id":"hlwxt","vid":"http://www.ipanda.com/kehuduan/liebiao/huanglong/index.json","order":"6"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/19/1453182053209_224.jpg","url":"","title":"【直播】泰山","id":"taishan01","vid":"http://www.ipanda.com/kehuduan/liebiao/PAGE1451288906969388/index.json","order":"7"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/19/1453182136725_375.jpg","url":"","title":"【直播】黄山","id":"hssxf","vid":"http://www.ipanda.com/kehuduan/liebiao/huangshan/index.json","order":"8"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/19/1453182395917_608.jpg","url":"","title":"【直播】峨眉山","id":"emsarm","vid":"http://www.ipanda.com/kehuduan/liebiao/emeishan/index.json","order":"9"}]}
     * interactive : {"title":"特别策划","interactiveone":[{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2017/3/11/1489197981369_85.jpg","title":"拥抱我们共同的家-大熊猫国家公园","url":"http://webapp.cctv.com/h5/ipanda/U80306G57R9V.html","type":"6","vid":"","order":"1"}],"interactivetwo":[]}
     * cctv : {"title":"央视名栏","listlive":[],"listurl":"http://www.ipanda.com/kehuduan/shipinliebieye/cctvshipindicengye/index.json"}
     * list : [{"listUrl":"http://www.ipanda.com/kehuduan/shipinliebieye/guangyingzhongguo/index.json","title":"《光影中国》","type":"2","order":"1"}]
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * title : 精彩推荐
         * image : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/6/25/1466833706262_654.jpg
         * url :
         * id : TITE1466833707511581
         * listscroll : [{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/14/2017031412183561563.jpg","url":"http://live.ipanda.com/2017/03/14/VIDEXfxgeAtxyn8mSQ5GBHpe170314.shtml","title":"你是妈妈的掌上明珠","videoLength":"","id":"TITE1489471975957566","pid":"7788a913eb3b429baf5844859f507d9c","vid":"","order":"1"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/14/2017031412245314346.jpg","url":"http://live.ipanda.com/2017/03/14/VIDEIr0fIw0l4x6wzduheRbd170314.shtml","title":"竹子为什么不给我？","videoLength":"","id":"TITE1489471965590557","pid":"0a275a095b884909b0f686e75f97c173","vid":"","order":"2"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/14/2017031412213394825.jpg","url":"http://live.ipanda.com/2017/03/14/VIDEQwF2EAKbb1lkIfBIM6TT170314.shtml","title":"这样妈妈就找不到我了","videoLength":"","id":"TITE1489471951842466","pid":"4b82ce2ee84341dd87cfcbd941691421","vid":"","order":"3"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/14/2017031412232676044.jpg","url":"http://live.ipanda.com/2017/03/14/VIDESvOfWmAd6cFdUGmzMnpY170314.shtml","title":"滑梯是我要玩的","videoLength":"","id":"TITE1489471940757499","pid":"e23f936f51ce42da8a0609409a25c378","vid":"","order":"4"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/13/2017031312220996329.jpg","url":"http://live.ipanda.com/2017/03/13/VIDE2DXAuPJ3uCyCq9NEDYN9170313.shtml","title":"崩溃！今天就是星期一了！","videoLength":"","id":"TITE1489383685269592","pid":"aafa755efded41adac0cd46b12ca2683","vid":"","order":"5"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/13/2017031312200022049.jpg","url":"http://live.ipanda.com/2017/03/13/VIDEqZPalJ15hLSFdWEiZFra170313.shtml","title":"你怎么才来！熊家都等你很久了","videoLength":"","id":"TITE1489383670512464","pid":"f38eff881c0649efbb9b1bb484634944","vid":"","order":"6"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/13/2017031312163052059.jpg","url":"http://live.ipanda.com/2017/03/13/VIDEsTYiQ74OQwlvJNSNuIzB170313.shtml","title":"吃饭之前一定要先洗手","videoLength":"","id":"TITE1489383659395560","pid":"52c757ccfe03459db7f143dfed73f6cd","vid":"","order":"7"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/13/2017031312181714355.jpg","url":"http://live.ipanda.com/2017/03/13/VIDEqlJirRf7sKUbRzab1KXH170313.shtml","title":"我的妈妈就是这么调皮","videoLength":"","id":"TITE1489383650204426","pid":"b672f71866754ce2bf4c6173fa20580e","vid":"","order":"8"},{"image":"http://p1.img.cctvpic.com/fmspic/2017/03/12/3195525a9cf44160a059c6bb9c4c2316-20.jpg","url":"http://live.ipanda.com/2017/03/12/VIDEDlpBQsmhDc4NeAaHgYLK170312.shtml","title":"网红一头撞飞熊猫便便","videoLength":"","id":"TITE1489292057373752","pid":"3195525a9cf44160a059c6bb9c4c2316","vid":"","order":"9"},{"image":"http://p5.img.cctvpic.com/fmspic/2017/03/12/f2143188196e4245b94f5fc62b7858ad-21.jpg","url":"http://live.ipanda.com/2017/03/12/VIDEoOasfbPCbfD9k2zNT3AB170312.shtml","title":"\u201c国际顺\u201d拒绝回家 竟然脚踹奶爸","videoLength":"","id":"TITE1489292044148108","pid":"f2143188196e4245b94f5fc62b7858ad","vid":"","order":"10"},{"image":"http://p5.img.cctvpic.com/fmspic/2017/03/12/fe30aef6d40549c9875ca7436cae9188-21.jpg","url":"http://live.ipanda.com/2017/03/12/VIDE5YIcLTWGuKvuWSwPYCDm170312.shtml","title":"快看！超美辣妈众人前出丑","videoLength":"","id":"TITE1489292032796750","pid":"fe30aef6d40549c9875ca7436cae9188","vid":"","order":"11"},{"image":"http://p2.img.cctvpic.com/fmspic/2017/03/12/1db00112b384482a8b1c4cac2bb12cc6-21.jpg","url":"http://live.ipanda.com/2017/03/12/VIDEdd0zYw6ytSpaL6FBoKxy170312.shtml","title":"这件事必须得用脚防着你","videoLength":"","id":"TITE1489292019478745","pid":"1db00112b384482a8b1c4cac2bb12cc6","vid":"","order":"12"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/11/2017031113135988099.jpg","url":"http://live.ipanda.com/2017/03/11/VIDEvOmdFe1EfNKVp6Sh5F52170311.shtml","title":"下来陪我玩","videoLength":"","id":"TITE1489213628957262","pid":"bbf89a62d9334e43a9c48a5f943bd8b5","vid":"","order":"13"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/11/2017031113152820979.jpg","url":"http://live.ipanda.com/2017/03/11/VIDEN3QvySMgWuVaqYtGYhhq170311.shtml","title":"我就是奶妈的\u201c关门弟子\u201d","videoLength":"","id":"TITE1489213668155577","pid":"41248ace1de444c0a6ea28b51c4b75e1","vid":"","order":"14"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/11/2017031113115188011.jpg","url":"http://live.ipanda.com/2017/03/11/VIDEzY0bDRSUm01ii1m4ez0F170311.shtml","title":"趁妈妈出神赶紧溜","videoLength":"","id":"TITE1489213658071295","pid":"c1d25f386b994ff995e17c889326b342","vid":"","order":"15"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/11/2017031113093679628.jpg","url":"http://live.ipanda.com/2017/03/11/VIDEshajeopV9se2fzx3wvQO170311.shtml","title":"滑梯明明不好玩，奶妈又骗熊家","videoLength":"","id":"TITE1489213616395256","pid":"1bad4ab9e25b466295c6ca60cff4dff9","vid":"","order":"16"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/10/2017031013082973424.jpg","url":"http://live.ipanda.com/2017/03/10/VIDErqsnfvIwfg1uuz8yVx1l170310.shtml","title":"究竟是谁在背后推我？","videoLength":"","id":"TITE1489213603490560","pid":"556d521b0a7842ea9006092d050008b0","vid":"","order":"17"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/10/2017031013072035120.jpg","url":"http://live.ipanda.com/2017/03/10/VIDExj2lDnrZYcZjnMKutapn170310.shtml","title":"吃瓜群众表示hin捉急！","videoLength":"","id":"TITE1489213591450558","pid":"f52b3de00bd643ce8bcb05d9357aa364","vid":"","order":"18"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/10/2017031013051444033.jpg","url":"http://live.ipanda.com/2017/03/10/VIDENCPQHRsA0wJ6ItyK1L5M170310.shtml","title":"您的好友\u201c毛笋\u201d向您下了一个战帖","videoLength":"","id":"TITE1489213582400526","pid":"818e74164fad480ca32cb7f18c275450","vid":"","order":"19"},{"image":"http://p1.img.cctvpic.com/photoworkspace/2017/03/10/2017031013040093018.jpg","url":"http://live.ipanda.com/2017/03/10/VIDEk4LbF0BsqtjkYlLsK8d9170310.shtml","title":"move your body now！","videoLength":"","id":"TITE1489213572369202","pid":"c9bdbbd586844f0d9ebd66b5f9fd5214","vid":"","order":"20"}]
         * listh : []
         * lists : []
         * topiclist : []
         */

        private AreaBean area;
        /**
         * title : 熊猫观察
         * pandaeyelogo : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/27/1453878224122_861.png
         * items : [{"title":"春色渐起 森林公园进入登山季","bgcolor":"#ff0a5a","brief":"春色","url":"http://panview.ipanda.com/2017/03/15/VIDEYO8gbgAkyrQVtvsL3bW1170315.shtml","id":"TITE1489544102490646","pid":"c9a87566d56941eaa2cf56ce72559006","vid":"","order":"1"},{"title":"美退休老人为鸡织毛衣助其过冬","bgcolor":"#ff0a5a","brief":"趣闻","url":"http://panview.ipanda.com/2017/03/15/VIDEsGFtQLsm7AIF7cuDGgeT170315.shtml","id":"TITE1489543008922919","pid":"5b39f02ec8b44128be8ff5b5d3b12c16","vid":"","order":"2"}]
         * pandaeyelist : http://www.ipanda.com/kehuduan/shipinliebieye/xiongmaoguancha/index.json
         */

        private PandaeyeBean pandaeye;
        /**
         * title : 熊猫直播
         * list : [{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/14/1452765186225_780.jpg","url":"","title":"成都基地高清精切线路","id":"ipanda","vid":"http://www.ipanda.com/kehuduan/PAGE14501769230331752/PAGE1450178789681331211/index.json","order":"1"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/14/1452765209983_511.jpg","url":"","title":"成都直播：熊猫母子园","id":"xiongmao07","vid":"http://www.ipanda.com/kehuduan/PAGE14501769230331752/PAGE1450178789681331211/index.json","order":"2"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/14/1452765227283_786.jpg","url":"","title":"成都直播：熊猫一号别墅","id":"xiongmao09","vid":"http://www.ipanda.com/kehuduan/PAGE14501769230331752/PAGE1450178789681331211/index.json","order":"3"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/22/1453457100537_88.jpg","url":"","title":"卧龙直播：熊猫\u201c泰山\u201d","id":"xiongmao13","vid":"http://www.ipanda.com/kehuduan/PAGE14501769230331752/PAGE145017878968133121/index.json","order":"4"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/14/1452765258608_842.jpg","url":"","title":"卧龙直播：熊猫\u201c戴丽\u201d","id":"xiongmao12","vid":"http://www.ipanda.com/kehuduan/PAGE14501769230331752/PAGE145017878968133121/index.json","order":"5"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/6/1/1464765552815_663.jpg","url":"","title":"雅安基地幼儿园","id":"xiongmao18","vid":"http://www.ipanda.com/kehuduan/PAGE14501769230331752/PAGE145017878968133121/index.json","order":"6"}]
         */

        private PandaliveBean pandalive;
        /**
         * title : 长城直播
         * list : [{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/22/1453447161326_398.jpg","url":"","title":"八达岭长城南四楼","id":"bgws4","vid":"http://www.ipanda.com/kehuduan/liebiao/badaling/index.json","order":"1"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/22/1453449429822_667.jpg","url":"","title":"八达岭长城北十楼","id":"bgwn10","vid":"http://www.ipanda.com/kehuduan/liebiao/badaling/index.json","order":"2"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/22/1453449966410_700.jpg","url":"","title":"山海关长城镜头一","id":"wgw05","vid":"http://www.ipanda.com/kehuduan/liebiao/shanhaiguan/index.json","order":"3"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/22/1453450730912_656.jpg","url":"","title":"山海关长城镜头二","id":"wgw06","vid":"http://www.ipanda.com/kehuduan/liebiao/shanhaiguan/index.json","order":"4"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/22/1453451106626_148.jpg","url":"","title":"水长城","id":"wgw01","vid":"http://www.ipanda.com/kehuduan/liebiao/PAGEtcPWwRQbFtXAc5XV95lh160119/index.json","order":"5"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/22/1453451567952_933.jpg","url":"","title":"嘉峪关","id":"jyg03","vid":"http://www.ipanda.com/kehuduan/liebiao/PAGEcA8N14784Rzm35Q4Ppx1160119/index.json","order":"6"}]
         */

        private WallliveBean walllive;
        /**
         * title : 直播中国
         * list : [{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/9/19/1474274866009_775.jpg","url":"","title":"【直播】张家界","id":"zjjmht","vid":"http://livechina.ipanda.com/zhangjiajie/01/index.shtml","order":"1"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/9/19/1474274669741_123.jpg","url":"","title":"【直播】凤凰古城","id":"fhgcdgm","vid":"http://livechina.ipanda.com/fenghuang/01/index.shtml","order":"2"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/5/19/1463646740047_989.jpg","url":"","title":"【直播】中央电视塔","id":"ztd","vid":"http://livechina.ipanda.com/zhongta/02/index.shtml","order":"3"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/5/19/1463646628905_109.jpg","url":"","title":"【直播】悬空寺","id":"hsxksqj","vid":"http://livechina.ipanda.com/hengshan/01/index.shtml","order":"4"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/5/19/1463646593298_50.jpg","url":"","title":"【直播】黄果树","id":"hgsljtgpt","vid":"http://livechina.ipanda.com/huangguoshu/02/index.shtml","order":"5"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/5/19/1463646137373_456.jpg","url":"","title":"【直播】黄龙","id":"hlwxt","vid":"http://www.ipanda.com/kehuduan/liebiao/huanglong/index.json","order":"6"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/19/1453182053209_224.jpg","url":"","title":"【直播】泰山","id":"taishan01","vid":"http://www.ipanda.com/kehuduan/liebiao/PAGE1451288906969388/index.json","order":"7"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/19/1453182136725_375.jpg","url":"","title":"【直播】黄山","id":"hssxf","vid":"http://www.ipanda.com/kehuduan/liebiao/huangshan/index.json","order":"8"},{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/19/1453182395917_608.jpg","url":"","title":"【直播】峨眉山","id":"emsarm","vid":"http://www.ipanda.com/kehuduan/liebiao/emeishan/index.json","order":"9"}]
         */

        private ChinaliveBean chinalive;
        /**
         * title : 特别策划
         * interactiveone : [{"image":"http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2017/3/11/1489197981369_85.jpg","title":"拥抱我们共同的家-大熊猫国家公园","url":"http://webapp.cctv.com/h5/ipanda/U80306G57R9V.html","type":"6","vid":"","order":"1"}]
         * interactivetwo : []
         */

        private InteractiveBean interactive;
        /**
         * title : 央视名栏
         * listlive : []
         * listurl : http://www.ipanda.com/kehuduan/shipinliebieye/cctvshipindicengye/index.json
         */

        private CctvBean cctv;
        /**
         * image : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2017/3/15/1489541232272_688.jpg
         * title : NASA发现的新星系是它吗?
         * url : http://webapp.cctv.com/h5/panview_ipanda/U803C856XH.html
         * id : TITE1489541235280553
         * type : 6
         * stype :
         * pid :
         * vid :
         * order : 1
         */

        private List<BigImgBean> bigImg;
        /**
         * listUrl : http://www.ipanda.com/kehuduan/shipinliebieye/guangyingzhongguo/index.json
         * title : 《光影中国》
         * type : 2
         * order : 1
         */

        private List<ListBean> list;

        public AreaBean getArea() {
            return area;
        }

        public void setArea(AreaBean area) {
            this.area = area;
        }

        public PandaeyeBean getPandaeye() {
            return pandaeye;
        }

        public void setPandaeye(PandaeyeBean pandaeye) {
            this.pandaeye = pandaeye;
        }

        public PandaliveBean getPandalive() {
            return pandalive;
        }

        public void setPandalive(PandaliveBean pandalive) {
            this.pandalive = pandalive;
        }

        public WallliveBean getWalllive() {
            return walllive;
        }

        public void setWalllive(WallliveBean walllive) {
            this.walllive = walllive;
        }

        public ChinaliveBean getChinalive() {
            return chinalive;
        }

        public void setChinalive(ChinaliveBean chinalive) {
            this.chinalive = chinalive;
        }

        public InteractiveBean getInteractive() {
            return interactive;
        }

        public void setInteractive(InteractiveBean interactive) {
            this.interactive = interactive;
        }

        public CctvBean getCctv() {
            return cctv;
        }

        public void setCctv(CctvBean cctv) {
            this.cctv = cctv;
        }

        public List<BigImgBean> getBigImg() {
            return bigImg;
        }

        public void setBigImg(List<BigImgBean> bigImg) {
            this.bigImg = bigImg;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class AreaBean {
            private String title;
            private String image;
            private String url;
            private String id;
            /**
             * image : http://p1.img.cctvpic.com/photoworkspace/2017/03/14/2017031412183561563.jpg
             * url : http://live.ipanda.com/2017/03/14/VIDEXfxgeAtxyn8mSQ5GBHpe170314.shtml
             * title : 你是妈妈的掌上明珠
             * videoLength :
             * id : TITE1489471975957566
             * pid : 7788a913eb3b429baf5844859f507d9c
             * vid :
             * order : 1
             */

            private List<ListscrollBean> listscroll;
            private List<?> listh;
            private List<?> lists;
            private List<?> topiclist;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public List<ListscrollBean> getListscroll() {
                return listscroll;
            }

            public void setListscroll(List<ListscrollBean> listscroll) {
                this.listscroll = listscroll;
            }

            public List<?> getListh() {
                return listh;
            }

            public void setListh(List<?> listh) {
                this.listh = listh;
            }

            public List<?> getLists() {
                return lists;
            }

            public void setLists(List<?> lists) {
                this.lists = lists;
            }

            public List<?> getTopiclist() {
                return topiclist;
            }

            public void setTopiclist(List<?> topiclist) {
                this.topiclist = topiclist;
            }

            public static class ListscrollBean {
                private String image;
                private String url;
                private String title;
                private String videoLength;
                private String id;
                private String pid;
                private String vid;
                private String order;

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getVideoLength() {
                    return videoLength;
                }

                public void setVideoLength(String videoLength) {
                    this.videoLength = videoLength;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getPid() {
                    return pid;
                }

                public void setPid(String pid) {
                    this.pid = pid;
                }

                public String getVid() {
                    return vid;
                }

                public void setVid(String vid) {
                    this.vid = vid;
                }

                public String getOrder() {
                    return order;
                }

                public void setOrder(String order) {
                    this.order = order;
                }
            }
        }

        public static class PandaeyeBean {
            private String title;
            private String pandaeyelogo;
            private String pandaeyelist;
            /**
             * title : 春色渐起 森林公园进入登山季
             * bgcolor : #ff0a5a
             * brief : 春色
             * url : http://panview.ipanda.com/2017/03/15/VIDEYO8gbgAkyrQVtvsL3bW1170315.shtml
             * id : TITE1489544102490646
             * pid : c9a87566d56941eaa2cf56ce72559006
             * vid :
             * order : 1
             */

            private List<ItemsBean> items;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPandaeyelogo() {
                return pandaeyelogo;
            }

            public void setPandaeyelogo(String pandaeyelogo) {
                this.pandaeyelogo = pandaeyelogo;
            }

            public String getPandaeyelist() {
                return pandaeyelist;
            }

            public void setPandaeyelist(String pandaeyelist) {
                this.pandaeyelist = pandaeyelist;
            }

            public List<ItemsBean> getItems() {
                return items;
            }

            public void setItems(List<ItemsBean> items) {
                this.items = items;
            }

            public static class ItemsBean {
                private String title;
                private String bgcolor;
                private String brief;
                private String url;
                private String id;
                private String pid;
                private String vid;
                private String order;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getBgcolor() {
                    return bgcolor;
                }

                public void setBgcolor(String bgcolor) {
                    this.bgcolor = bgcolor;
                }

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getPid() {
                    return pid;
                }

                public void setPid(String pid) {
                    this.pid = pid;
                }

                public String getVid() {
                    return vid;
                }

                public void setVid(String vid) {
                    this.vid = vid;
                }

                public String getOrder() {
                    return order;
                }

                public void setOrder(String order) {
                    this.order = order;
                }
            }
        }

        public static class PandaliveBean {
            private String title;
            /**
             * image : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/14/1452765186225_780.jpg
             * url :
             * title : 成都基地高清精切线路
             * id : ipanda
             * vid : http://www.ipanda.com/kehuduan/PAGE14501769230331752/PAGE1450178789681331211/index.json
             * order : 1
             */

            private List<ListBean> list;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean {
                private String image;
                private String url;
                private String title;
                private String id;
                private String vid;
                private String order;

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getVid() {
                    return vid;
                }

                public void setVid(String vid) {
                    this.vid = vid;
                }

                public String getOrder() {
                    return order;
                }

                public void setOrder(String order) {
                    this.order = order;
                }
            }
        }

        public static class WallliveBean {
            private String title;
            /**
             * image : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/1/22/1453447161326_398.jpg
             * url :
             * title : 八达岭长城南四楼
             * id : bgws4
             * vid : http://www.ipanda.com/kehuduan/liebiao/badaling/index.json
             * order : 1
             */

            private List<ListBean> list;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean {
                private String image;
                private String url;
                private String title;
                private String id;
                private String vid;
                private String order;

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getVid() {
                    return vid;
                }

                public void setVid(String vid) {
                    this.vid = vid;
                }

                public String getOrder() {
                    return order;
                }

                public void setOrder(String order) {
                    this.order = order;
                }
            }
        }

        public static class ChinaliveBean {
            private String title;
            /**
             * image : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2016/9/19/1474274866009_775.jpg
             * url :
             * title : 【直播】张家界
             * id : zjjmht
             * vid : http://livechina.ipanda.com/zhangjiajie/01/index.shtml
             * order : 1
             */

            private List<ListBean> list;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean {
                private String image;
                private String url;
                private String title;
                private String id;
                private String vid;
                private String order;

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getVid() {
                    return vid;
                }

                public void setVid(String vid) {
                    this.vid = vid;
                }

                public String getOrder() {
                    return order;
                }

                public void setOrder(String order) {
                    this.order = order;
                }
            }
        }

        public static class InteractiveBean {
            private String title;
            /**
             * image : http://p1.img.cctvpic.com/photoAlbum/page/performance/img/2017/3/11/1489197981369_85.jpg
             * title : 拥抱我们共同的家-大熊猫国家公园
             * url : http://webapp.cctv.com/h5/ipanda/U80306G57R9V.html
             * type : 6
             * vid :
             * order : 1
             */

            private List<InteractiveoneBean> interactiveone;
            private List<?> interactivetwo;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<InteractiveoneBean> getInteractiveone() {
                return interactiveone;
            }

            public void setInteractiveone(List<InteractiveoneBean> interactiveone) {
                this.interactiveone = interactiveone;
            }

            public List<?> getInteractivetwo() {
                return interactivetwo;
            }

            public void setInteractivetwo(List<?> interactivetwo) {
                this.interactivetwo = interactivetwo;
            }

            public static class InteractiveoneBean {
                private String image;
                private String title;
                private String url;
                private String type;
                private String vid;
                private String order;

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getVid() {
                    return vid;
                }

                public void setVid(String vid) {
                    this.vid = vid;
                }

                public String getOrder() {
                    return order;
                }

                public void setOrder(String order) {
                    this.order = order;
                }
            }
        }

        public static class CctvBean {
            private String title;
            private String listurl;
            private List<?> listlive;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getListurl() {
                return listurl;
            }

            public void setListurl(String listurl) {
                this.listurl = listurl;
            }

            public List<?> getListlive() {
                return listlive;
            }

            public void setListlive(List<?> listlive) {
                this.listlive = listlive;
            }
        }

        public static class BigImgBean {
            private String image;
            private String title;
            private String url;
            private String id;
            private String type;
            private String stype;
            private String pid;
            private String vid;
            private String order;

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getStype() {
                return stype;
            }

            public void setStype(String stype) {
                this.stype = stype;
            }

            public String getPid() {
                return pid;
            }

            public void setPid(String pid) {
                this.pid = pid;
            }

            public String getVid() {
                return vid;
            }

            public void setVid(String vid) {
                this.vid = vid;
            }

            public String getOrder() {
                return order;
            }

            public void setOrder(String order) {
                this.order = order;
            }
        }

        public static class ListBean {
            private String listUrl;
            private String title;
            private String type;
            private String order;

            public String getListUrl() {
                return listUrl;
            }

            public void setListUrl(String listUrl) {
                this.listUrl = listUrl;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getOrder() {
                return order;
            }

            public void setOrder(String order) {
                this.order = order;
            }
        }
    }
}

package cn.usian.legou.model.http;

import android.widget.ImageView;

import java.util.Map;

import cn.usian.legou.model.http.callback.ResultCallBack;

/**
 * Created by TuLing on 2017/3/13.
 */
public class HomeModelImpl implements IHomeModel {
    @Override
    public void getCategory(String url, Map params, ResultCallBack callBack) {

        baseOkHttp.post(url,params,callBack);
    }

    @Override
    public void getGoods(String url, Map params, ResultCallBack callBack) {

        baseOkHttp.post(url,params,callBack);
    }

    @Override
    public void getHomeBanner(String url, Map<String, String> params, ResultCallBack callBack) {
        baseOkHttp.get(url,params,callBack);
    }

    @Override
    public void loadImageByUrl(ImageView imageView, String imgUrl) {
        baseOkHttp.loadImage(imageView,imgUrl);
    }
}

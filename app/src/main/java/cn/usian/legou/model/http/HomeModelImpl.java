package cn.usian.legou.model.http;

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
}

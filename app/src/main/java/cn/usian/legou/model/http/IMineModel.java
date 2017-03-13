package cn.usian.legou.model.http;

import java.util.Map;

import cn.usian.legou.model.http.callback.ResultCallBack;

/**
 * Created by TuLing on 2017/3/13.
 */
public interface IMineModel<T> extends IModel{

    void login(String url, Map<String,String> params,ResultCallBack<T> callBack);
    void register(String url,Map<String,String> params,ResultCallBack<T> callBack);
}

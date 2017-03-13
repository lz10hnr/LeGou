package cn.usian.legou.model.http;

import java.util.Map;

import cn.usian.legou.model.http.callback.ResultCallBack;

/**
 * Created by TuLing on 2017/3/13.
 */
public interface IHomeModel extends IModel{

    /**
     * 获取分类列表
     * @param url
     * @param params
     * @param callBack
     */
    void getCategory(String url, Map<String,String> params, ResultCallBack callBack);
}

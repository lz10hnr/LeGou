package cn.usian.legou.model.http.callback;

/**
 * Created by TuLing on 2017/3/10.
 */
public interface ResultCallBack<T> {

    /**
     * 请求成功的回调
     * @param data 服务器返回的数据
     */
    void onSuccess(T data);

    /**
     * 请求失败的回调
     * @param errorMsg 错误信息
     * @param errorCode 错误码
     */
    void onError(String errorMsg,String errorCode);
}

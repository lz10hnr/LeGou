package cn.usian.legou.model.http;

import android.widget.ImageView;

/**
 * Created by TuLing on 2017/3/13.
 */
public interface IModel {

    public static final BaseOkHttp baseOkHttp = BaseOkHttp.getInstance();

    /**
     * 加载网络图片
     * @param imageView
     * @param imgUrl
     */
    void loadImageByUrl(ImageView imageView,String imgUrl);
}

package cn.usian.legou.adapter;

import android.content.Context;

import java.util.List;

import cn.usian.legou.R;
import cn.usian.legou.base.CommonAdapter;
import cn.usian.legou.base.ViewHolder;
import cn.usian.legou.model.entity.Goods;

/**
 * Created by TuLing on 2017/3/14.
 */
public class HomeContentAdapter extends CommonAdapter<Goods.DataBean> {


    public HomeContentAdapter(Context context, List<Goods.DataBean> datas) {
        super(context, datas, R.layout.homecontent_listview_item);
    }

    @Override
    public void display(ViewHolder holder, Goods.DataBean dataBean) {
        holder.setImage(R.id.contentTitle,dataBean.getGoods_name());
    }
}

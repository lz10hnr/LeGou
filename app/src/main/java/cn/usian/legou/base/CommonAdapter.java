package cn.usian.legou.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by TuLing on 2017/3/14.
 */
public abstract   class CommonAdapter<T> extends BaseAdapter {
    private List<T> datas;
    private Context context;
    private int layoutId;
    public CommonAdapter(Context context, List<T> datas,int layoutId){
        this.context = context;
        this.datas = datas;
        this.layoutId=layoutId;
    }

    @Override
    public int getCount() {
        if(datas != null)
            return datas.size();
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return datas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = ViewHolder.getInstance(context, view, layoutId);
        //填充数据
//        holder.setText(R.id.contentTitle,"2333").setImage().setText();
        display(holder,datas.get(i));
        return holder.getConvertView();
    }

    public abstract void display(ViewHolder holder,T t);
}

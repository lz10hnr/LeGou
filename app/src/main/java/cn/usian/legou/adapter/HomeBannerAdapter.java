package cn.usian.legou.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by TuLing on 2017/3/15.
 */
public class HomeBannerAdapter extends PagerAdapter {

    private List<ImageView> imgs;
    public HomeBannerAdapter(List<ImageView> imgs){
        this.imgs = imgs;
    }

    @Override
    public int getCount() {
        if(imgs.size() == 0)
            return 0;
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView img = imgs.get(position % imgs.size());
        if(img.getParent() != null)
            ((ViewGroup)img.getParent()).removeView(img);
        container.addView(img);
        return img;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        container.removeView(imgs.get(position % imgs.size()));
    }
}

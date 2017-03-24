package cn.usian.legou.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import cn.usian.legou.R;
import cn.usian.legou.adapter.HomeBannerAdapter;
import cn.usian.legou.adapter.HomeContentAdapter;
import cn.usian.legou.base.BaseFragment;
import cn.usian.legou.common.Keys;
import cn.usian.legou.common.Urls;
import cn.usian.legou.model.entity.Goods;
import cn.usian.legou.model.entity.HomeBanner;
import cn.usian.legou.model.entity.HomeBanner.DataBean.BigImgBean;
import cn.usian.legou.model.http.HomeModelImpl;
import cn.usian.legou.model.http.IHomeModel;
import cn.usian.legou.model.http.callback.ResultCallBack;

/**
 * Created by TuLing on 2017/3/13.
 */
public class HomeContentFragment extends BaseFragment {

    private ListView mListView;
    private IHomeModel homeModel;
    private int currentPage = 1;
    private List<Goods.DataBean> datas;
    private HomeContentAdapter adapter;
    private ViewPager bannerViewPager;
    private HomeBannerAdapter bannerAdapter;
    private List<ImageView> bannerImgs;
    //viewpager默认的起始位置
    //自动滑动的标识
    private final static int STARTPOSITION = 10000;
    private final static int AUTOSCROLL = 100;
    //自动滑动暂停
    private final static int SCROLLPAUSE = 101;
    //自动滑动的延时时间
    private final static int DELAYEDTIME = 3000;
    //轮播图的当前位置
    private int currentPosistion = STARTPOSITION;

    private View viewPagerLayout;

    @Override
    protected int getLayoutId() {
        return R.layout.home_content_fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("abc","onCreateView == "+this);
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    @Override
    public void onPause() {
        super.onPause();
        handler.sendEmptyMessage(SCROLLPAUSE);
        Log.i("abc","onPause == "+this+"，handler");
    }

    @Override
    protected void initView(View view) {
        viewPagerLayout = LayoutInflater.from(getActivity()).inflate(R.layout.home_listview_header,null);
        mListView = (ListView) view.findViewById(R.id.contentListView);
        bannerViewPager = (ViewPager) viewPagerLayout.findViewById(R.id.bannerViewPager);
        bannerViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                //校正位置  （手动和自动）
                currentPosistion = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        mListView.addHeaderView(viewPagerLayout);
    }

    @Override
    protected void initData() {
        datas = new ArrayList<>();
        bannerImgs = new ArrayList<>();
        homeModel = new HomeModelImpl();
        params.put(Keys.PAGE,currentPage+"");
        params.put(Keys.ID,"1");
        adapter = new HomeContentAdapter(getActivity(),datas);
        mListView.setAdapter(adapter);
        bannerAdapter = new HomeBannerAdapter(bannerImgs);
        bannerViewPager.setAdapter(bannerAdapter);


    }

    @Override
    protected void loadData() {
        getHomeList();
        getHomeBanner();
    }

    /**
     * 获取首页轮播图
     */
    private void getHomeBanner(){
        homeModel.getHomeBanner(Urls.HOMEBANNER, null, new ResultCallBack<HomeBanner>() {
            @Override
            public void onSuccess(HomeBanner data) {

                //轮播图数据
                List<BigImgBean> bigImgs = data.getData().getBigImg();
                for(BigImgBean img : bigImgs){
                    ImageView imageView = new ImageView(getActivity());
                    LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
                    imageView.setLayoutParams(params);
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    homeModel.loadImageByUrl(imageView,img.getImage());
                    bannerImgs.add(imageView);
                }
                bannerAdapter.notifyDataSetChanged();
                bannerViewPager.setCurrentItem(STARTPOSITION);
                handler.sendEmptyMessageDelayed(AUTOSCROLL,DELAYEDTIME);
            }

            @Override
            public void onError(String errorMsg, String errorCode) {

            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("abc","---------onResume-------");
    }


    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {

            switch (msg.what){
                case AUTOSCROLL:
                    currentPosistion = currentPosistion+1;
                    bannerViewPager.setCurrentItem(currentPosistion);
                    sendEmptyMessageDelayed(AUTOSCROLL,DELAYEDTIME);
                    break;
                case SCROLLPAUSE:
                    break;
            }

        }
    };

    /**
     * 获取首页listview列表
     */
    private void getHomeList(){
        homeModel.getGoods(Urls.GOODS, params, new ResultCallBack<Goods>() {
            @Override
            public void onSuccess(Goods goods) {

                datas.addAll(goods.getData());
                adapter.notifyDataSetChanged();

            }

            @Override
            public void onError(String errorMsg, String errorCode) {

            }
        });
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}

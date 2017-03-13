package cn.usian.legou.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import cn.usian.legou.R;
import cn.usian.legou.base.BaseFragment;
import cn.usian.legou.common.Params;
import cn.usian.legou.common.Urls;
import cn.usian.legou.model.entity.HomeCategory;
import cn.usian.legou.model.http.HomeModelImpl;
import cn.usian.legou.model.http.IHomeModel;
import cn.usian.legou.model.http.callback.ResultCallBack;

/**
 * Created by TuLing on 2017/3/13.
 */
public class HomeFragment extends BaseFragment {
    private TabLayout titleLayout;
    private ViewPager mViewPager;
    private IHomeModel homeModel;
    private List<HomeCategory.DataBean> titleBeans;
    @Override
    protected int getLayoutId() {
        return R.layout.home_fragment;
    }

    @Override
    protected void initView(View view) {

        this.titleLayout = (TabLayout) view.findViewById(R.id.homeTitleLayout);
        this.mViewPager = (ViewPager) view.findViewById(R.id.homeViewPager);
        this.titleLayout.setTabMode(TabLayout.MODE_FIXED);
    }

    @Override
    protected void initData() {

        homeModel = new HomeModelImpl();
        titleBeans = new ArrayList<>();
        params.put(Params.ID,"0");
    }


    @Override
    protected void loadData() {


        homeModel.getCategory(Urls.GETCATEGORY, params, new ResultCallBack<HomeCategory>() {
            @Override
            public void onSuccess(HomeCategory data) {

                titleBeans.addAll(data.getData());
                for (HomeCategory.DataBean bean : data.getData()){
                    titleLayout.addTab(titleLayout.newTab().setText(bean.getCat_name()));
                }
            }

            @Override
            public void onError(String errorMsg, String errorCode) {

            }
        });

    }

    @Override
    public void onClick(View view) {

    }
}

package cn.usian.legou.fragment;

import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import cn.usian.legou.R;
import cn.usian.legou.adapter.HomeContentAdapter;
import cn.usian.legou.base.BaseFragment;
import cn.usian.legou.common.Keys;
import cn.usian.legou.common.Urls;
import cn.usian.legou.model.entity.Goods;
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

    @Override
    protected int getLayoutId() {
        return R.layout.home_content_fragment;
    }

    @Override
    protected void initView(View view) {
        mListView = (ListView) view.findViewById(R.id.contentListView);
    }

    @Override
    protected void initData() {
        datas = new ArrayList<>();
        homeModel = new HomeModelImpl();
        params.put(Keys.PAGE,currentPage+"");
        params.put(Keys.ID,"1");
        adapter = new HomeContentAdapter(getActivity(),datas);
        mListView.setAdapter(adapter);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    /**
     * 实现了Fragment的懒加载
     * @param isVisibleToUser
     */
  @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
/*
      if(isVisibleToUser) {
          if(isFirstLoad){
              isFirstLoad = false;
          }
          Log.d("BaseFragment", "setUserVisibleHint  可见的");
      }else {
          Log.d("BaseFragment", "setUserVisibleHint  不可见的");
      }*/
    }


    @Override
    protected void loadData() {

        homeModel.getGoods(Urls.GOODS, params, new ResultCallBack<Goods>() {
            @Override
            public void onSuccess(Goods goods) {

                Log.i("BaseFragment","--onSuccess--");
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
}

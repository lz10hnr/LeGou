package cn.usian.legou.fragment;

import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import cn.usian.legou.R;
import cn.usian.legou.base.BaseFragment;
import cn.usian.legou.base.CommonAdapter;
import cn.usian.legou.base.ViewHolder;
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
    private CommonAdapter<Goods.DataBean> adapter;

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
        adapter = new CommonAdapter<Goods.DataBean>(getActivity(),datas, R.layout.homecontent_listview_item){
            @Override
            public void display(ViewHolder holder, Goods.DataBean dataBean) {
                holder.setText(R.id.contentTitle,dataBean.getGoods_name()).setImage(R.id.leftImg,"http://shop.yasite.net/ecshop/"+dataBean.getGoods_img());
            }
        };
        mListView.setAdapter(adapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        //填充数据
    }

    /**
     * 实现了Fragment的懒加载
     * @param isVisibleToUser
     */
  @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

    }


    @Override
    protected void loadData() {

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
}

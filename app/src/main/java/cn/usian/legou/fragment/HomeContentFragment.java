package cn.usian.legou.fragment;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import cn.usian.legou.R;
import cn.usian.legou.base.BaseFragment;
import cn.usian.legou.common.Keys;

/**
 * Created by TuLing on 2017/3/13.
 */
public class HomeContentFragment extends BaseFragment {

    private TextView textView;
    @Override
    protected int getLayoutId() {
        return R.layout.home_content_fragment;
    }

    @Override
    protected void initView(View view) {
        textView = (TextView) view.findViewById(R.id.content);
        if(bundle != null && textView != null) {
            String title = bundle.getString(Keys.TITLE);
            textView.setText(title);
        }
    }

    @Override
    protected void initData() {

    }

  @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        //fragment可见时调用
        if(isVisibleToUser){
            Log.d("BaseFragment", "setUserVisibleHint");
            if(bundle != null && textView != null) {
                String title = bundle.getString(Keys.TITLE);
                textView.setText(title);
            }
        }
    }


    @Override
    protected void loadData() {

    }

    @Override
    public void onClick(View view) {

    }
}

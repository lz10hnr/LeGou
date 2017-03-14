package cn.usian.legou.fragment;

import android.view.View;
import android.widget.TextView;

import cn.usian.legou.R;
import cn.usian.legou.base.BaseFragment;
import cn.usian.legou.common.Keys;

/**
 * Created by TuLing on 2017/3/14.
 */
public class EmptyFragment extends BaseFragment {
    TextView mTitle;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_empty;
    }

    @Override
    protected void initView(View view) {
        mTitle= (TextView) view.findViewById(R.id.mTitle);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void loadData() {
        mTitle.setText(bundle.getString(Keys.FRAGMENTNAME));
    }

    @Override
    public void onClick(View view) {

    }
}

package cn.usian.legou.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId());
        App.context = this;
        initView();
        initData();
        initListener();
        loadData();
    }

    protected abstract int layoutId();

    protected abstract void initView();

    protected abstract void initData();

    protected abstract void initListener();

    protected abstract void loadData();
}

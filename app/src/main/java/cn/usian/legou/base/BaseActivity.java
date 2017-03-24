package cn.usian.legou.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import cn.usian.legou.R;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        initDrawerLayout();
        App.context = this;
        initView();
        initData();
        initListener();
        loadData();
    }

    private void initDrawerLayout(){
        FrameLayout contentLayout = (FrameLayout) findViewById(R.id.contentLayout);
        View view = LayoutInflater.from(this).inflate(layoutId(), null);
        contentLayout.addView(view);
    }

    protected abstract int layoutId();

    protected abstract void initView();

    protected abstract void initData();

    protected abstract void initListener();

    protected abstract void loadData();
}

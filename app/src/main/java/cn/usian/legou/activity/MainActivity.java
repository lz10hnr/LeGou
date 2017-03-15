package cn.usian.legou.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioButton;

import cn.usian.legou.R;
import cn.usian.legou.base.BaseActivity;
import cn.usian.legou.base.BaseFragment;
import cn.usian.legou.common.Keys;
import cn.usian.legou.fragment.EmptyFragment;
import cn.usian.legou.fragment.HomeFragment;

public class MainActivity extends BaseActivity implements RadioButton.OnClickListener {

    private RadioButton homeBtn;
    private RadioButton foundBtn;
    private RadioButton shoppingCarBtn;
    private RadioButton mineButtoon;
    private BaseFragment homeFragment;
    private BaseFragment foundFragment;
    private BaseFragment shoppingFragment;
    private BaseFragment mineFragment;
    private FragmentManager fragmentManager;
    private BaseFragment currentFragment;


    /**
     * 页面切换的方法
     * 1、我要切换的页面  Fragment
     * 2、我要不要传递参数 Bundle
     * 3、我要不通过back键返回 Boolean
     */
    private void changeContentView(BaseFragment fragment,Bundle bundle,boolean isBack){
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        if(bundle != null)
            fragment.setParams(bundle);

        transaction.hide(currentFragment);

        //我判断是否已经添加过 y 显示 n 添加 隐藏上一个fragment
        if (!fragment.isAdded()) {
            transaction.add(R.id.contentGroup, fragment);
        }
        transaction.show(fragment);
        transaction.commit();
        currentFragment=fragment;
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        homeBtn=(RadioButton)findViewById(R.id.homeBtn);
        foundBtn= (RadioButton) findViewById(R.id.foundBtn);
        shoppingCarBtn=(RadioButton)findViewById(R.id.shoppingCarBtn);
        mineButtoon=(RadioButton)findViewById(R.id.mineBtn);
    }

    @Override
    protected void initData() {

        homeFragment = new HomeFragment();
        foundFragment =new EmptyFragment();
        shoppingFragment =new EmptyFragment();
        mineFragment =new EmptyFragment();
        currentFragment=homeFragment;
        changeContentView(homeFragment,null,false);
    }

    @Override
    protected void initListener() {
        homeBtn.setOnClickListener(this);
        foundBtn.setOnClickListener(this);
        shoppingCarBtn.setOnClickListener(this);
        mineButtoon.setOnClickListener(this);
    }

    @Override
    protected void loadData() {

    }


    @Override
    public void onClick(View view) {
        Bundle bundle=new Bundle();
        switch (view.getId()){
            case R.id.homeBtn:
                bundle.putString(Keys.FRAGMENTNAME,"home");
                changeContentView(homeFragment,bundle,false);
                break;
            case R.id.foundBtn:
                bundle.putString(Keys.FRAGMENTNAME,"found");
                changeContentView(foundFragment,bundle,false);
                break;
            case R.id.shoppingCarBtn:
                bundle.putString(Keys.FRAGMENTNAME,"shopping");
                changeContentView(shoppingFragment,bundle,false);
                break;
            case R.id.mineBtn:
                bundle.putString(Keys.FRAGMENTNAME,"mine");
                changeContentView(mineFragment,bundle,false);
                break;
        }
    }
}

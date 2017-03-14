package cn.usian.legou.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.usian.legou.R;
import cn.usian.legou.base.BaseFragment;
import cn.usian.legou.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {


    private BaseFragment homeFragment;
    private FragmentManager fragmentManager;
    private BaseFragment currentFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    /**
     * 页面切换的方法
     * 1、我要切换的页面  Fragment
     * 2、我要不要传递参数 Bundle
     * 3、我要不通过back键返回 Boolean
     */
    private void chageContentView(BaseFragment fragment,Bundle bundle,boolean isBack){
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.hide(currentFragment);

        //我判断是否已经添加过 y 显示 n 添加 隐藏上一个fragment
        if (!fragment.isAdded()) {
            transaction.add(R.id.contentGroup, homeFragment, "homeFragment");
        }else{
            transaction.show(fragment);
        }
        transaction.commit();

        currentFragment=fragment;
    }

    private void init(){
        homeFragment = new HomeFragment();
        chageContentView(homeFragment,null,false);
        currentFragment=homeFragment;
    }

}

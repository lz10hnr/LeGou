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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        homeFragment = new HomeFragment();
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.contentGroup,homeFragment,"homeFragment");
        transaction.commit();
    }
}

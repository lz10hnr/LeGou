package cn.usian.legou.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.usian.legou.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
}

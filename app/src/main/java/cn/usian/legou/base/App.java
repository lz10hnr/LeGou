package cn.usian.legou.base;

import android.app.Activity;
import android.app.Application;

/**
 * Created by TuLing on 2017/3/13.
 */
public class App extends Application{

    public static Activity context;
    @Override
    public void onCreate() {
        super.onCreate();
    }
}

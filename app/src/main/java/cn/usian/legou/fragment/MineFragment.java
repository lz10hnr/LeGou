package cn.usian.legou.fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import cn.usian.legou.R;
import cn.usian.legou.activity.UserInfoActivity;
import cn.usian.legou.base.BaseFragment;
import cn.usian.legou.view.CircleImg;

/**
 * Created by xingge on 2017/3/17.
 */

public class MineFragment extends BaseFragment {

    private CircleImg headImg;
    private static final int OPENUSERINFOCODE = 200;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initView(View view) {
        this.headImg = (CircleImg) view.findViewById(R.id.userHeadImg);
        this.headImg.setOnClickListener(this);

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void loadData() {

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.userHeadImg:

                Intent intent = new Intent(getActivity(), UserInfoActivity.class);
                startActivityForResult(intent,OPENUSERINFOCODE);
                break;
        }
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (resultCode){
            case UserInfoActivity.RESULTCODE:
                if(data != null){
                    String headPath = data.getStringExtra("headPath");
//                        FileInputStream inputStream = new FileInputStream(headPath);
//                        Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                        headImg.setBitmapByFile(headPath);

//                    Bitmap bitmap = data.getParcelableExtra("data");

                }
                break;
        }
    }
}

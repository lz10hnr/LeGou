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
import cn.usian.legou.common.Urls;
import cn.usian.legou.model.http.HomeModelImpl;
import cn.usian.legou.model.http.IHomeModel;
import cn.usian.legou.model.http.callback.ResultCallBack;
import cn.usian.legou.view.CircleImg;

/**
 * Created by xingge on 2017/3/17.
 */

public class MineFragment extends BaseFragment {

    private CircleImg headImg;
    private static final int OPENUSERINFOCODE = 200;
    private IHomeModel homeModel;

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

        homeModel = new HomeModelImpl();
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
                    params.put("fl",headPath);
                    params.put("token","092710cea3604af7caae71fac7f4dc26");
                    homeModel.uploadImg(Urls.UPLOADIMG, params, new ResultCallBack<Object>() {
                        @Override
                        public void onSuccess(Object data) {

                        }

                        @Override
                        public void onError(String errorMsg, String errorCode) {

                        }
                    });

//                    Bitmap bitmap = data.getParcelableExtra("data");

                }
                break;
        }
    }
}

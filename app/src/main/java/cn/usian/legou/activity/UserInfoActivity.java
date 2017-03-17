package cn.usian.legou.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import java.io.File;

import cn.usian.legou.R;
import cn.usian.legou.base.BaseActivity;

public class UserInfoActivity extends BaseActivity implements View.OnClickListener{

    private PopupWindow popupWindow;
    private LinearLayout headLayout;
    private View view;
    private Button photosBtn;
    private Button cameraBtn;
    private Button cancleBtn;
    private ImageView img;
    private final static int OPENPHOTOCODE = 1;
    private final static int CROPCODE = 2;
    public final static int RESULTCODE = 3;
    private File headImgFile;

    @Override
    protected int layoutId() {
        return R.layout.activity_user_info;
    }

    @Override
    protected void initView() {

        this.headLayout = (LinearLayout) findViewById(R.id.headLayout);
        view = LayoutInflater.from(this).inflate(R.layout.mine_select_photo_view,null);
        photosBtn = (Button) view.findViewById(R.id.photosBtn);
        cameraBtn = (Button) view.findViewById(R.id.cameraBtn);
        cancleBtn = (Button) view.findViewById(R.id.cancleBtn);
        this.img = (ImageView) findViewById(R.id.mImg);

    }

    @Override
    protected void initData() {

        headImgFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/head.jpg");
    }

    @Override
    protected void initListener() {

        headLayout.setOnClickListener(this);
        photosBtn.setOnClickListener(this);
        cameraBtn.setOnClickListener(this);
        cancleBtn.setOnClickListener(this);
    }

    @Override
    protected void loadData() {

    }

    private void showSelectPhotoPopup(){
        popupWindow = new PopupWindow(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        popupWindow.setContentView(view);
        //设popupwindow背景透明
        popupWindow.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //设置外部可以点击
        popupWindow.setOutsideTouchable(true);
        popupWindow.showAtLocation(view, Gravity.BOTTOM,0,0);

    }

    private void dismiss(){
        if(popupWindow != null && popupWindow.isShowing())
            popupWindow.dismiss();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.headLayout:
                showSelectPhotoPopup();
                break;
            case R.id.photosBtn:
                dismiss();
                searchPhotos();
                break;
            case R.id.cameraBtn:
                break;
            case R.id.cancleBtn:
                dismiss();
                break;
        }
    }

    //打开相册
    private void searchPhotos(){
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent,OPENPHOTOCODE);
    }

    //打开裁剪框
    private void crop(Uri uri){
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri,"image/*");
        //允许裁剪
        intent.putExtra("crop",true);
        //设置裁剪框比例
        intent.putExtra("aspectX",1);
        intent.putExtra("aspectY",1);

        intent.putExtra("output",Uri.fromFile(headImgFile));

        //设置返回值
//        intent.putExtra("return-data",true);
        startActivityForResult(intent,CROPCODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == OPENPHOTOCODE){
            if(data != null){
                Uri uri = data.getData();
                crop(uri);
            }
        }else if(requestCode == CROPCODE){
            if(data != null){
                Intent intent = getIntent();
                intent.putExtra("headPath",headImgFile.getAbsolutePath());
                setResult(RESULTCODE,intent);
                finish();
//                Bitmap bitmap = data.getParcelableExtra("data");
//                img.setImageBitmap(bitmap);
            }
        }
    }
}

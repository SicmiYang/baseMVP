package com.nfyg.mymvp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by shengming.yang on 2017/2/8.
 */
public abstract class BaseActivity<C extends BaseController> extends AppCompatActivity implements HSViewer{

    protected C controller;
    private int layoutResId;

    public BaseActivity(int layoutResId) {
        this.layoutResId = layoutResId;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(layoutResId);
        controller = getController();
        controller.bindVu();
    }

    @Override
    public <T extends View> T findView(int ResId) {
        return (T) findViewById(ResId);
    }


    @Override
    public void showLoading(String msg) {

    }

    @Override
    public void cannleLoading() {

    }

    @Override
    public void showDialog(String title, String msg, String okText, String cancelText, DialogInterface dialogInterface) {

    }

    protected abstract C getController();

    @Override
    protected void onDestroy() {
        if (controller!=null) controller.closeAll();
        super.onDestroy();
    }

    protected void showToast(String msg) {
        if (null != msg) {
            Toast.makeText(this,"TODO...",Toast.LENGTH_SHORT).show();
        }
    }

    public void gotoActivity(Class<?> cls) {
        Intent intent;
        intent = new Intent(this, cls);
        startActivity(intent);
    }
}

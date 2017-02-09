package com.nfyg.mymvp.activity;

import android.os.Bundle;

import com.nfyg.mymvp.BaseActivity;
import com.nfyg.mymvp.R;
import com.nfyg.mymvp.controller.MainController;
import com.nfyg.mymvp.presenter.MainPresenter;
import com.nfyg.mymvp.view.MainView;

public class MainActivity extends BaseActivity<MainController> implements MainView{

    public MainActivity() {
        super(R.layout.activity_main);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void onMain() {
       showToast("TODO");
    }

    @Override
    protected MainController getController() {
        return new MainController(this
        ,new MainPresenter(this));
    }

}

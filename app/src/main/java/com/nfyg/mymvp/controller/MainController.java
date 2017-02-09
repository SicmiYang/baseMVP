package com.nfyg.mymvp.controller;

import android.view.View;

import com.nfyg.mymvp.BaseController;
import com.nfyg.mymvp.R;
import com.nfyg.mymvp.presenter.MainPresenter;
import com.nfyg.mymvp.view.MainView;

/**
 * Created by shengming.yang on 2017/2/8.
 */
public class MainController extends BaseController<MainView,MainPresenter>{


    public MainController(MainView hsViewer, MainPresenter presenter) {
        super(hsViewer, presenter);
    }

    @Override
    public void bindVu() {
        getView(R.id.text).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.text:
                mPresenter.ondo();
        }

    }

    @Override
    public void closeAll() {
        super.closeAll();
    }
}

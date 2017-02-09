package com.nfyg.mymvp.presenter;

import com.nfyg.mymvp.HSPresenter;
import com.nfyg.mymvp.view.MainView;

/**
 * Created by shengming.yang on 2017/2/8.
 */
public class MainPresenter extends HSPresenter<MainView> {


    public MainPresenter(MainView mainView) {
        super(mainView);
    }

    public void ondo(){
        viewer.onMain();
    }

    @Override
    public void closeAll() {

    }
}

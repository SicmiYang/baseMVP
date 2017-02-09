package com.nfyg.mymvp;

/**
 * Created by shengming.yang on 2017/2/8.
 */
public abstract class HSPresenter<HV extends HSViewer> {

    protected  HV viewer;

    public HSPresenter(HV hv){
        viewer = hv;
    }

    public abstract void closeAll();

}

package com.nfyg.mymvp;

import android.util.SparseArray;
import android.view.View;

/**
 * Created by shengming.yang on 2017/2/8.
 */
public abstract class BaseController<HV extends HSViewer,P extends  HSPresenter> implements View.OnClickListener{

    private SparseArray<View> viewCache = new SparseArray<View>();

    protected HV hv;

    protected P mPresenter;

    public abstract void bindVu();

    public BaseController(HV hsViewer,P presenter){
        hv =  hsViewer;
        mPresenter = presenter;
    }

    public <T extends View>  T getView(int resId){

        if (viewCache.get(resId)== null) viewCache.put(resId,hv.findView(resId));

        return (T) viewCache.get(resId);

    }

    public void closeAll(){
        if (mPresenter!=null)mPresenter.closeAll();
    }

}

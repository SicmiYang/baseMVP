package com.nfyg.mymvp;

import android.content.DialogInterface;
import android.view.View;

/**
 * Created by shengming.yang on 2017/2/8.
 */
public interface HSViewer {


    void showLoading(String msg);

    void cannleLoading();

    void showDialog(String title,
                    String msg,
                    String okText,
                    String cancelText,
                    DialogInterface dialogInterface);

    <T extends View> T findView(int ResId);

}

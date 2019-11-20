package com.huatec.edu.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.annotation.LayoutRes;

import com.huatec.edu.R;
import com.huatec.edu.common.BaseActivity;
import com.huatec.edu.fragment.NavigationFragment;



public class MainActivity extends BaseActivity {
    @Override
    public @LayoutRes
    int getContentViewId(){
        return R.layout.activity_main;
    }

    @Override
    protected void initView(){
        super.initView();
        //将Fragment添加到Activity中
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        //这里是将fragment添加到指定的id为f1_main的地方去，这个f1_main在MainActivity的layout文件中
        transaction.replace(R.id.f1_main,new NavigationFragment());
        transaction.commit();
    }
}

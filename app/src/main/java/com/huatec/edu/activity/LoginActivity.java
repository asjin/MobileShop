package com.huatec.edu.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.huatec.edu.R;
import com.huatec.edu.common.BaseActivity;
import com.huatec.edu.common.Constants;
import com.huatec.edu.http.ProgressDialogSubscriber;
import com.huatec.edu.http.entity.MemberEntity;
import com.huatec.edu.http.presenter.MemberPresenter;
import com.huatec.edu.utils.SystemCofig;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity{

    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.et_pwd)
    EditText etPwd;

    @Override
    public int getContentViewId(){
        return R.layout.activity_login;
    }

    @OnClick(R.id.iv_back)
    void close(){
        finish();
    }

    @OnClick(R.id.bt_login)
    void login(){
        String userName = etUsername.getText().toString().trim();
        String pwd = etPwd.getText().toString().trim();
        if (TextUtils.isEmpty(userName)){
            toastShort("请输入用户名");
            return;
        }
        if (TextUtils.isEmpty(pwd)){
            toastShort("请输入密码");
            return;
        }
        MemberPresenter.login2(new ProgressDialogSubscriber<MemberEntity>(this) {

            @Override
            public void onNext(MemberEntity memberEntity) {
                //保存登录状态
                SystemCofig.setLogin(true);
                //弹出登录成功提示
                toastShort("登录成功");

                //保存登陆账户信息
                SystemCofig.setLoginUserName(memberEntity.uname);
                SystemCofig.setLoginUserEmail(memberEntity.email);
                SystemCofig.setLoginUserHead(memberEntity.image);

                sendLoginBroadcast();

                //返回数据，只有调用了setResult，在调用的地方才会回调onActivityResult方法
                setResult(RESULT_OK);
                finish();
            }
        },userName,pwd);
    }

    private void sendLoginBroadcast(){
        Intent intent = new Intent();
        intent.setAction(Constants.ACTION_LOGIN);
        intent.putExtra("my_data","这是数据");
        sendBroadcast(intent);
    }

}

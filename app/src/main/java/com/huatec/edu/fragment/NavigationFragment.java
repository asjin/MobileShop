package com.huatec.edu.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageButton;

import com.huatec.edu.R;
import com.huatec.edu.common.BaseFragment;



public class NavigationFragment extends BaseFragment implements View.OnClickListener {

    private ImageButton mIbHome;
    private ImageButton mIbCategory;
    private ImageButton mIbCart;
    private ImageButton mIbPersonal;
    private HomeFragment homeFragment;
    private CategoryFragment categoryFragment;
    private CartFragment cartFragment;
    private PersonalFragment personalFragment;

    public int getContentViewId(){
        return R.layout.fragment_navigation;
    }

    protected void initView(View view){
        super.initView(view);
        //初始化控件
        mIbHome = view.findViewById(R.id.ib_home);
        mIbCategory = view.findViewById(R.id.ib_category);
        mIbCart = view.findViewById(R.id.ib_cart);
        mIbPersonal = view.findViewById(R.id.ib_personal);
        //设置监听器，监听点击事件
        mIbHome.setOnClickListener(this);
        mIbCategory.setOnClickListener(this);
        mIbCart.setOnClickListener(this);
        mIbPersonal.setOnClickListener(this);

        select(mIbHome);

    }

    private void select(View v) {
        //重置UI，将图标全部恢复为未选中状态，在下面判断具体点击了哪个，再把它设置为选中状态
        mIbHome.setImageResource(R.drawable.tab_item_home_normal);
        mIbCategory.setImageResource(R.drawable.tab_item_category_normal);
        mIbCart.setImageResource(R.drawable.tab_item_cart_normal);
        mIbPersonal.setImageResource(R.drawable.tab_item_personal_normal);
        //Fragment里还可以添加Fragment，方法和Activity里添加Fragment是一样的
        //使用FragmentManger来管理Fragment，Fragment里面可以直接获取
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //先把Fragment都隐藏，在后续判断选中哪个按钮，展示对应的Fragment
        if(homeFragment != null){
            fragmentTransaction.hide(homeFragment);
        }
        if (categoryFragment != null){
            fragmentTransaction.hide(categoryFragment);
        }
        if (cartFragment != null){
            fragmentTransaction.hide(cartFragment);
        }
        if (personalFragment != null){
            fragmentTransaction.hide(personalFragment);
        }

        switch (v.getId()){
            case R.id.ib_home:
                mIbHome.setImageResource(R.drawable.tab_item_home_focus);
                if (homeFragment == null){
                    homeFragment = new HomeFragment();
                    fragmentTransaction.add(R.id.f1_main_navigation,homeFragment);
                }else {
                    fragmentTransaction.show(homeFragment);
                }
                break;
            case R.id.ib_category:
                mIbCategory.setImageResource(R.drawable.tab_item_category_focus);
                if (categoryFragment == null){
                    categoryFragment = new CategoryFragment();
                    fragmentTransaction.add(R.id.f1_main_navigation,categoryFragment);
                }else {
                    fragmentTransaction.show(categoryFragment);
                }
                break;
            case R.id.ib_cart:
                mIbCart.setImageResource(R.drawable.tab_item_cart_focus);
                if (cartFragment == null){
                    cartFragment = new CartFragment();
                    fragmentTransaction.add(R.id.f1_main_navigation,cartFragment);
                }else {
                    fragmentTransaction.show(cartFragment);
                }
                break;
            case R.id.ib_personal:
                mIbPersonal.setImageResource(R.drawable.tab_item_personal_focus);
                if (personalFragment == null){
                    personalFragment = new PersonalFragment();
                    fragmentTransaction.add(R.id.f1_main_navigation,personalFragment);
                }else {
                    fragmentTransaction.show(personalFragment);
                }
                break;
        }

        fragmentTransaction.commit();
    }

    public void onClick(View v){
        select(v);
    }
}

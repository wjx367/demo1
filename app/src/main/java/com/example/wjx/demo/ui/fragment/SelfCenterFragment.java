package com.example.wjx.demo.ui.fragment;

import android.os.Bundle;
import android.widget.TextView;

import com.example.wjx.demo.R;
import com.example.wjx.demo.base.BaseFragment;

/**
 * Created by wjx on 2017/6/25.
 */

public class SelfCenterFragment extends BaseFragment {

    private int type;
    private TextView mTitle;


    public static SelfCenterFragment newIntance(int i) {
        SelfCenterFragment newfragment = new SelfCenterFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("hello", i);
        newfragment.setArguments(bundle);
        return newfragment;
    }


    @Override
    public int getlayoutId() {
        return R.layout.selfcenter_fragment_layout;
    }

    @Override
    protected void initView() {
        mTitle = (TextView) rootView.findViewById(R.id.title);
    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        type = bundle != null ? bundle.getInt("hello") : 0;
        mTitle.setText(type + "");
    }


}

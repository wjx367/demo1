package com.example.wjx.demo.ui.fragment;

import android.os.Bundle;
import android.widget.TextView;

import com.example.wjx.demo.R;
import com.example.wjx.demo.base.BaseFragment;

/**
 * Created by wjx on 2017/6/25.
 */

public class LoanFragment extends BaseFragment {

    private int type;
    private TextView mTitle;


    public static LoanFragment newIntance(int i){
        LoanFragment newfragment = new LoanFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("hello",i);
        newfragment.setArguments(bundle);
        return newfragment;
    }


    @Override
    public int getlayoutId() {
        return R.layout.loan_fragment_layout;
    }

    @Override
    protected void initView() {
        mTitle = (TextView) rootView.findViewById(R.id.title);
    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        type = bundle !=null ?bundle.getInt("hello") : 0 ;
        mTitle.setText(type+"");
    }



}

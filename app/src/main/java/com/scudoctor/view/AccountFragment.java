package com.scudoctor.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.scudoctor.R;
//个人账户
public class AccountFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View v=LayoutInflater.from(getActivity()).inflate(R.layout.account_f,null);
        initView();
        return v;
    }

    public void initView(){

    }
}

package com.devlovepreet.fragmentdrawer.TabC;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.devlovepreet.fragmentdrawer.R;
import com.devlovepreet.fragmentdrawer.constant.BaseFragment;


public class AppTabCSecondFragment extends BaseFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
        View view       =   inflater.inflate(R.layout.app_tab_b_second_screen, container, false);
		TextView tv = (TextView)view.findViewById(R.id.tv);
		tv.setText("Tab C \nSecond Fragment");
        return view;
	}
}

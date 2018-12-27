package com.bawei.nice.home.presnter;

import com.bawei.nice.MainActivity;
import com.bawei.nice.home.model.HomeListModel;
import com.bawei.nice.home.view.IHomeView;

public class HomePresnter implements IHomeView,HomeListModel.ModelInter {

    private HomeListModel homeListModel;
    MainActivity main;
    private String modeldata;

    public HomePresnter(MainActivity main) {
        this.main = main;
        //初始化model
        homeListModel = new HomeListModel(this);
    }

    @Override
    public void LoadSuccess(String s) {

    }

    @Override
    public void LoadFalie() {

    }

    @Override
    public void getViewData(String data) {

    }
}

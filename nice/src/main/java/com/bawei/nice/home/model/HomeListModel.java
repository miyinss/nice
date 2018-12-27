package com.bawei.nice.home.model;

public class HomeListModel  implements  IHomeListModel{

    private ModelInter modelInter;

    public HomeListModel(ModelInter modelInter) {
        this.modelInter = modelInter;
    }

    @Override
    public void getData(String url) {

    }

    public interface  ModelInter{
        void LoadSuccess(String s);
        void LoadFalie();
    }

}

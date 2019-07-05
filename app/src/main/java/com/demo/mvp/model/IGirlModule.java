package com.demo.mvp.model;

import com.demo.mvp.bean.Girl;

import java.util.List;

public interface IGirlModule {

    //避免页面卡顿，采用接口回调方式
    void loadData(GirlOnLoadListener listener);

    interface GirlOnLoadListener{
        void complete(List<Girl> girls);
    }

}

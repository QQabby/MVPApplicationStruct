package com.demo.mvp.view;

import com.demo.mvp.bean.Girl;

import java.util.List;

public interface IGirlView {

    void showLoading();

    //使用回调的方式回调,真正实现类是Activity
    void showGirlData(List<Girl> data);

}

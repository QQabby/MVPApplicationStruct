package com.demo.mvp.base;

import com.demo.mvp.view.IGirlView;

import java.lang.ref.WeakReference;

public class BasePresenter<T> {

    //弱引用
   public WeakReference<T> mWeakGirlView;

    public void attchView(T view){
        mWeakGirlView = new WeakReference<T>(view);
    }

    public void detachView(){
        mWeakGirlView.clear();
    }
}

package com.demo.mvp.model;

import com.demo.mvp.bean.Girl;

import java.util.ArrayList;

public class GirlModuleImpl implements IGirlModule {


    @Override
    public void loadData(GirlOnLoadListener listener) {

        ArrayList<Girl> list = new ArrayList<>();

        for(int i=1;i<51;i++){
            list.add(new Girl("qq"+i,"pic1"));
        }

        listener.complete(list);
    }

}

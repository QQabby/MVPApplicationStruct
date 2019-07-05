package com.demo.mvp.presenter;

import com.demo.mvp.base.BasePresenter;
import com.demo.mvp.bean.Girl;
import com.demo.mvp.model.GirlModuleImpl;
import com.demo.mvp.model.IGirlModule;
import com.demo.mvp.view.IGirlView;

import java.util.List;

/**
 * 业务层
 * @param <T>
 */
public class GirlPresenter<T extends IGirlView> extends BasePresenter<T> {

    //左手
    //private IGirlView iGirlView;
    //右手
    private IGirlModule iGirlModule = new GirlModuleImpl();


    //执行操作
    public void fetch(){
        if(mWeakGirlView.get() != null){
            mWeakGirlView.get().showLoading();

            if(iGirlModule!=null){
                iGirlModule.loadData(new IGirlModule.GirlOnLoadListener() {
                    @Override
                    public void complete(List<Girl> girls) {
                        if(mWeakGirlView.get() != null){
                            mWeakGirlView.get().showGirlData(girls);
                        }
                    }
                });
            }
        }
    }


}

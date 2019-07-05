package com.demo.mvp

import android.os.Bundle
import android.widget.Toast
import com.demo.mvp.bean.Girl
import com.demo.mvp.adapter.MyAdapter
import com.demo.mvp.presenter.GirlPresenter
import com.demo.mvp.base.BaseActivity
import com.demo.mvp.view.IGirlView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<IGirlView, GirlPresenter<IGirlView>>() ,IGirlView{

    override fun createPresenter(): GirlPresenter<IGirlView> {

        return GirlPresenter()
    }

    var adapter : MyAdapter = MyAdapter(this@MainActivity)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //加载数据
        girlPresenter.fetch()
    }

    override fun showGirlData(data: MutableList<Girl>?) {

        adapter.setData(data)
        listview.adapter = adapter
    }

    override fun showLoading() {
        Toast.makeText(this@MainActivity,"开始加载",Toast.LENGTH_SHORT).show()
    }


}

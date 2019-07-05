package com.demo.mvp.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

open abstract class BaseActivity<V,T : BasePresenter<V>> : AppCompatActivity() {

    lateinit var girlPresenter : T

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         girlPresenter = createPresenter()
         girlPresenter.attchView(this as V)
     }

     override fun onDestroy() {
         super.onDestroy()
         girlPresenter.detachView()
     }

     abstract fun createPresenter() : T
}
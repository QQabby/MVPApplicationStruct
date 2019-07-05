package com.demo.mvp.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.demo.mvp.R;
import com.demo.mvp.bean.Girl;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private Context context;
    public MyAdapter(Context context) {
        this.context = context;
    }

    List<Girl> data;
    public void setData( List<Girl> data){
        this.data = data;
    }

    @Override
    public int getCount() {
        return data == null ? 0 : data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View view;
        if(convertView == null){
            view = View.inflate(context,R.layout.item_list,null);
        }else{
            view = convertView;
        }
        TextView tv = view.findViewById(R.id.textView);
        tv.setText(data.get(position).getName());
        return view;
    }


}

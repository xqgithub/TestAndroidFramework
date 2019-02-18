package com.example.testandroidframework.mvc.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testandroidframework.R;
import com.example.testandroidframework.mvc.bean.Student;
import com.example.testandroidframework.mvc.utils.DataUtils;

import java.util.List;

/**
 * Created by beijixiong on 2019/2/18.
 */

public class StudentAdapter extends BaseAdapter {
    private LayoutInflater myInflater;
    private List<Student> data;

    public StudentAdapter(Context context, List<Student> data) {
        myInflater = LayoutInflater.from(context);
        this.data = data;
    }


    @Override
    public int getCount() {
        return DataUtils.stuSize();
    }

    @Override
    public Object getItem(int position) {
        return DataUtils.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View stuView = myInflater.inflate(R.layout.stu_item, null);
        Student student = DataUtils.get(position);
        ImageView imgStu = stuView.findViewById(R.id.img_stu);
        imgStu.setImageResource(student.getStuImg());
        TextView tvStu = stuView.findViewById(R.id.tv_name);
        tvStu.setText(student.getName());
        return stuView;
    }
}

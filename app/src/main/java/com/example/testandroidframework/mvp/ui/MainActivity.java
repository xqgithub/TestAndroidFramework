package com.example.testandroidframework.mvp.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import com.example.testandroidframework.R;
import com.example.testandroidframework.mvp.adapter.StudentAdapter;
import com.example.testandroidframework.mvp.bean.Student;
import com.example.testandroidframework.mvp.presenter.StudentPresenterOne;
import com.example.testandroidframework.mvp.view.IStudentView;

import java.util.List;

/**
 * Created by beijixiong on 2019/2/18.
 */

public class MainActivity extends AppCompatActivity implements IStudentView {
    private ListView my_list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        my_list = findViewById(R.id.my_list);
        new StudentPresenterOne(this).fetch();
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "正在加载数据中……", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showStudents(List<Student> students) {
        // 负责显示
        my_list.setAdapter(new StudentAdapter(MainActivity.this, students));
    }
}

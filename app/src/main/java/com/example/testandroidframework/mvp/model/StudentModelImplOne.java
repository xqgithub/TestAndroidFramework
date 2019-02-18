package com.example.testandroidframework.mvp.model;

import com.example.testandroidframework.R;
import com.example.testandroidframework.mvp.bean.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by beijixiong on 2019/2/18.
 * Model层实现类
 */

public class StudentModelImplOne implements IStudentModel {


    @Override
    public void loadStudent(StudentOnLoadListener listener) {
        //模拟json数据加载
        List<Student> jsonStu1 = new ArrayList<Student>();
        jsonStu1.add(new Student("张三11", R.mipmap.ic_launcher));
        jsonStu1.add(new Student("李四11", R.mipmap.ic_launcher));
        jsonStu1.add(new Student("王五11", R.mipmap.ic_launcher));
        jsonStu1.add(new Student("赵六11", R.mipmap.ic_launcher));
        jsonStu1.add(new Student("陈七11", R.mipmap.ic_launcher));
        jsonStu1.add(new Student("孙八11", R.mipmap.ic_launcher));
        jsonStu1.add(new Student("海贼王路飞", R.mipmap.ic_launcher));
        // 通过回调方式传递数据
        if (listener != null) {
            listener.onComplete(jsonStu1);
        }
    }
}

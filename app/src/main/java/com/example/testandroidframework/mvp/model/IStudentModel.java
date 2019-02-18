package com.example.testandroidframework.mvp.model;


import com.example.testandroidframework.mvp.bean.Student;

import java.util.List;

/**
 * Created by beijixiong on 2019/2/18.
 * Model层接口
 */

public interface IStudentModel {
    interface StudentOnLoadListener {
        void onComplete(List<Student> students);
    }

    // 加载数据
    void loadStudent(StudentOnLoadListener listener);
}

package com.example.testandroidframework.mvp.view;


import com.example.testandroidframework.mvp.bean.Student;

import java.util.List;

/**
 * Created by beijixiong on 2019/2/18.
 * 定义View层接口
 */

public interface IStudentView {
    // 显示进度
    void showLoading();

    //显示学生
    void showStudents(List<Student> students);
}

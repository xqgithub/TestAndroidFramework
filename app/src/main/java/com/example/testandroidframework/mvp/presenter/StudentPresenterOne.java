package com.example.testandroidframework.mvp.presenter;

import com.example.testandroidframework.mvp.bean.Student;
import com.example.testandroidframework.mvp.model.IStudentModel;
import com.example.testandroidframework.mvp.model.StudentModelImplOne;
import com.example.testandroidframework.mvp.view.IStudentView;

import java.util.List;

/**
 * Created by beijixiong on 2019/2/18.
 */

public class StudentPresenterOne {
    //model层
    IStudentModel mStudentModel = new StudentModelImplOne();
    // View
    IStudentView mStudentView;

    // 初始化View
    public StudentPresenterOne(IStudentView mStudentView) {
        this.mStudentView = mStudentView;
    }

    public void fetch() {
        mStudentView.showLoading();// 显示进度
        // Model获取数据
        if (mStudentModel != null) {
            mStudentModel.loadStudent(new IStudentModel.StudentOnLoadListener() {
                @Override
                public void onComplete(List<Student> students) {
                    // 得到数据后给View显示数据
                    mStudentView.showStudents(students);
                }
            });
        }
    }
}

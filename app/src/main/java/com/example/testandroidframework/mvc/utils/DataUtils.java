package com.example.testandroidframework.mvc.utils;

import com.example.testandroidframework.R;
import com.example.testandroidframework.mvc.bean.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by beijixiong on 2019/2/18.
 */

public class DataUtils {
    public final static List<Student> stuData = new ArrayList<Student>();

    public static Student get(int i) {
        return stuData.get(i);
    }

    public static int stuSize() {
        return stuData.size();
    }

    static {
        stuData.add(new Student("张三", R.mipmap.ic_launcher));
        stuData.add(new Student("李四", R.mipmap.ic_launcher));
        stuData.add(new Student("王五", R.mipmap.ic_launcher));
        stuData.add(new Student("赵六", R.mipmap.ic_launcher));
        stuData.add(new Student("陈七", R.mipmap.ic_launcher));
        stuData.add(new Student("孙八", R.mipmap.ic_launcher));
        stuData.add(new Student("猴子搬来的救兵", R.mipmap.ic_launcher));

    }
}

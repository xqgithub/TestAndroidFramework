package com.example.testandroidframework.mvc.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.testandroidframework.R;
import com.example.testandroidframework.mvc.adapter.StudentAdapter;
import com.example.testandroidframework.mvc.utils.DataUtils;

/**
 * MainActivity 用列表形式实现
 */
public class MainActivity extends AppCompatActivity {

    private ListView my_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        my_list = findViewById(R.id.my_list);
        my_list.setAdapter(new StudentAdapter(MainActivity.this, DataUtils.stuData));
    }
}

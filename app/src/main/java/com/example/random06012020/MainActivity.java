package com.example.random06012020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Cách 1 : Dùng lớp random
//        Random random = new Random();

        // Cách 2 : Math
        // Hàm làm tròn : Math.round
        double numberRandom = Math.random();
        Log.d("BBB",String.valueOf(numberRandom));
        long value = Math.round(numberRandom);
        Log.d("BBB",String.valueOf(value));

        // 1 : Phím tắt hỗ trợ fix lỗi : alt + enter
        // 2 : Xem cách fix trên stackoverflow
        // 3 :  Coi document của object

        //builtin - function
//        Log.d("BBB","abc");
    }
}

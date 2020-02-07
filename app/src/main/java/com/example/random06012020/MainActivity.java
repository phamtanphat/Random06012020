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
//        0 -> 10
        // 75 => 133 => tìm công thức
        Random random = new Random();
        for (int i = 0 ; i < 1000 ; i++){
//            (max - min + 1) + min
            int value = random.nextInt(133 - 75 + 1) + 75;
            Log.d("BBB",value + "");
        }


        // Cách 2 : Math
        // Hàm làm tròn : Math.round
        // Hàm làm tròn lên : Math.ceil()
        // Hàm làm tròn xuống : Math.floor()
//
//        5 ~ 10
//        for (int i = 0 ; i < 100 ; i++){
//            double numberRandom = (Math.random() * 5) + 5;
//            long value = Math.round(numberRandom);
//            Log.d("BBB", String.valueOf(value));
//        }

//        double value = Math.floor(numberRandom);
//        Log.d("BBB",String.valueOf(value));

        // 1 : Phím tắt hỗ trợ fix lỗi : alt + enter
        // 2 : Xem cách fix trên stackoverflow
        // 3 :  Coi document của object

        //builtin - function
//        Log.d("BBB","abc");
    }
}

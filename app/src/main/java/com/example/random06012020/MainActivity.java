package com.example.random06012020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText mEdtSomin,mEdtSomax;
    Button mBtnRandom,mBtnResetRange,mBtnAddRange;
    TextView mTvKetqua;
    int[] arrayRange;
    Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtSomax = findViewById(R.id.edtSomax);
        mEdtSomin = findViewById(R.id.edtSomin);
        mBtnRandom = findViewById(R.id.btnRandom);
        mTvKetqua = findViewById(R.id.tvKetqua);
        mBtnResetRange = findViewById(R.id.btnResetRange);
        mBtnAddRange = findViewById(R.id.btnRange);
        // Task 1 : Kiểm tra có dữ liệu trong 2 Edittext hay không
        // Task 2 : Nếu số max < số min , số max = smin + 1;
        // Task 3 : Click button random trả về số trong khoản min và max
        // Task 4 : Nối chuỗi dữ liệu các giá trị random (5 - 3 - 2 - 1 -)
        // Task 5 : Random các số không được trùng với nhau
        // Task 6 : Số lần random sẽ bằng khoảng cách random
        // Button : Add range
//            + Tạo ra 1 mảng
//            + Thêm tất cả các số từ trong số min và số max vào trong mảng
//            + Ẩn edittext min và max và button add range sẽ bị tắt không được click
        // Button : Reset range
//                + Xóa các phần tử trong mảng
//                + Bật tính năng lại cho edittext và button
//                + Xóa dữ liệu kết quả cũ nếu có
        // Button : Random
//                + Lấy giá trị random được hiển thị lên trên text
//                + Hiện thị theo format ( 5 - 9 - 10 - 9)
//                + Nếu hết số random thì báo cho người dùng biết
        // ctrl + spacebar : gợi ý code

        ArrayList<Integer> array = new ArrayList<>();

        // Thêm dữ liệu vào mảng
        array.add(1);
        array.add(2);
        array.add(5);
        // Xóa phần tử
        array.remove(0);
        // Chỉnh sửa
        array.set(0 , 10);
        Log.d("BBB",array.size() + "");

        mBtnAddRange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textSmin = mEdtSomin.getText().toString();
                String textSmax = mEdtSomax.getText().toString();
                if (textSmax.isEmpty() || textSmin.isEmpty()){
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }

                int somax = Integer.parseInt(textSmax);
                int somin = Integer.parseInt(textSmin);

                if (somax <= somin){
                    somax = somin + 1;
                    mEdtSomax.setText(somax + "");
                }
                arrayRange = new int[somax - somin + 1];
                int count = somin;
                for (int i = 0 ; i < arrayRange.length; i++){
                    arrayRange[i] = count++;
                }
                mEdtSomax.setEnabled(false);
                mEdtSomin.setEnabled(false);
                mBtnAddRange.setEnabled(false);
            }
        });
        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = random.nextInt(arrayRange.length);
                int value = arrayRange[index];

                mTvKetqua.append(value + " - ");

            }
        });
    }
}

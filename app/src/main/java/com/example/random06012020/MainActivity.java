package com.example.random06012020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText mEdtSomin,mEdtSomax;
    Button mBtnRandom;
    TextView mTvKetqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtSomax = findViewById(R.id.edtSomax);
        mEdtSomin = findViewById(R.id.edtSomin);
        mBtnRandom = findViewById(R.id.btnRandom);
        mTvKetqua = findViewById(R.id.tvKetqua);

        // Task 1 : Kiểm tra có dữ liệu trong 2 Edittext hay không
        // Task 2 : Nếu số max < số min , số max = smin + 1;
        // Task 3 : Click button random trả về số trong khoản min và max
        // Task 4 : Nối chuỗi dữ liệu các giá trị random (5 - 3 - 2 - 1 -)

        // ctrl + spacebar : gợi ý code
        mBtnRandom.setOnClickListener(new View.OnClickListener() {
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
                }


            }
        });
    }
}

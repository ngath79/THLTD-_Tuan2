package com.google.th_tuan2_bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editcannang;
    EditText editchieucao;
    Button ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editcannang = findViewById(R.id.editcannang);
        editchieucao = findViewById(R.id.editchieucao);
        ketqua = findViewById(R.id.ketqua);

        ketqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n = Double.parseDouble(editcannang.getText().toString());
                double c = Double.parseDouble(editchieucao.getText().toString());
                Intent intent = new Intent(MainActivity.this,ketqua.class);
                intent.putExtra("nang", n);
                intent.putExtra("cao",c);
                startActivity(intent);
            }
        });
    }

}
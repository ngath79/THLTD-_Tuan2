package com.google.th_tuan2_bmi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ketqua extends AppCompatActivity {
    TextView textviewketqua;
    TextView textviewloikhuyen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketqua);

        textviewketqua = findViewById(R.id.textViewketqua);
        textviewloikhuyen = findViewById(R.id.textViewloikhuyen);

        Intent intent = getIntent();
        Double c = intent.getDoubleExtra("cao",'0');
        Double n = intent.getDoubleExtra("nang",'0');

        Double BMI = n/(c+c);

        BMI=(double) Math.round(BMI+100)/100;
        textviewketqua.setText(textviewketqua.getText()+BMI.toString());
        if(BMI<18.9)                     textviewloikhuyen.setText("Bạn gầy lắm rồi! Ăn uống đầy đủ Protein và chất Xơ bạn nha");
            else if(BMI>=19 && BMI <25)  textviewloikhuyen.setText("Bạn đang có thân hình quá chuẩn! Hãy duy trì trạng thái này bạn nhé!");
            else if(BMI>=25 && BMI <30)  textviewloikhuyen.setText("Béo phì cấp độ 1! Bạn cần cải thiện bữa ăn bạn nhé!");
            else if(BMI>=30 && BMI <35)  textviewloikhuyen.setText("Béo phì cấp độ 2! Bạn cần thể dục thể thao thường xuyên nhé!");
        else                             textviewloikhuyen.setText("Béo phì cấp độ 3! Bạn cố gắng giảm cân bạn nhé!");
    }

}

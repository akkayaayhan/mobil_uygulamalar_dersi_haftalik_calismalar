package com.mobildersi.hafta6_if_else_if_uyg_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_not1,et_not2,et_not3;
    TextView txtHesapla;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_not1=findViewById(R.id.editTextNumber_Not1);
        et_not2=findViewById(R.id.editTextNumber_Not2);
        et_not3=findViewById(R.id.editTextNumber_Not3);
        txtHesapla=findViewById(R.id.textView);
    }

    public void onayla(View view)
    {

        int not1=Integer.parseInt(et_not1.getText().toString());
        int not2=Integer.parseInt(et_not2.getText().toString());
        int not3=Integer.parseInt(et_not3.getText().toString());

        int ort=(not1+not2+not3)/3;

        if(ort<50){
            txtHesapla.setText("Öğrenci Dersten kaldı");
        }
        else if(ort<55){
            txtHesapla.setText("Dersten geçti");
        } else if (ort<85) {
            txtHesapla.setText("Belge aldı");
        }
        else {
            txtHesapla.setText("Lütfen 0-100 aralığında değer giriniz");
        }


    }
}
package com.mobil.hafta11_java_geneltekrar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
    }

    public void mesaj(View view){
        String ad=editText1.getText().toString();
        String soyad=editText2.getText().toString();
        textView.setText("Hoşgeldiniz "+ad+" "+soyad);
    }
}
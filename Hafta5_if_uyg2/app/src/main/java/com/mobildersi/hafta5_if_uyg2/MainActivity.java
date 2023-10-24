package com.mobildersi.hafta5_if_uyg2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText_sayi1;
    EditText editText_sayi2;//snake_case
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_sayi1=findViewById(R.id.editTextNumber_Sayi1);
        editText_sayi2=findViewById(R.id.editTextNumber_Sayi2);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView4);
    }

    public void kontrol(View view){
        int sayi1=Integer.parseInt(editText_sayi1.getText().toString());
        int sayi2=Integer.parseInt(editText_sayi2.getText().toString());

        if(sayi1>sayi2){
            Toast.makeText(this,"Sayı1 büyüktür Sayı 2",Toast.LENGTH_LONG).show();
            textView.setText("Sayı1 büyüktür Sayı2");
        }
        if(sayi1==sayi2){
            Toast.makeText(this,"Sayı1 eşittir Sayı 2",Toast.LENGTH_LONG).show();
            textView.setText("Sayı1 eşittir Sayı2");
        }
        if(sayi1<sayi2){
            Toast.makeText(this,"Sayı1 küçüktür Sayı 2",Toast.LENGTH_LONG).show();
            textView.setText("Sayı1 küçüktür Sayı2");
        }

    }
}
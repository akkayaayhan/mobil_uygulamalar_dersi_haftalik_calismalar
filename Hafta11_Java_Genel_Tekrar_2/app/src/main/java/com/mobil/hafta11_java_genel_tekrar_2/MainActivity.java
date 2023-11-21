package com.mobil.hafta11_java_genel_tekrar_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2;
    Button button;
    TextView textView,textView2,textView3,textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
    }

    public void hesapla(View view){
        int sayi1=Integer.parseInt(editText1.getText().toString());
        int sayi2=Integer.parseInt(editText2.getText().toString());

        Toast.makeText(this,"Hesap Başarılı",Toast.LENGTH_LONG).show();



        textView.setText("Toplama: "+(sayi1+sayi2));
        textView2.setText("Çıkarma: "+(sayi1-sayi2));
        textView3.setText("Çarpma: "+(sayi1*sayi2));
        textView4.setText("Bölme: "+(sayi1/sayi2));

    }
}
package com.mobildersi.hafta5_if_else_uyg3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final String kullaniciAdi="admin";
    final String sifre="1111";

    EditText editText_KullaniciAdi,editText_Sifresi;
    Button button;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_KullaniciAdi=findViewById(R.id.editText_KullaniciAdi);
        editText_Sifresi=findViewById(R.id.editText_Sifre);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
    }

    public void onayla(View view){

       String kullanici=editText_KullaniciAdi.getText().toString();
       String password=editText_Sifresi.getText().toString();

       if(kullanici.equals(kullaniciAdi)&& password.equals(sifre)){

           textView.setText("Kullanıcı girişi başarılı");

       }

       else{
           textView.setText("Hatalı Kullanıcı adı veya şifre");
       }



    }
}
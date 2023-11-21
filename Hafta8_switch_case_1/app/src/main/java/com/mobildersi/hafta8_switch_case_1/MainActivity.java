package com.mobildersi.hafta8_switch_case_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber_Ay;
    Button button_onayla;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber_Ay=findViewById(R.id.editTextNumber_Ay);
        button_onayla=findViewById(R.id.button_Onayla);
        textView=findViewById(R.id.textView);
    }

    public void onayla(View view){
        
        int sayiAy=Integer.parseInt(editTextNumber_Ay.getText().toString());
        switch (sayiAy){
            case 1: textView.setText("Ocak");
            break;
            case 2: textView.setText("Şubat");
                break;
            case 3: textView.setText("Mart");
                break;
        }


    }
}
















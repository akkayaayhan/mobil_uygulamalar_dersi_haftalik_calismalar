package com.mobil.hafta11_java_geneltekrar_3;

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

    public void bul(View view){

        int s1=Integer.parseInt(editText1.getText().toString());
        int s2=Integer.parseInt(editText2.getText().toString());
        int toplam=0;
        for(int i=s1;i<=s2;i++){
           toplam+=i;
           if(i%13==0){
               Toast.makeText(this,"13 ün katı :"+i,Toast.LENGTH_LONG).show();
           }
        }
        textView.setText("Toplam="+toplam);

    }
}
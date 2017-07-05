package com.example.computer.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText ed1,ed2;
    TextView result;
    int num1,num2,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.btn);
        ed1=(EditText)findViewById(R.id.num1);
        ed2=(EditText)findViewById(R.id.num2);
        result=(TextView)(findViewById(R.id.result));

        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.length()>0 && ed2.length()>0)
                {
                    num1=Integer.parseInt(ed1.getText().toString());
                    num2=Integer.parseInt(ed2.getText().toString());
                    sum=num1+num2;
                    result.setText("Sum is "+sum);
                }
                else

                    result.setText("Input please");
            }
        });





    }
}

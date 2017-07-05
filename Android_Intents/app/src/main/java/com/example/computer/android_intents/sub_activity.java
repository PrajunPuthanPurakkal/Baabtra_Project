package com.example.computer.android_intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by computer on 05-07-2017.
 */

public class sub_activity extends Activity {


    Button btnClick;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


        btnClick=(Button)findViewById(R.id.ClickMe);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1=new Intent(sub_activity.this,MainActivity.class);
                startActivity(intent1);

            }
        });


    }

}

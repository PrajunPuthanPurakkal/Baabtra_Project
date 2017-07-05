package com.example.computer.editview_textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

    Button btnclick;
    EditText edittext;
    TextView txtview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnclick=(Button)findViewById(R.id.btn);
        edittext=(EditText)findViewById(R.id.edittext);
        txtview=(TextView)findViewById(R.id.txtview);

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtview.setText("");
                if(edittext.length()>0)
                {
                    txtview.setText(edittext.getText());
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Enter some text in the Edit Text",Toast.LENGTH_LONG).show();
                    edittext.findFocus();
                }
            }
        });
    }
}

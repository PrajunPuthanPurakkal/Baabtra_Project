package com.example.computer.alert_box;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AlertDialog alertDialog;
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertDialog = new AlertDialog.Builder(MainActivity.this).create();

                alertDialog.setTitle("Dialog Button");

                alertDialog.setMessage("This is a One-button dialog!");

                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Ok", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int id) {

                        //...
                        Toast.makeText(getApplicationContext(),"You clicked Ok",Toast.LENGTH_SHORT).show();

                    } });
                alertDialog.show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertDialog = new AlertDialog.Builder(MainActivity.this).create();

                alertDialog.setTitle("Dialog Button");

                alertDialog.setMessage("This is a two-button dialog!");

                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Ok", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int id) {

                        //...
                        Toast.makeText(getApplicationContext(),"You clicked Ok",Toast.LENGTH_SHORT).show();

                    } });

                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int id) {

                        //...
                        Toast.makeText(getApplicationContext(),"You clicked Cancel",Toast.LENGTH_SHORT).show();


                    }});
                alertDialog.show();

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog = new AlertDialog.Builder(MainActivity.this).create();

                alertDialog.setTitle("Dialog Button");

                alertDialog.setMessage("This is a three-button dialog!");

                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Yes", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int id) {

                        //...
                        Toast.makeText(getApplicationContext(),"You clicked Yes",Toast.LENGTH_SHORT).show();

                    }
                });

                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "No", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int id) {

                        //...
                        Toast.makeText(getApplicationContext(),"You clicked No",Toast.LENGTH_SHORT).show();

                    }
                });

                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Retry", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int id) {

                        //...
                        Toast.makeText(getApplicationContext(),"You clicked Retry",Toast.LENGTH_SHORT).show();

                    }
                });
                alertDialog.show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You clicked Alert4",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

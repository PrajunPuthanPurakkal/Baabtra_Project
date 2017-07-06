package com.example.computer.mycalculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity{


    Button zero, one, two, three, four, five, six, seven, eight, nine;
    Button delete, plus_minus, back, multiple, minus, plus, dot, divide, equal;
    TextView txtResult;
    float num1, num2;
    String op;
    float temp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //NUMBERS
        zero=(Button)findViewById(R.id.btn_zero);
        one=(Button)findViewById(R.id.btn_one);
        two=(Button)findViewById(R.id.btn_two);
        three=(Button)findViewById(R.id.btn_three);
        four=(Button)findViewById(R.id.btn_four);
        five=(Button)findViewById(R.id.btn_five);
        six=(Button)findViewById(R.id.btn_six);
        seven=(Button)findViewById(R.id.btn_seven);
        eight=(Button)findViewById(R.id.btn_eight);
        nine=(Button)findViewById(R.id.btn_nine);

        //OPERATORS
        multiple=(Button)findViewById(R.id.btn_multiple);
        plus=(Button)findViewById(R.id.btn_plus);
        minus =(Button)findViewById(R.id.btn_minus);
        divide=(Button)findViewById(R.id.btn_divide);
        plus_minus=(Button)findViewById(R.id.btn_plus_minus);

        //OTHER BUTTONS
        back=(Button)findViewById(R.id.btn_back);
        dot=(Button)findViewById(R.id.btn_dot);
        equal=(Button)findViewById(R.id.btn_equal);
        delete=(Button)findViewById(R.id.btn_delete);


        txtResult=(TextView)findViewById(R.id.textResult);


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtResult.setText(txtResult.getText()+"0");
                Toast.makeText(getApplicationContext(),"Zero", Toast.LENGTH_SHORT).show();

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtResult.setText(txtResult.getText()+"1");
                Toast.makeText(getApplicationContext(),"One", Toast.LENGTH_SHORT).show();

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtResult.setText(txtResult.getText()+"2");
                Toast.makeText(getApplicationContext(),"Two", Toast.LENGTH_SHORT).show();

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtResult.setText(txtResult.getText()+"3");
                Toast.makeText(getApplicationContext(),"Three", Toast.LENGTH_SHORT).show();

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtResult.setText(txtResult.getText()+"4");
                Toast.makeText(getApplicationContext(),"Four", Toast.LENGTH_SHORT).show();

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtResult.setText(txtResult.getText()+"5");
                Toast.makeText(getApplicationContext(),"Five", Toast.LENGTH_SHORT).show();

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtResult.setText(txtResult.getText()+"6");
                Toast.makeText(getApplicationContext(),"Six", Toast.LENGTH_SHORT).show();

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtResult.setText(txtResult.getText()+"7");
                Toast.makeText(getApplicationContext(),"Seven", Toast.LENGTH_SHORT).show();

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtResult.setText(txtResult.getText()+"8");
                Toast.makeText(getApplicationContext(),"Eight", Toast.LENGTH_SHORT).show();

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtResult.setText(txtResult.getText()+"9");
                Toast.makeText(getApplicationContext(),"Nine", Toast.LENGTH_SHORT).show();

            }
        });


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtResult.length() == 0){
                    txtResult.setText("");
                }else {
                    num1 = Float.parseFloat(txtResult.getText() + "");
                    op = "+";
                    txtResult.setText(null);
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtResult.length() == 0){
                    txtResult.setText("");
                }else {
                    num1 = Float.parseFloat(txtResult.getText() + "");
                    op = "-";
                    txtResult.setText(null);
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtResult.length() == 0){
                    txtResult.setText("");
                }else {
                    num1 = Float.parseFloat(txtResult.getText() + "");
                    op = "/";
                    txtResult.setText(null);
                }
            }
        });

        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtResult.length() == 0){
                    txtResult.setText("");
                }else {
                    num1 = Float.parseFloat(txtResult.getText() + "");
                    op = "*";
                    txtResult.setText(null);
                }
            }
        });

        plus_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtResult.length() == 0){
                    txtResult.setText("");
                }
                else {
                    temp = Float.parseFloat(txtResult.getText().toString());
                    temp = temp * -1;
                    txtResult.setText(Float.toString(temp));
                }


            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean flag=false;

                String str=txtResult.getText().toString();
                for(int i=0;i<str.length();i++)
                {
                    if(str.charAt(i)=='.'){
                        flag=true;
                    }
                }

                if (flag==true)
                {
                    //Do nothing
                }
                else {
                    txtResult.append(".");
                }
                //txtResult.setText(txtResult.getText()+".");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtResult.length() == 0) {
                    txtResult.setText("");
                } else {

                    num2 = Float.parseFloat(txtResult.getText() + "");

                    if (op == "+") {
                        txtResult.setText(num1 + num2 + "");
                        op = "";
                    }

                    if (op == "-") {
                        txtResult.setText(num1 - num2 + "");
                        op = "";
                    }

                    if (op == "*") {
                        txtResult.setText(num1 * num2 + "");
                        op = "";
                    }

                    if (op == "/") {
                        if (num2 == 0) {
                            Toast.makeText(getApplicationContext(),"Division by zero Error",Toast.LENGTH_SHORT).show();
                            txtResult.setText("");
                            //txtResult.setText("Error");

                        } else {
                            txtResult.setText(num1 / num2 + "");
                            op = "";
                        }
                    }
                }
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtResult.length() == 0){
                    txtResult.setText("");
                }
                else {
                    String str = txtResult.getText().toString();
                    if (str.length() >= 1) {
                        str = str.substring(0, str.length() - 1);
                        txtResult.setText(str);
                    } else if (str.length() <= 1) {
                        txtResult.setText("0");
                    }
                }

            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtResult.setText("");

            }
        });






    }
}
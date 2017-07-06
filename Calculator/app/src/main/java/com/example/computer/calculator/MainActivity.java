package com.example.computer.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

    Button zero,one,two,three,four,five,six,seven,eight,nine;
    Button delete,plus_minus,percentage,back,multiple,minus,plus,dot,divide,equal;
    TextView txtResult;
    float num1,num2,result;
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
        percentage=(Button)findViewById(R.id.btn_percentage);
        back=(Button)findViewById(R.id.btn_back);
        dot=(Button)findViewById(R.id.btn_dot);
        equal=(Button)findViewById(R.id.btn_equal);


        txtResult=(TextView)findViewById(R.id.textResult);

        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        multiple.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        divide.setOnClickListener(this);
        plus_minus.setOnClickListener(this);
        percentage.setOnClickListener(this);
        back.setOnClickListener(this);
        dot.setOnClickListener(this);
        equal.setOnClickListener(this);
        delete.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {

        if(v==zero){
            txtResult.setText("0");
            //txtResult.setText(String.valueOf("0"));
            Toast.makeText(getApplicationContext(),"Zero",Toast.LENGTH_SHORT).show();
        }
        if(v==one){
            txtResult.setText("1");
            //txtResult.setText(String.valueOf("0"));
            //txtResult.setText(txtResult.getText()+"1");
            Toast.makeText(getApplicationContext(),"One",Toast.LENGTH_SHORT).show();
        }
        if(v==two){
            txtResult.setText("2");
            //txtResult.setText(String.valueOf("0"));
            //txtResult.setText(txtResult.getText()+"2");
            Toast.makeText(getApplicationContext(),"Two",Toast.LENGTH_SHORT).show();
        }
        if(v==three){
            txtResult.setText("3");
            //txtResult.setText(String.valueOf("0"));
            //txtResult.setText(txtResult.getText()+"3");
            Toast.makeText(getApplicationContext(),"Three",Toast.LENGTH_SHORT).show();
        }
        if(v==four){
            txtResult.setText("4");
            //txtResult.setText(String.valueOf("0"));
            //txtResult.setText(txtResult.getText()+"4");
            Toast.makeText(getApplicationContext(),"Four",Toast.LENGTH_SHORT).show();
        }
        if(v==five){
            txtResult.setText("5");
            //txtResult.setText(String.valueOf("0"));
            //txtResult.setText(txtResult.getText()+"5");
            Toast.makeText(getApplicationContext(),"Five",Toast.LENGTH_SHORT).show();
        }
        if(v==six){
            txtResult.setText("6");
            //txtResult.setText(String.valueOf("0"));
            //txtResult.setText(txtResult.getText()+"6");
            Toast.makeText(getApplicationContext(),"Six",Toast.LENGTH_SHORT).show();
        }
        if(v==seven){
            txtResult.setText("7");
            //txtResult.setText(String.valueOf("0"));
            //txtResult.setText(txtResult.getText()+"7");
            Toast.makeText(getApplicationContext(),"Seven",Toast.LENGTH_SHORT).show();
        }
        if(v==eight){
            txtResult.setText("8");
            //txtResult.setText(String.valueOf("0"));
            //txtResult.setText(txtResult.getText()+"8");
            Toast.makeText(getApplicationContext(),"Eight",Toast.LENGTH_SHORT).show();
        }
        if(v==nine){
            txtResult.setText("9");
            //txtResult.setText(String.valueOf("0"));
            //txtResult.setText(txtResult.getText()+"9");
            Toast.makeText(getApplicationContext(),"Nine",Toast.LENGTH_SHORT).show();
        }


        if (v==plus){
            num1=Float.parseFloat(txtResult.getText().toString());
            op="+";
            txtResult.setText("");
            //Toast.makeText(getApplicationContext(),"Sum"+num1,Toast.LENGTH_SHORT).show();
        }
        if (v==minus){
            op="-";
            num1=Float.parseFloat(txtResult.getText().toString());
            txtResult.setText("");
            //Toast.makeText(getApplicationContext(),"Sum"+num1,Toast.LENGTH_SHORT).show();
        }
        if (v==divide){
            op="/";
            num1=Float.parseFloat(txtResult.getText().toString());
            txtResult.setText("");
            //Toast.makeText(getApplicationContext(),"Sum"+num1,Toast.LENGTH_SHORT).show();
        }
        if (v==multiple){
            op="*";
            num1=Float.parseFloat(txtResult.getText().toString());
            txtResult.setText("");
            //Toast.makeText(getApplicationContext(),"Sum"+num1,Toast.LENGTH_SHORT).show();
        }


        if (v == equal) {
            num2=Float.parseFloat(txtResult.getText().toString());
            if(op.equals("+")){
                result = num1 + num2;
                //txtResult.setText(Float.toString(result));
                Toast.makeText(getApplicationContext(),"Sum",Toast.LENGTH_SHORT).show();
            }
            if(op.equals("-")){
                result = num1 - num2;
                //txtResult.setText(Float.toString(result));
                Toast.makeText(getApplicationContext(),"Difference",Toast.LENGTH_SHORT).show();
            }
            if(op.equals("*")){
                result = num1 * num2;
                //txtResult.setText(Float.toString(result));
                Toast.makeText(getApplicationContext(),"Product",Toast.LENGTH_SHORT).show();
            }
            if(op.equals("/")){
                result = num1 / num2;
                //txtResult.setText(Float.toString(result));
                Toast.makeText(getApplicationContext(),"Quotient",Toast.LENGTH_SHORT).show();
            }
        }


        if(v==plus_minus){
            temp=Float.parseFloat(txtResult.getText().toString());
            temp=temp*-1;
            txtResult.setText(Float.toString(temp));
        }

        if(v==dot){
            Toast.makeText(getApplicationContext(),"Dot",Toast.LENGTH_SHORT).show();

        }






    }
}

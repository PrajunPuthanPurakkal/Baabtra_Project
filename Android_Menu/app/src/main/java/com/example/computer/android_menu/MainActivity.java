package com.example.computer.android_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.item1)
        {
            Toast.makeText(getApplicationContext(),"Item1 Selected",Toast.LENGTH_SHORT).show();
        }

        if(id==R.id.item2)
        {
            Toast.makeText(getApplicationContext(),"Item2 Selected",Toast.LENGTH_SHORT).show();
        }

        if(id==R.id.item3)
        {
            Toast.makeText(getApplicationContext(),"Item3 Selected",Toast.LENGTH_SHORT).show();
        }

        if(id==R.id.item4)
        {
            Toast.makeText(getApplicationContext(),"Item4 Selected",Toast.LENGTH_SHORT).show();
        }
        return true;

    }
}

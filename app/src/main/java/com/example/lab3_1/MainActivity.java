package com.example.lab3_1;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // layout = (ConstraintLayout)findViewById(R.id.layout_id);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == R.id.red_item) {
            ((ConstraintLayout)findViewById(R.id.layout_id)).setBackgroundColor(Color.RED);
            ((TextView)findViewById(R.id.text_id)).setText("Red");
        }
        else if (item.getItemId() == R.id.green_item) {
            ((ConstraintLayout)findViewById(R.id.layout_id)).setBackgroundColor(Color.GREEN);
            ((TextView)findViewById(R.id.text_id)).setText("Green");
        }
        else if (item.getItemId() == R.id.blue_item) {
            ((ConstraintLayout)findViewById(R.id.layout_id)).setBackgroundColor(Color.BLUE);
            ((TextView)findViewById(R.id.text_id)).setText("Blue");
        }
        else if (item.getItemId() == R.id.yellow_item) {
            ((ConstraintLayout)findViewById(R.id.layout_id)).setBackgroundColor(Color.YELLOW);
            ((TextView)findViewById(R.id.text_id)).setText("Yellow");
        }

        return true;
    }
}

package com.example.shoppingcart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private int[] flags={R.drawable.pizza1,R.drawable.pizza2,R.drawable.pizza3,R.drawable.pizza4,R.drawable.pizza5,R.drawable.pizza6,R.drawable.pizza7,R.drawable.pizza8};
    private String[] pizzaNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listViewId);
        pizzaNames = getResources().getStringArray(R.array.pizza_names);

        CustomAdapter adapter=new CustomAdapter(this,pizzaNames,flags);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=pizzaNames[position];
                Toast.makeText(MainActivity.this,value, Toast.LENGTH_SHORT).show();
            }
        });



    }
}
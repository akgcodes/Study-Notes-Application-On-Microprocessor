package com.minor.microprocessor;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

@SuppressLint("Registered")
public class Topic extends AppCompatActivity {
    ListView listView;
    String[] str={"Introduction","Memories","Instruction set","Addressing mode","Interrupt System","Timing Diagram of 8085","Introduction of 8086","Comparison of 8085 and 8086","Addressing mode of 8086","Introduction of Microcontroller"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);


        listView=findViewById(R.id.list);
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,str);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    startActivity(new Intent(Topic.this,Introduction.class));
                }
                if(position==1)
                {
                    startActivity(new Intent(Topic.this,memories.class));
                }
                if(position==2)
                {
                    startActivity(new Intent(Topic.this,memories.class));
                }
                if(position==3)
                {
                    startActivity(new Intent(Topic.this,addressingmode.class));
                }
                if(position==4)
                {
                    startActivity(new Intent(Topic.this,interrupt.class));
                }
                if(position==5)
                {
                    startActivity(new Intent(Topic.this,timingdiagram.class));
                }
                if(position==6)
                {
                    startActivity(new Intent(Topic.this,intro8086.class));
                }




            }
        });
    }
}

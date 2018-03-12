package com.example.apurva.firstuseofintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   Intent intent;
   Button btn_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btn_next=findViewById(R.id.btn_next_page);
       btn_next.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              intent=new Intent(MainActivity.this,SecondActivity.class);
              startActivity(intent);
           }
       });
    }
}

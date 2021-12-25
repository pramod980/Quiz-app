package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button1;
    private TextView textView;
    private String[] Question={"1. Are you from ASMT clz","2.Are you from Kathmandu city","3. Is pumpkin is your best vegetable","4.Do you like meat","5.Munamadan is your favourite book","6.Your father is a farmer"};
    private boolean[] Answer={true,true,false,true,false,true};
    private int index=0;
    private int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button1=findViewById(R.id.button1);
        textView=findViewById(R.id.textView);
        textView.setText(Question[index]);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<= Question.length-1)
                {
                    if(Answer[index]==true)
                    {
                        score++;
                    }
                    index++;
                    if(index<= Question.length-1)
                    {
                        textView.setText(Question[index]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Your score is:"+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Reastart app", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<= Question.length-1)
                {
                    if(Answer[index]==false)
                    {
                        score++;
                    }
                    index++;
                    if(index<= Question.length-1)
                    {
                        textView.setText(Question[index]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Your score is:"+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Restart app", Toast.LENGTH_SHORT).show();

                }
            }

        });
    }
    public  void Restart_lunch(View view)
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
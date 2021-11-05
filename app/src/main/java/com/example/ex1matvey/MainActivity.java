package com.example.ex1matvey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView forward;
    private EditText name,parol;
    private Button End;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forward = (TextView) findViewById(R.id.Gotoreg);
        name = (EditText) findViewById(R.id.name);
        parol = (EditText) findViewById(R.id.parol);
        End =(Button) findViewById(R.id.end);
    }
    public void goNewActivity(View v){
        switch ( v.getId())
        {
            case R.id.Gotoreg:
                Intent intent =new Intent(this, MainActivity2.class);

                startActivity(intent);
                break;
            default:
                break;
        }
    }
        public void gotoend(View v){
            switch ( v.getId())
            {
                case R.id.end:
                    Intent intent =new Intent(this, Finish.class);
                    intent.putExtra("name", name.getText().toString());
                    intent.putExtra("parol",parol.getText().toString());

                    startActivity(intent);
                    break;
                default:
                    break;
            }
        }
}
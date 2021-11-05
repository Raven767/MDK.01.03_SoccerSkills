package com.example.ex1matvey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Finish extends AppCompatActivity {

    private TextView log,pas;
    private Button ending;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        ending =(Button) findViewById(R.id.button2);
        log = (TextView) findViewById(R.id.login);
        pas = (TextView) findViewById(R.id.parol2);
        String txtlogin = getIntent().getStringExtra("name");
        String txtpas = getIntent().getStringExtra("parol");
        log.setText(log.getText().toString()+" "+txtlogin);
        pas.setText(pas.getText().toString()+" "+txtpas);
    }
    public void backk(View v){
        switch ( v.getId()) {
            case R.id.button2:
                Intent intent =new Intent(this, MainActivity.class);

                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
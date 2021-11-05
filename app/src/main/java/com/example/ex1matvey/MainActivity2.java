package com.example.ex1matvey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button backon,create1;
    private EditText name,mail,parol,parolagain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        backon = (Button) findViewById(R.id.back);
        create1 = (Button) findViewById(R.id.create);
        name = (EditText) findViewById(R.id.Name);
        mail = (EditText) findViewById(R.id.Mail);
        parol = (EditText) findViewById(R.id.Parol);
        parolagain = (EditText) findViewById(R.id.Parolagain);
    }
    public void goNewActivity2(View v){
        switch ( v.getId()) {
            case R.id.back:
                Intent intent =new Intent(this, MainActivity.class);

                startActivity(intent);
                break;
            default:
                break;
        }
    }
    public void chek1(View v){
        switch ( v.getId()) {
            case R.id.create:
                if(name.getText().toString().equals("") || mail.getText().toString().equals("") || parol.getText().toString().equals("") || parolagain.getText().toString().equals("")) {
                    Toast toast = Toast.makeText(this, "Все поля должны быть заполнены",Toast.LENGTH_LONG);
                    toast.show(); }
                else {
                    if(parol.getText().toString().equals(parolagain.getText().toString())) {
                        Toast toast = Toast.makeText(this, "Вы зарегестрировались",Toast.LENGTH_LONG);
                        toast.show(); }
                    else {
                        Toast toast = Toast.makeText(this, "Пароли должны совпадать",Toast.LENGTH_LONG);
                        toast.show(); }
                }
                break;
            default:
                break;
        }
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edittexttext5;

    private EditText edittexttext2;

    private EditText edittexttext3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittexttext5 = findViewById(R.id.editTextText5);
        edittexttext2 = findViewById(R.id.editTextText2);
        edittexttext3 = findViewById(R.id.editTextText3);

    }

    public void somar(View view) {
        int x = Integer.parseInt(edittexttext5.getText().toString());
        int y = Integer.parseInt(edittexttext2.getText().toString());
      int soma = x + y;


        edittexttext3.setText(Integer.toString(x+y));

    }

    public void abrirJanela( View view )  {
        Intent intent = new Intent (this, MainActivity2.class );
        startActivity(intent);

        int x = Integer.parseInt(edittexttext5.getText().toString());
        int y = Integer.parseInt(edittexttext2.getText().toString());
        int soma = x + y;
        String msg = Integer.toString(soma);
        Intent intent = new Intent (this, MainActivity2.class );
        intent.putExtra("soma",msg);
        startActivity(intent);
    }

}
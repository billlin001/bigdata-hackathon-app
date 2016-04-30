package com.example.bill33.bigdatahackathonapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnInput;
    private EditText txtInput;
    private TextView txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInput = (Button) findViewById(R.id.btnInput);
        txtInput = (EditText) findViewById(R.id.txtInput);
        txtOutput = (TextView) findViewById(R.id.txtOutput);

        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOutput.setText(txtInput.getText());
            }
        });
    }
}

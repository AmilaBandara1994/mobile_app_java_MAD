package com.example.madapptest01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView txt_view ;
    Button btn_first;
    Button btn_second ;
    Button btn_third ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn_first = findViewById(R.id.btn_first_id);
        btn_second = findViewById(R.id.btn_second_id);
        btn_third = findViewById(R.id.btn_third_id);
        txt_view = findViewById(R.id.txt_welcome);

        btn_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pageSelected(btn_first);
            }
        });
        btn_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pageSelected(btn_second);
            }
        });
        btn_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pageSelected(btn_third);
            }
        });
    }

    private void pageSelected(Button btn){
        txt_view.setText(btn.getText());
        if(btn.getId() == this.btn_first.getId()){
            txt_view.setText(btn.getText());
        } else if (btn.getId() == this.btn_second.getId()) {
            txt_view.setText(btn.getText());
        } else if (btn.getId() == this.btn_third.getId()) {
            txt_view.setText(btn.getText());
        }
    }
}
package com.daniel.u1_a3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
//        Asignamos texto al boton
        final TextView t = findViewById(R.id.btn1);
        final Button btn1 = findViewById(R.id.btn1);
        t.setText("Presionar");
//        Asignamos acción al boton
        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegundaActividad.class);
                intent.putExtra(EXTRA_MESSAGE, "Mensaje");
                startActivity(intent);
            }
        });


    }
}

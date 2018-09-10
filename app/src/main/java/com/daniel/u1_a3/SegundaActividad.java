package com.daniel.u1_a3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        TextView tv = findViewById(R.id.tv);

        tv.setText("Actividad_3");
    }
}

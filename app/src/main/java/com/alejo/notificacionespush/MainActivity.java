package com.alejo.notificacionespush;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {
    private TextView tvToken;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         tvToken = findViewById(R.id.idToken);

        String tokenDispositivo = FirebaseInstanceId.getInstance().getToken();

        tvToken.setText(tokenDispositivo);
        System.out.println("Token: " +tokenDispositivo);



    }
}
